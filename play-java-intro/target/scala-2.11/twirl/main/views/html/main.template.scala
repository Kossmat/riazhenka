
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


"""),_display_(/*6.2*/content),format.raw/*6.9*/("""

"""),format.raw/*8.1*/("""<!--<!DOCTYPE html>-->
<!--<html lang="en">-->
<!--<head>-->
	<!--<meta charset="UTF-8">-->
	<!--<title>"""),_display_(/*12.14*/title),format.raw/*12.19*/("""</title>-->
	<!--<link rel="stylesheet" media="screen" href=""""),_display_(/*13.51*/routes/*13.57*/.Assets.at("stylesheets/main.css")),format.raw/*13.91*/("""">-->
    <!--<link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.59*/routes/*14.65*/.Assets.at("images/favicon.png")),format.raw/*14.97*/("""">-->
    <!--<script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/hello.js")),format.raw/*15.63*/("""" type="text/javascript"></script>-->
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
                  DATE: Thu Feb 19 01:53:56 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/main.scala.html
                  HASH: b1e1f9badb52b404dbce0940d06c9b9149d7ad8d
                  MATRIX: 727->1|845->31|873->33|999->134|1025->141|1053->143|1185->248|1211->253|1300->315|1315->321|1370->355|1461->419|1476->425|1529->457|1584->485|1599->491|1654->525
                  LINES: 26->1|29->1|31->3|34->6|34->6|36->8|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15
                  -- GENERATED --
              */
          