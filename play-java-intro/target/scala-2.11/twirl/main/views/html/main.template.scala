
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!--<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>-->
<script src='"""),_display_(/*4.15*/routes/*4.21*/.Assets.at("javascripts/Guriddo_jqGrid_JS_4.7.1/js/jquery-1.11.0.min.js")),format.raw/*4.94*/("""' type="text/javascript"></script>

<!--for work with ajax-->
<script type="text/javascript" src='"""),_display_(/*7.38*/routes/*7.44*/.JsAjax.javascriptRoutes()),format.raw/*7.70*/("""'></script>

"""),_display_(/*9.2*/content),format.raw/*9.9*/("""

"""),format.raw/*11.1*/("""<!--<!DOCTYPE html>-->
<!--<html lang="en">-->
<!--<head>-->
	<!--<meta charset="UTF-8">-->
	<!--<title>"""),_display_(/*15.14*/title),format.raw/*15.19*/("""</title>-->
	<!--<link rel="stylesheet" media="screen" href=""""),_display_(/*16.51*/routes/*16.57*/.Assets.at("stylesheets/main.css")),format.raw/*16.91*/("""">-->
    <!--<link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.at("images/favicon.png")),format.raw/*17.97*/("""">-->
    <!--<script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.at("javascripts/hello.js")),format.raw/*18.63*/("""" type="text/javascript"></script>-->
<!--</head>-->
<!--<body>-->


<!--</body>-->
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Feb 21 23:09:49 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/main.scala.html
                  HASH: e2a368d696b5c8e65d1655dd72c796f22c7d82e8
                  MATRIX: 727->1|845->31|873->33|1011->145|1025->151|1118->224|1243->323|1257->329|1303->355|1342->369|1368->376|1397->378|1529->483|1555->488|1644->550|1659->556|1714->590|1805->654|1820->660|1873->692|1928->720|1943->726|1998->760
                  LINES: 26->1|29->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|37->9|37->9|39->11|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18
                  -- GENERATED --
              */
          