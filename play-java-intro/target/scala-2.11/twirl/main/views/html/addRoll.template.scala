
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

"""),format.raw/*5.1*/("""<style type="text/css">

    form"""),format.raw/*7.9*/("""{"""),format.raw/*7.10*/("""
        """),format.raw/*8.9*/("""margin: 5px;
    """),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""

    """),format.raw/*11.5*/("""input"""),format.raw/*11.10*/("""{"""),format.raw/*11.11*/("""
        """),format.raw/*12.9*/("""margin: 3px;
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""

    """),format.raw/*15.5*/("""input[type=number] """),format.raw/*15.24*/("""{"""),format.raw/*15.25*/("""
        """),format.raw/*16.9*/("""width: 60px;
        margin: 3px;
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""

    """),format.raw/*20.5*/("""form > button"""),format.raw/*20.18*/("""{"""),format.raw/*20.19*/("""
        """),format.raw/*21.9*/("""width: 50px;
        margin: 4px;
    """),format.raw/*23.5*/("""}"""),format.raw/*23.6*/("""

"""),format.raw/*25.1*/("""</style>

<h3>  """),_display_(/*27.8*/message),format.raw/*27.15*/(""" """),format.raw/*27.16*/("""</h3>

<form action=""""),_display_(/*29.16*/routes/*29.22*/.Application.addRoll()),format.raw/*29.44*/("""" method="post" enctype="multipart/form-data">

    Name: <input type="text" name="name" id="name"/> <br/>
    Price: <input type="number" name="price" id="price"><br/>
    Weight: <input type="number" name="weight" id="weight"/> <br/>
    Description: <input type="text" name="description" id="description"/><br/>
    Image: <input type="file" name="photo" id="photo"/><br/>
    <button>Add</button>

</form>


<br/>



<button onclick="getRollsFromDB()">getFromDB</button>


        <div id="contentFromDB">

        </div>



<script type="text/javascript">
    function getRollsFromDB()"""),format.raw/*55.30*/("""{"""),format.raw/*55.31*/("""
        """),format.raw/*56.9*/("""$.get( """"),_display_(/*56.18*/routes/*56.24*/.Application.getRolls()),format.raw/*56.47*/("""", function( data ) """),format.raw/*56.67*/("""{"""),format.raw/*56.68*/("""

          """),format.raw/*58.11*/("""var out = $('#contentFromDB');
          $(out).append("<ul>");
          for(var i = 0; i < data.length; i++)"""),format.raw/*60.47*/("""{"""),format.raw/*60.48*/("""
            """),format.raw/*61.13*/("""$(out).append("<li>"+data[i].name+"</li>");
          """),format.raw/*62.11*/("""}"""),format.raw/*62.12*/("""
          """),format.raw/*63.11*/("""$(out).append("</ul>");

        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/(""");
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/("""

"""),format.raw/*68.1*/("""</script>

""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 00:53:15 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/addRoll.scala.html
                  HASH: 7b79f5105f36d517b43e0f0356293d08c09d94df
                  MATRIX: 725->1|830->18|858->21|889->44|928->46|956->48|1015->81|1043->82|1078->91|1121->108|1148->109|1181->115|1214->120|1243->121|1279->130|1323->147|1351->148|1384->154|1431->173|1460->174|1496->183|1561->221|1589->222|1622->228|1663->241|1692->242|1728->251|1793->289|1821->290|1850->292|1893->309|1921->316|1950->317|1999->339|2014->345|2057->367|2675->957|2704->958|2740->967|2776->976|2791->982|2835->1005|2883->1025|2912->1026|2952->1038|3090->1148|3119->1149|3160->1162|3242->1216|3271->1217|3310->1228|3370->1261|3399->1262|3433->1269|3461->1270|3490->1272
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|35->7|35->7|36->8|37->9|37->9|39->11|39->11|39->11|40->12|41->13|41->13|43->15|43->15|43->15|44->16|46->18|46->18|48->20|48->20|48->20|49->21|51->23|51->23|53->25|55->27|55->27|55->27|57->29|57->29|57->29|83->55|83->55|84->56|84->56|84->56|84->56|84->56|84->56|86->58|88->60|88->60|89->61|90->62|90->62|91->63|93->65|93->65|94->66|94->66|96->68
                  -- GENERATED --
              */
          