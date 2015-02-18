// @SOURCE:/Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/conf/routes
// @HASH:a99b6d69ed5223c51f85321c846d36b29c812ffa
// @DATE:Thu Feb 19 01:53:55 MSK 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:39
// @LINE:34
// @LINE:32
// @LINE:30
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
                          

// @LINE:39
class ReverseAssets {


// @LINE:39
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:34
def getRolls(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "rolls")
}
                        

// @LINE:30
def indexRoll(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "roll")
}
                        

// @LINE:21
def addPerson(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addPerson")
}
                        

// @LINE:23
def getPersons(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "persons")
}
                        

// @LINE:19
def indexPerson(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "person")
}
                        

// @LINE:32
def addRoll(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addRoll")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:39
// @LINE:34
// @LINE:32
// @LINE:30
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
              

// @LINE:39
class ReverseAssets {


// @LINE:39
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:34
def getRolls : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getRolls",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rolls"})
      }
   """
)
                        

// @LINE:30
def indexRoll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.indexRoll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "roll"})
      }
   """
)
                        

// @LINE:21
def addPerson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addPerson",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addPerson"})
      }
   """
)
                        

// @LINE:23
def getPersons : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getPersons",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons"})
      }
   """
)
                        

// @LINE:19
def indexPerson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.indexPerson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
      }
   """
)
                        

// @LINE:32
def addRoll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addRoll",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addRoll"})
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
        


// @LINE:39
// @LINE:34
// @LINE:32
// @LINE:30
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
                          

// @LINE:39
class ReverseAssets {


// @LINE:39
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:6
class ReverseApplication {


// @LINE:34
def getRolls(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getRolls(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getRolls", Seq(), "GET", """""", _prefix + """rolls""")
)
                      

// @LINE:30
def indexRoll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.indexRoll(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "indexRoll", Seq(), "GET", """""", _prefix + """roll""")
)
                      

// @LINE:21
def addPerson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addPerson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addPerson", Seq(), "POST", """""", _prefix + """addPerson""")
)
                      

// @LINE:23
def getPersons(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getPersons(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getPersons", Seq(), "GET", """""", _prefix + """persons""")
)
                      

// @LINE:19
def indexPerson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.indexPerson(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "indexPerson", Seq(), "GET", """""", _prefix + """person""")
)
                      

// @LINE:32
def addRoll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addRoll(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addRoll", Seq(), "POST", """""", _prefix + """addRoll""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    