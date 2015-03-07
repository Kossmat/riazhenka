
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

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Riazhenka</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href='"""),_display_(/*12.18*/routes/*12.24*/.Assets.at("stylesheets/style.css")),format.raw/*12.59*/("""' rel="stylesheet">
    <link rel="stylesheet" href='"""),_display_(/*13.35*/routes/*13.41*/.Assets.at("stylesheets/font-awesome-4.3.0/css/font-awesome.css")),format.raw/*13.106*/("""' type="text/css">


    <!--for work with ajax-->
    <script type="text/javascript" src='"""),_display_(/*17.42*/routes/*17.48*/.JsAjax.javascriptRoutes()),format.raw/*17.74*/("""'></script>

    <script src='"""),_display_(/*19.19*/routes/*19.25*/.Assets.at("javascripts/Guriddo_jqGrid_JS_4.7.1/js/jquery-1.11.0.min.js")),format.raw/*19.98*/("""' type="text/javascript"></script>
</head>


    """),_display_(/*23.6*/content),format.raw/*23.13*/("""

"""),format.raw/*25.1*/("""</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Mar 07 17:21:41 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/main.scala.html
                  HASH: 8a31c511ec923cf11153d257dfe2f327ab846450
                  MATRIX: 727->1|845->31|873->33|1186->319|1201->325|1257->360|1338->414|1353->420|1440->485|1559->577|1574->583|1621->609|1679->640|1694->646|1788->719|1864->769|1892->776|1921->778
                  LINES: 26->1|29->1|31->3|40->12|40->12|40->12|41->13|41->13|41->13|45->17|45->17|45->17|47->19|47->19|47->19|51->23|51->23|53->25
                  -- GENERATED --
              */
          