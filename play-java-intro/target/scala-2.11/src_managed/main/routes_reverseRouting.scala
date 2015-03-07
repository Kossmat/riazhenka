// @SOURCE:/Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/conf/routes
// @HASH:bffb21beecb51f4cb409f6d217295e67767a6e82
// @DATE:Sat Mar 07 17:21:39 MSK 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:36
// @LINE:32
// @LINE:30
// @LINE:23
// @LINE:21
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:6
package controllers {

// @LINE:23
// @LINE:21
class ReverseAdmin {


// @LINE:21
def myRender(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                        

// @LINE:23
def adminSQL(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "adminSQL")
}
                        

}
                          

// @LINE:32
// @LINE:30
class ReverseJsAjax {


// @LINE:32
def getItem(id:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "testGET/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                        

// @LINE:30
def javascriptRoutes(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "javascriptRoutes")
}
                        

}
                          

// @LINE:36
class ReverseAssets {


// @LINE:36
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:6
class ReverseApplication {


// @LINE:10
def indexProduct(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "product")
}
                        

// @LINE:12
def addProduct(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addProduct")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:14
def getProducts(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "products")
}
                        

}
                          
}
                  


// @LINE:36
// @LINE:32
// @LINE:30
// @LINE:23
// @LINE:21
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:23
// @LINE:21
class ReverseAdmin {


// @LINE:21
def myRender : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.myRender",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:23
def adminSQL : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.adminSQL",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adminSQL"})
      }
   """
)
                        

}
              

// @LINE:32
// @LINE:30
class ReverseJsAjax {


// @LINE:32
def getItem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JsAjax.getItem",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testGET/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:30
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.JsAjax.javascriptRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascriptRoutes"})
      }
   """
)
                        

}
              

// @LINE:36
class ReverseAssets {


// @LINE:36
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:6
class ReverseApplication {


// @LINE:10
def indexProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.indexProduct",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product"})
      }
   """
)
                        

// @LINE:12
def addProduct : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addProduct",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addProduct"})
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
                        

// @LINE:14
def getProducts : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getProducts",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
      }
   """
)
                        

}
              
}
        


// @LINE:36
// @LINE:32
// @LINE:30
// @LINE:23
// @LINE:21
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:6
package controllers.ref {


// @LINE:23
// @LINE:21
class ReverseAdmin {


// @LINE:21
def myRender(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.myRender(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Admin", "myRender", Seq(), "GET", """""", _prefix + """admin""")
)
                      

// @LINE:23
def adminSQL(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.adminSQL(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Admin", "adminSQL", Seq(), "POST", """""", _prefix + """adminSQL""")
)
                      

}
                          

// @LINE:32
// @LINE:30
class ReverseJsAjax {


// @LINE:32
def getItem(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JsAjax.getItem(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.JsAjax", "getItem", Seq(classOf[Integer]), "GET", """""", _prefix + """testGET/$id<[^/]+>""")
)
                      

// @LINE:30
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.JsAjax.javascriptRoutes(), HandlerDef(this.getClass.getClassLoader, "", "controllers.JsAjax", "javascriptRoutes", Seq(), "GET", """""", _prefix + """javascriptRoutes""")
)
                      

}
                          

// @LINE:36
class ReverseAssets {


// @LINE:36
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:6
class ReverseApplication {


// @LINE:10
def indexProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.indexProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "indexProduct", Seq(), "GET", """""", _prefix + """product""")
)
                      

// @LINE:12
def addProduct(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addProduct(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addProduct", Seq(), "POST", """""", _prefix + """addProduct""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:14
def getProducts(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getProducts(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getProducts", Seq(), "GET", """""", _prefix + """products""")
)
                      

}
                          
}
        
    