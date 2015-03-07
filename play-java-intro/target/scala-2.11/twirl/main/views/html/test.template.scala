
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
object test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, model: List[String], queryResult: List[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.67*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<script src=""""),_display_(/*5.15*/routes/*5.21*/.Assets.at("javascripts/Guriddo_jqGrid_JS_4.7.1/js/jquery-1.11.0.min.js")),format.raw/*5.94*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*6.15*/routes/*6.21*/.Assets.at("javascripts/Guriddo_jqGrid_JS_4.7.1/js/jquery.jqGrid.min.js")),format.raw/*6.94*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*7.15*/routes/*7.21*/.Assets.at("javascripts/jquery-ui-1.11.3.custom/jquery-ui.js")),format.raw/*7.83*/("""" type="text/javascript"></script>
<link rel="stylesheet" media="screen" href=""""),_display_(/*8.46*/routes/*8.52*/.Assets.at("stylesheets/ui.jqgrid.css")),format.raw/*8.91*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(/*9.46*/routes/*9.52*/.Assets.at("javascripts/jquery-ui-1.11.3.custom/jquery-ui.css")),format.raw/*9.115*/("""">


    <h3>  """),_display_(/*12.12*/message),format.raw/*12.19*/(""" """),format.raw/*12.20*/("""</h3>

    <select id="selectTable">
    """),_display_(/*15.6*/for(i <- model) yield /*15.21*/{_display_(Seq[Any](format.raw/*15.22*/("""
        """),format.raw/*16.9*/("""<option>"""),_display_(/*16.18*/i),format.raw/*16.19*/("""</option>
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""</select>

    <table id="list"></table>
    <div id="pager"></div>

    <form action=""""),_display_(/*23.20*/routes/*23.26*/.Admin.adminSQL()),format.raw/*23.43*/("""" method="post">
        <textarea id="sql query" cols="100" rows="3" name="query">select * from Roll</textarea>
        <br/>
        <button id="runSqlSearch">search</button>
    </form>

    <table id="result" border="2">
        """),_display_(/*30.10*/for(row <- queryResult) yield /*30.33*/{_display_(Seq[Any](format.raw/*30.34*/("""
            """),format.raw/*31.13*/("""<tr>
                """),_display_(/*32.18*/for(column <- row.split(";")) yield /*32.47*/{_display_(Seq[Any](format.raw/*32.48*/("""
                    """),format.raw/*33.21*/("""<td>"""),_display_(/*33.26*/column),format.raw/*33.32*/("""</td>
                """)))}),format.raw/*34.18*/("""
            """),format.raw/*35.13*/("""</tr>
        """)))}),format.raw/*36.10*/("""
    """),format.raw/*37.5*/("""</table>

    <input types="text" id="number"/>
    <button id="qwerty"></button>



""")))}))}
  }

  def render(message:String,model:List[String],queryResult:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(message,model,queryResult)

  def f:((String,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (message,model,queryResult) => apply(message,model,queryResult)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Mar 07 17:21:41 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/test.scala.html
                  HASH: e25ab57522c41b530100e13fc85c3fd18576f4f9
                  MATRIX: 748->1|901->66|929->69|960->92|999->94|1027->96|1067->110|1081->116|1174->189|1249->238|1263->244|1356->317|1431->366|1445->372|1527->434|1633->514|1647->520|1706->559|1780->607|1794->613|1878->676|1921->692|1949->699|1978->700|2046->742|2077->757|2116->758|2152->767|2188->776|2210->777|2255->792|2287->797|2402->885|2417->891|2455->908|2716->1142|2755->1165|2794->1166|2835->1179|2884->1201|2929->1230|2968->1231|3017->1252|3049->1257|3076->1263|3130->1286|3171->1299|3217->1314|3249->1319
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|40->12|43->15|43->15|43->15|44->16|44->16|44->16|45->17|46->18|51->23|51->23|51->23|58->30|58->30|58->30|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|64->36|65->37
                  -- GENERATED --
              */
          