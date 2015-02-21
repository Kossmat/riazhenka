package controllers;


import play.Routes;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;

import static play.libs.Json.toJson;

public class JsAjax extends Controller{

    public static Result javascriptRoutes() {
        response().setContentType("text/javascript");
        return ok(
            Routes.javascriptRouter("myJsRoutes",
                routes.javascript.JsAjax.getItem()
            )
        );
    }

    public static Result getItem(Integer id){

        System.out.println(id);

        List<String> l = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            l.add("test");
        }

        return ok(toJson(l));
    }

}
