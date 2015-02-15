
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
"""),_display_(/*2.2*/content),format.raw/*2.9*/("""

"""),format.raw/*4.1*/("""<!--<!DOCTYPE html>-->
<!--<html lang="en">-->
<!--<head>-->
	<!--<meta charset="UTF-8">-->
	<!--<title>"""),_display_(/*8.14*/title),format.raw/*8.19*/("""</title>-->
	<!--<link rel="stylesheet" media="screen" href=""""),_display_(/*9.51*/routes/*9.57*/.Assets.at("stylesheets/main.css")),format.raw/*9.91*/("""">-->
    <!--<link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">-->
    <!--<script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/hello.js")),format.raw/*11.63*/("""" type="text/javascript"></script>-->
<!--</head>-->
<!--<body>-->

	<!--<div>-->
		<!--<section>-->
			<!--<figure>-->
				<!--<img src="img/u42.png" alt="">-->
				<!--<figcaption>-->
					<!--<h3>Название """),_display_(/*20.24*/content),format.raw/*20.31*/("""</h3>-->
						<!--<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>-->
					<!--<button>-->
						<!--<h5>-->
							<!--Купить-->
							<!--<span class="price">-->
								<!--200rub-->
							<!--</span>-->
						<!--</h5>-->
					<!--</button>-->
				<!--</figcaption>-->
			<!--</figure>-->
		<!--</section>-->
	<!--</div>-->
<!--</body>-->
<!--</html>-->"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Feb 15 23:27:45 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/main.scala.html
                  HASH: 2d469da76d62530cdfef87adf4c730560759a449
                  MATRIX: 727->1|845->31|872->33|898->40|926->42|1057->147|1082->152|1170->214|1184->220|1238->254|1329->318|1344->324|1397->356|1452->384|1467->390|1522->424|1758->633|1786->640
                  LINES: 26->1|29->1|30->2|30->2|32->4|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|48->20|48->20
                  -- GENERATED --
              */
          