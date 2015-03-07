
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
object addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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

addProductForm
<form action=""""),_display_(/*30.16*/routes/*30.22*/.Application.addProduct()),format.raw/*30.47*/("""" method="post" enctype="multipart/form-data">

    Name: <input type="text" name="name1" id="name1"/> <br/>
    Price: <input type="number" name="price1" id="price1"><br/>
    Weight: <input type="number" name="weight1" id="weight1"/> <br/>
    Description: <input type="text" name="description1" id="description1"/><br/>
    Image: <input type="file" name="photo1" id="photo1"/><br/>
    <button>Add</button>

</form>


<button onclick="getProductsFromDB()">getFromDB</button>


        <div id="contentFromDB">

        </div>



<script type="text/javascript">
    function getProductsFromDB()"""),format.raw/*52.33*/("""{"""),format.raw/*52.34*/("""
        """),format.raw/*53.9*/("""$.get( """"),_display_(/*53.18*/routes/*53.24*/.Application.getProducts()),format.raw/*53.50*/("""", function( data ) """),format.raw/*53.70*/("""{"""),format.raw/*53.71*/("""

          """),format.raw/*55.11*/("""var out = $('#contentFromDB');
          $(out).append("<ul>");
          for(var i = 0; i < data.length; i++)"""),format.raw/*57.47*/("""{"""),format.raw/*57.48*/("""
            """),format.raw/*58.13*/("""$(out).append("<li>"+data[i].name+"</li>");
          """),format.raw/*59.11*/("""}"""),format.raw/*59.12*/("""
          """),format.raw/*60.11*/("""$(out).append("</ul>");

        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/(""");
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/("""

"""),format.raw/*65.1*/("""</script>

""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Mar 07 17:21:41 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/addProduct.scala.html
                  HASH: 9c6ebab72a99cc9fc36150dbfc9bc4abc83e0bf2
                  MATRIX: 728->1|833->18|861->21|892->44|931->46|959->48|1018->81|1046->82|1081->91|1124->108|1151->109|1184->115|1217->120|1246->121|1282->130|1326->147|1354->148|1387->154|1434->173|1463->174|1499->183|1564->221|1592->222|1625->228|1666->241|1695->242|1731->251|1796->289|1824->290|1853->292|1896->309|1924->316|1953->317|2017->354|2032->360|2078->385|2703->982|2732->983|2768->992|2804->1001|2819->1007|2866->1033|2914->1053|2943->1054|2983->1066|3121->1176|3150->1177|3191->1190|3273->1244|3302->1245|3341->1256|3401->1289|3430->1290|3464->1297|3492->1298|3521->1300
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|35->7|35->7|36->8|37->9|37->9|39->11|39->11|39->11|40->12|41->13|41->13|43->15|43->15|43->15|44->16|46->18|46->18|48->20|48->20|48->20|49->21|51->23|51->23|53->25|55->27|55->27|55->27|58->30|58->30|58->30|80->52|80->52|81->53|81->53|81->53|81->53|81->53|81->53|83->55|85->57|85->57|86->58|87->59|87->59|88->60|90->62|90->62|91->63|91->63|93->65
                  -- GENERATED --
              */
          