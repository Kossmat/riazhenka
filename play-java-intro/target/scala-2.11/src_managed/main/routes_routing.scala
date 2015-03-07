// @SOURCE:/Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/conf/routes
// @HASH:bffb21beecb51f4cb409f6d217295e67767a6e82
// @DATE:Sat Mar 07 17:21:39 MSK 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:10
private[this] lazy val controllers_Application_indexProduct1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product"))))
private[this] lazy val controllers_Application_indexProduct1_invoker = createInvoker(
controllers.Application.indexProduct(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "indexProduct", Nil,"GET", """""", Routes.prefix + """product"""))
        

// @LINE:12
private[this] lazy val controllers_Application_addProduct2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addProduct"))))
private[this] lazy val controllers_Application_addProduct2_invoker = createInvoker(
controllers.Application.addProduct(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addProduct", Nil,"POST", """""", Routes.prefix + """addProduct"""))
        

// @LINE:14
private[this] lazy val controllers_Application_getProducts3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products"))))
private[this] lazy val controllers_Application_getProducts3_invoker = createInvoker(
controllers.Application.getProducts(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getProducts", Nil,"GET", """""", Routes.prefix + """products"""))
        

// @LINE:21
private[this] lazy val controllers_Admin_myRender4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
private[this] lazy val controllers_Admin_myRender4_invoker = createInvoker(
controllers.Admin.myRender(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Admin", "myRender", Nil,"GET", """""", Routes.prefix + """admin"""))
        

// @LINE:23
private[this] lazy val controllers_Admin_adminSQL5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("adminSQL"))))
private[this] lazy val controllers_Admin_adminSQL5_invoker = createInvoker(
controllers.Admin.adminSQL(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Admin", "adminSQL", Nil,"POST", """""", Routes.prefix + """adminSQL"""))
        

// @LINE:30
private[this] lazy val controllers_JsAjax_javascriptRoutes6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("javascriptRoutes"))))
private[this] lazy val controllers_JsAjax_javascriptRoutes6_invoker = createInvoker(
controllers.JsAjax.javascriptRoutes(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JsAjax", "javascriptRoutes", Nil,"GET", """""", Routes.prefix + """javascriptRoutes"""))
        

// @LINE:32
private[this] lazy val controllers_JsAjax_getItem7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("testGET/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_JsAjax_getItem7_invoker = createInvoker(
controllers.JsAjax.getItem(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JsAjax", "getItem", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """testGET/$id<[^/]+>"""))
        

// @LINE:36
private[this] lazy val controllers_Assets_at8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product""","""controllers.Application.indexProduct()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addProduct""","""controllers.Application.addProduct()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""","""controllers.Application.getProducts()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Admin.myRender()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """adminSQL""","""controllers.Admin.adminSQL()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """javascriptRoutes""","""controllers.JsAjax.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """testGET/$id<[^/]+>""","""controllers.JsAjax.getItem(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:10
case controllers_Application_indexProduct1_route(params) => {
   call { 
        controllers_Application_indexProduct1_invoker.call(controllers.Application.indexProduct())
   }
}
        

// @LINE:12
case controllers_Application_addProduct2_route(params) => {
   call { 
        controllers_Application_addProduct2_invoker.call(controllers.Application.addProduct())
   }
}
        

// @LINE:14
case controllers_Application_getProducts3_route(params) => {
   call { 
        controllers_Application_getProducts3_invoker.call(controllers.Application.getProducts())
   }
}
        

// @LINE:21
case controllers_Admin_myRender4_route(params) => {
   call { 
        controllers_Admin_myRender4_invoker.call(controllers.Admin.myRender())
   }
}
        

// @LINE:23
case controllers_Admin_adminSQL5_route(params) => {
   call { 
        controllers_Admin_adminSQL5_invoker.call(controllers.Admin.adminSQL())
   }
}
        

// @LINE:30
case controllers_JsAjax_javascriptRoutes6_route(params) => {
   call { 
        controllers_JsAjax_javascriptRoutes6_invoker.call(controllers.JsAjax.javascriptRoutes())
   }
}
        

// @LINE:32
case controllers_JsAjax_getItem7_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_JsAjax_getItem7_invoker.call(controllers.JsAjax.getItem(id))
   }
}
        

// @LINE:36
case controllers_Assets_at8_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     