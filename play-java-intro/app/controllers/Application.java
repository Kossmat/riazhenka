package controllers;

import models.Product;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import views.html.index;
import views.html.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static play.libs.Json.toJson;


public class Application extends Controller {

    public static Result index(){

        List<Product> products = new Model.Finder(String.class, Product.class).all();

        List<Map<String,Object>> strProducts = new ArrayList<>();

        for (Product item : products) {

            Map<String,Object> propToValMap = new HashMap<>();

            propToValMap.put("name", item.name);

            propToValMap.put("Id", item.Id);

            propToValMap.put("description", item.description);

            propToValMap.put("price", item.price);

            propToValMap.put("imgSrc", item.imageSrc);

            strProducts.add(propToValMap);
        }

        return ok(index.render("index page v 0.00022", strProducts));

    }


    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for Product

    public static Result indexProduct(){
        return ok(addProduct.render("add Product page"));
    }

    public static Result addProduct(){

        Product product = new Product();

        //roll.image = bFile;

        String name = Form.form(String.class).bindFromRequest().apply("name1").value();

        product.name = name;

        Integer weight = Integer.valueOf(Form.form(String.class).bindFromRequest().apply("weight1").value());

        product.weight = weight;

        Double price = Double.valueOf(Form.form(String.class).bindFromRequest().apply("price1").value());

        product.price = price;

        String description = Form.form(String.class).bindFromRequest().apply("description1").value();

        product.description = description;

        product.save();

        //System.out.println(product.Id);

        //get file
        Http.MultipartFormData body = request().body().asMultipartFormData();

        Http.MultipartFormData.FilePart picture = body.getFile("photo1");


        Pattern p = Pattern.compile("\\.\\w+$");
        Matcher matcher;
        matcher = p.matcher(picture.getFilename());
        matcher.find();
        String sufix = matcher.group();

        //System.out.println(sufix);


        File photo = picture.getFile();

        //save file to another dir
        String myUploadPath = "/Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/public/images/product_img/";
        String fileName = ""+product.Id + "" + sufix;
        photo.renameTo(new File(myUploadPath,fileName));

        product.imageSrc = "images/product_img/"+fileName;

        product.save();

        //System.out.println(product.imageSrc);

        return redirect(routes.Application.indexProduct());
    }

    public static Result getProducts(){

        List<Product> products = new Model.Finder(String.class, Product.class).all();

        return ok(toJson(products));

    }


}
