
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object addRoll extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""


"""),format.raw/*6.1*/("""<h3>  """),_display_(/*6.8*/message),format.raw/*6.15*/(""" """),format.raw/*6.16*/("""</h3>

<form action=""""),_display_(/*8.16*/routes/*8.22*/.Application.addRoll()),format.raw/*8.44*/("""" method="post" enctype="multipart/form-data">

    Name: <input type="text" name="name" style="margin: 3px;"/> <br/>
    Weight: <input type="number" name="weight" style="width: 40px;margin: 3px;"/> <br/>
    Description: <input type="text" name="description"/><br/>
    Image: <input type="file" name="photo" id="photo"/><br/>
    <button style="margin: 3px;">Add</button>

</form>


<br/>



<button onclick="getRollsFromDB()">getFromDB</button>


        <div id="contentFromDB">

        </div>



<script type="text/javascript">
    function getRollsFromDB()"""),format.raw/*33.30*/("""{"""),format.raw/*33.31*/("""
        """),format.raw/*34.9*/("""$.get( """"),_display_(/*34.18*/routes/*34.24*/.Application.getRolls()),format.raw/*34.47*/("""", function( data ) """),format.raw/*34.67*/("""{"""),format.raw/*34.68*/("""

          """),format.raw/*36.11*/("""var out = $('#contentFromDB');
          $(out).append("<ul>");
          for(var i = 0; i < data.length; i++)"""),format.raw/*38.47*/("""{"""),format.raw/*38.48*/("""
            """),format.raw/*39.13*/("""$(out).append("<li>"+data[i].name+"</li>");
          """),format.raw/*40.11*/("""}"""),format.raw/*40.12*/("""
          """),format.raw/*41.11*/("""$(out).append("</ul>");

        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/(""");
    """),format.raw/*44.5*/("""}"""),format.raw/*44.6*/("""

"""),format.raw/*46.1*/("""</script>

""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Feb 21 18:59:44 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/addRoll.scala.html
                  HASH: 8c5670e977140778cda25c482e3eea730f1d1630
                  MATRIX: 725->1|830->18|858->21|889->44|928->46|957->49|989->56|1016->63|1044->64|1092->86|1106->92|1148->114|1740->678|1769->679|1805->688|1841->697|1856->703|1900->726|1948->746|1977->747|2017->759|2155->869|2184->870|2225->883|2307->937|2336->938|2375->949|2435->982|2464->983|2498->990|2526->991|2555->993
                  LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|34->6|36->8|36->8|36->8|61->33|61->33|62->34|62->34|62->34|62->34|62->34|62->34|64->36|66->38|66->38|67->39|68->40|68->40|69->41|71->43|71->43|72->44|72->44|74->46
                  -- GENERATED --
              */
          