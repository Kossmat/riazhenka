package controllers;

import models.Person;
import models.Roll;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.addRoll;
import views.html.index;
import views.html.indexPerson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static play.libs.Json.toJson;


public class Application extends Controller {

    public static Result index(){

        List<Roll> rolls = new Model.Finder(String.class, Roll.class).all();

        List<Map<String,String>> strRolls = new ArrayList<>();

        for (Roll item : rolls) {

            Map<String,String> propToValMap = new HashMap<>();

            propToValMap.put("name", item.name);

            propToValMap.put("description", item.description);

            //TODO add price property

            strRolls.add(propToValMap);
        }

        return ok(index.render("index page v 0.0001", strRolls));

    }

    public static Result indexPerson() {

        return ok(indexPerson.render("addPerson page"));

    }

    public static Result addPerson(){

        //return ok(test.render("hello"));
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.save();
        return redirect(routes.Application.index());

    }

    public static Result getPersons(){
        List<Person> persons = new Model.Finder(String.class, Person.class).all();
        return ok(toJson(persons));
    }



    public static Result indexRoll(){
        return ok(addRoll.render("add Roll page"));
    }

    public static Result addRoll(){
        Roll roll = Form.form(Roll.class).bindFromRequest().get();
        roll.save();
        return redirect(routes.Application.indexRoll());
    }

    public static Result getRolls(){
        List<Roll> rolls = new Model.Finder(String.class, Roll.class).all();
        return ok(toJson(rolls));
    }




}
