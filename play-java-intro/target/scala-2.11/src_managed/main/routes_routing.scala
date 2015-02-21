// @SOURCE:/Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/conf/routes
// @HASH:73fde72cef1c4869703284b8f216a4ff6ed04b04
// @DATE:Sat Feb 21 23:09:49 MSK 2015


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
private[this] lazy val controllers_Admin_myRender1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
private[this] lazy val controllers_Admin_myRender1_invoker = createInvoker(
controllers.Admin.myRender(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Admin", "myRender", Nil,"GET", """""", Routes.prefix + """admin"""))
        

// @LINE:12
private[this] lazy val controllers_Admin_adminSQL2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("adminSQL"))))
private[this] lazy val controllers_Admin_adminSQL2_invoker = createInvoker(
controllers.Admin.adminSQL(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Admin", "adminSQL", Nil,"POST", """""", Routes.prefix + """adminSQL"""))
        

// @LINE:19
private[this] lazy val controllers_Application_indexRoll3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("roll"))))
private[this] lazy val controllers_Application_indexRoll3_invoker = createInvoker(
controllers.Application.indexRoll(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "indexRoll", Nil,"GET", """""", Routes.prefix + """roll"""))
        

// @LINE:21
private[this] lazy val controllers_Application_addRoll4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addRoll"))))
private[this] lazy val controllers_Application_addRoll4_invoker = createInvoker(
controllers.Application.addRoll(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRoll", Nil,"POST", """""", Routes.prefix + """addRoll"""))
        

// @LINE:23
private[this] lazy val controllers_Application_renderImage5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getImage/"),DynamicPart("rollId", """[^/]+""",true))))
private[this] lazy val controllers_Application_renderImage5_invoker = createInvoker(
controllers.Application.renderImage(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderImage", Seq(classOf[String]),"GET", """""", Routes.prefix + """getImage/$rollId<[^/]+>"""))
        

// @LINE:25
private[this] lazy val controllers_Application_getRolls6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rolls"))))
private[this] lazy val controllers_Application_getRolls6_invoker = createInvoker(
controllers.Application.getRolls(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getRolls", Nil,"GET", """""", Routes.prefix + """rolls"""))
        

// @LINE:29
private[this] lazy val controllers_JsAjax_javascriptRoutes7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("javascriptRoutes"))))
private[this] lazy val controllers_JsAjax_javascriptRoutes7_invoker = createInvoker(
controllers.JsAjax.javascriptRoutes(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JsAjax", "javascriptRoutes", Nil,"GET", """""", Routes.prefix + """javascriptRoutes"""))
        

// @LINE:31
private[this] lazy val controllers_JsAjax_getItem8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("testGET/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_JsAjax_getItem8_invoker = createInvoker(
controllers.JsAjax.getItem(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.JsAjax", "getItem", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """testGET/$id<[^/]+>"""))
        

// @LINE:35
private[this] lazy val controllers_Assets_at9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Admin.myRender()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """adminSQL""","""controllers.Admin.adminSQL()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """roll""","""controllers.Application.indexRoll()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addRoll""","""controllers.Application.addRoll()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getImage/$rollId<[^/]+>""","""controllers.Application.renderImage(rollId:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rolls""","""controllers.Application.getRolls()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """javascriptRoutes""","""controllers.JsAjax.javascriptRoutes()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """testGET/$id<[^/]+>""","""controllers.JsAjax.getItem(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Admin_myRender1_route(params) => {
   call { 
        controllers_Admin_myRender1_invoker.call(controllers.Admin.myRender())
   }
}
        

// @LINE:12
case controllers_Admin_adminSQL2_route(params) => {
   call { 
        controllers_Admin_adminSQL2_invoker.call(controllers.Admin.adminSQL())
   }
}
        

// @LINE:19
case controllers_Application_indexRoll3_route(params) => {
   call { 
        controllers_Application_indexRoll3_invoker.call(controllers.Application.indexRoll())
   }
}
        

// @LINE:21
case controllers_Application_addRoll4_route(params) => {
   call { 
        controllers_Application_addRoll4_invoker.call(controllers.Application.addRoll())
   }
}
        

// @LINE:23
case controllers_Application_renderImage5_route(params) => {
   call(params.fromPath[String]("rollId", None)) { (rollId) =>
        controllers_Application_renderImage5_invoker.call(controllers.Application.renderImage(rollId))
   }
}
        

// @LINE:25
case controllers_Application_getRolls6_route(params) => {
   call { 
        controllers_Application_getRolls6_invoker.call(controllers.Application.getRolls())
   }
}
        

// @LINE:29
case controllers_JsAjax_javascriptRoutes7_route(params) => {
   call { 
        controllers_JsAjax_javascriptRoutes7_invoker.call(controllers.JsAjax.javascriptRoutes())
   }
}
        

// @LINE:31
case controllers_JsAjax_getItem8_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_JsAjax_getItem8_invoker.call(controllers.JsAjax.getItem(id))
   }
}
        

// @LINE:35
case controllers_Assets_at9_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     