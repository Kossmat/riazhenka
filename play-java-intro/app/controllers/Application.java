package controllers;

import models.Roll;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.addRoll;
import views.html.index;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static play.libs.Json.toJson;


public class Application extends Controller {

    public static Result index(){

        List<Roll> rolls = new Model.Finder(String.class, Roll.class).all();

        List<Map<String,Object>> strRolls = new ArrayList<>();

        for (Roll item : rolls) {

            Map<String,Object> propToValMap = new HashMap<>();

            propToValMap.put("name", item.name);

            propToValMap.put("Id", item.Id);

            propToValMap.put("description", item.description);

            propToValMap.put("price", item.price);

            strRolls.add(propToValMap);
        }

        return ok(index.render("index page v 0.00022", strRolls));

    }



    public static Result indexRoll(){
        return ok(addRoll.render("add Roll page"));
    }

    public static Result addRoll() throws SQLException {

        Http.MultipartFormData body = request().body().asMultipartFormData();

        Http.MultipartFormData.FilePart picture = body.getFile("photo");

        File photo = picture.getFile();

        byte[] bFile = new byte[(int) photo.length()];

        try {

            FileInputStream fis = new FileInputStream(photo);

            fis.read(bFile);

            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        Roll roll = new Roll();

        roll.image = bFile;

        String name = Form.form(String.class).bindFromRequest().apply("name").value();

        roll.name = name;

        Integer weight = Integer.valueOf(Form.form(String.class).bindFromRequest().apply("weight").value());

        roll.weight = weight;

        Double price = Double.valueOf(Form.form(String.class).bindFromRequest().apply("price").value());

        roll.price = price;

        String description = Form.form(String.class).bindFromRequest().apply("description").value();

        roll.description = description;

        roll.save();

        return redirect(routes.Application.indexRoll());
    }

    public static Result renderImage(String rollId) throws SQLException {

        Model.Finder f = new Model.Finder(String.class, Roll.class);
        Roll roll = (Roll) f.ref(rollId);
        //System.out.println(roll.image);
        return ok(roll.image).as("image/jpg");

    }

    public static Result getRolls(){
        List<Roll> rolls = new Model.Finder(String.class, Roll.class).all();
        return ok(toJson(rolls));
    }


}
