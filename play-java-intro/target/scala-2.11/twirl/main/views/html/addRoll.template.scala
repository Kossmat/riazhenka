
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

"""),format.raw/*5.1*/("""<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>

<h3>  """),_display_(/*7.8*/message),format.raw/*7.15*/(""" """),format.raw/*7.16*/("""</h3>

<form action=""""),_display_(/*9.16*/routes/*9.22*/.Application.addRoll()),format.raw/*9.44*/("""" method="post">
    Name: <input type="text" name="name" style="margin: 3px;"/> <br/>
    Weight: <input type="number" name="weight" style="width: 40px;margin: 3px;"/> <br/>
    Description: <input type="text" name="description"/><br/>
    <button style="margin: 3px;">Add</button>

</form>



<button onclick="foo()">getFromDB</button>


        <div id="contentFromDB">

        </div>



<script type="text/javascript">
    function foo()"""),format.raw/*29.19*/("""{"""),format.raw/*29.20*/("""


        """),format.raw/*32.9*/("""$.get( """"),_display_(/*32.18*/routes/*32.24*/.Application.getRolls()),format.raw/*32.47*/("""", function( data ) """),format.raw/*32.67*/("""{"""),format.raw/*32.68*/("""

          """),format.raw/*34.11*/("""var out = $('#contentFromDB');
          $(out).append("<ul>");
          for(var i = 0; i < data.length; i++)"""),format.raw/*36.47*/("""{"""),format.raw/*36.48*/("""
            """),format.raw/*37.13*/("""$(out).append("<li>"+data[i].name+"</li>");
          """),format.raw/*38.11*/("""}"""),format.raw/*38.12*/("""
          """),format.raw/*39.11*/("""$(out).append("</ul>");

        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/(""");
    """),format.raw/*42.5*/("""}"""),format.raw/*42.6*/("""
"""),format.raw/*43.1*/("""</script>

""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 19 01:53:56 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/addRoll.scala.html
                  HASH: 07a42dfa179eac5cfa94a250324ff66ce12c5dbe
                  MATRIX: 725->1|830->18|858->21|889->44|928->46|956->48|1080->147|1107->154|1135->155|1183->177|1197->183|1239->205|1709->647|1738->648|1776->659|1812->668|1827->674|1871->697|1919->717|1948->718|1988->730|2126->840|2155->841|2196->854|2278->908|2307->909|2346->920|2406->953|2435->954|2469->961|2497->962|2525->963
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|35->7|35->7|35->7|37->9|37->9|37->9|57->29|57->29|60->32|60->32|60->32|60->32|60->32|60->32|62->34|64->36|64->36|65->37|66->38|66->38|67->39|69->41|69->41|70->42|70->42|71->43
                  -- GENERATED --
              */
          