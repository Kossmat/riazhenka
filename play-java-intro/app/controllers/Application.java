package controllers;

import models.Person;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;


public class Application extends Controller {

    public static Result index() {

        return ok(index.render("Hello World! =)"));

    }

    public static Result test(){

        //return ok(test.render("hello"));
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.save();
        return redirect(routes.Application.index());

    }

}
