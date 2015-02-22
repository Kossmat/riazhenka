// @SOURCE:/Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/conf/routes
// @HASH:73fde72cef1c4869703284b8f216a4ff6ed04b04
// @DATE:Mon Feb 23 00:53:15 MSK 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:35
// @LINE:31
// @LINE:29
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:12
// @LINE:10
// @LINE:6
package controllers {

// @LINE:12
// @LINE:10
class ReverseAdmin {


// @LINE:10
def myRender(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                        

// @LINE:12
def adminSQL(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "adminSQL")
}
                        

}
                          

// @LINE:31
// @LINE:29
class ReverseJsAjax {


// @LINE:31
def getItem(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "testGET/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:29
def javascriptRoutes(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "javascriptRoutes")
}
                        

}
                          

// @LINE:35
class ReverseAssets {


// @LINE:35
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:25
def getRolls(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "rolls")
}
                        

// @LINE:19
def indexRoll(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "roll")
}
                        

// @LINE:21
def addRoll(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addRoll")
}
                        

// @LINE:23
def renderImage(rollId:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getImage/" + implicitly[PathBindable[String]].unbind("rollId", dynamicString(rollId)))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:35
// @LINE:31
// @LINE:29
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:12
// @LINE:10
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:12
// @LINE:10
class ReverseAdmin {


// @LINE:10
def myRender : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.myRender",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:12
def adminSQL : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.adminSQL",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adminSQL"})
      }
   """
)
                        

}
              

// @LINE:31
// @LINE:29
class ReverseJsAjax {


// @LINE:31
def getItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JsAjax.getItem",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testGET/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:29
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JsAjax.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascriptRoutes"})
      }
   """
)
                        

}
              

// @LINE:35
class ReverseAssets {


// @LINE:35
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:25
def getRolls : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getRolls",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rolls"})
      }
   """
)
                        

// @LINE:19
def indexRoll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.indexRoll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "roll"})
      }
   """
)
                        

// @LINE:21
def addRoll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addRoll",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addRoll"})
      }
   """
)
                        

// @LINE:23
def renderImage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.renderImage",
   """
      function(rollId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getImage/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("rollId", encodeURIComponent(rollId))})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:35
// @LINE:31
// @LINE:29
// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:12
// @LINE:10
// @LINE:6
package controllers.ref {


// @LINE:12
// @LINE:10
class ReverseAdmin {


// @LINE:10
def myRender(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.myRender(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Admin", "myRender", Seq(), "GET", """""", _prefix + """admin""")
)
                      

// @LINE:12
def adminSQL(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.adminSQL(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Admin", "adminSQL", Seq(), "POST", """""", _prefix + """adminSQL""")
)
                      

}
                          

// @LINE:31
// @LINE:29
class ReverseJsAjax {


// @LINE:31
def getItem(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JsAjax.getItem(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.JsAjax", "getItem", Seq(classOf[Integer]), "GET", """""", _prefix + """testGET/$id<[^/]+>""")
)
                      

// @LINE:29
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JsAjax.javascriptRoutes(), HandlerDef(this.getClass.getClassLoader, "", "controllers.JsAjax", "javascriptRoutes", Seq(), "GET", """""", _prefix + """javascriptRoutes""")
)
                      

}
                          

// @LINE:35
class ReverseAssets {


// @LINE:35
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:25
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:25
def getRolls(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getRolls(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getRolls", Seq(), "GET", """""", _prefix + """rolls""")
)
                      

// @LINE:19
def indexRoll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.indexRoll(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "indexRoll", Seq(), "GET", """""", _prefix + """roll""")
)
                      

// @LINE:21
def addRoll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addRoll(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRoll", Seq(), "POST", """""", _prefix + """addRoll""")
)
                      

// @LINE:23
def renderImage(rollId:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.renderImage(rollId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "renderImage", Seq(classOf[String]), "GET", """""", _prefix + """getImage/$rollId<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    