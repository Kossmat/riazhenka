package controllers;

import models.Roll;
import play.data.Form;
import play.db.DB;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static play.libs.Json.toJson;


public class Admin extends Controller {

    private static List<String> queryResult;

    public static List<String> getQueryResult(){
        return Admin.queryResult;
    }
    public static void setQueryResult(List<String> toSet){
        Admin.queryResult = toSet;
    }

    public static Result myRender() throws ClassNotFoundException {

        List<String> queryResult = getQueryResult();

        if(queryResult == null){

            queryResult = new ArrayList<>();

        }
        return ok(test.render("admin page v0.002", getModel(), queryResult));
    }

    public static String getRolls(){
        //oql
        //List<Roll> rolls = new Model.Finder(String.class, Roll.class).where().isNotNull("description").findList();
        List<Roll> rolls = new Model.Finder(String.class, Roll.class).all();

        return String.valueOf(toJson(rolls));
    }

    public static String rollsSearch(int id){
        //String id = "41";
        List<Roll> rolls = new Model.Finder(String.class, Roll.class).where().idEq(id).findList();

        return String.valueOf(toJson(rolls));
    }

    public static List<String> getModel() throws ClassNotFoundException {

        List<String> model = new ArrayList<>();

        model.add(String.valueOf(Roll.class));

        return model;

    }


    public static Result testGET(){
        String e = "";
        System.out.println("e = "+e);

        return (Result) toJson("test");

    }



    public static Result adminSQL() throws SQLException {

        String query = Form.form(String.class).bindFromRequest().apply("query").value();

        List<String> result = doSQL(query);

//        for(String item : result){
//            System.out.println(item);
//        }

        setQueryResult(result);

        return redirect(routes.Admin.myRender());
    }

    public static Result getImage(long id) throws SQLException {

        String query = "select image from Roll where id="+id+"";

        List<String> result = doSQL(query);

        System.out.println(result.size());

        String r = result.get(0).substring(7, result.get(0).length()-1);

        return ok(r);
    }


    public static List<String> doSQL(String query) throws SQLException {

        //lets try sql
        Connection conn = DB.getConnection();

        Statement statement = conn.createStatement();

        String sql = conn.nativeSQL(query);

        ResultSet result = statement.executeQuery(sql);

        String firstRow = "";

        List<String> resultList = new ArrayList<String>();

        while(result.next()){

            int columnCount = result.getMetaData().getColumnCount();

            for(int i = 1; i <= columnCount; i++){

                firstRow += result.getMetaData().getColumnName(i) + " : ";

                firstRow += result.getString(i) + "; ";

            }

            resultList.add(firstRow);

            firstRow = "";

        }

        result.close();
        statement.close();
        conn.close();

        return resultList;
    }
}
