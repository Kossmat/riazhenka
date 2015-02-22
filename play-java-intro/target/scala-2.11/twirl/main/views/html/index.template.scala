
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[Map[String, Object]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, content: List[Map[String,Object]]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<style type="text/css">
    .product--image"""),format.raw/*6.20*/("""{"""),format.raw/*6.21*/("""
        """),format.raw/*7.9*/("""width: 200px;
        heigh:200px;
    """),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""
"""),format.raw/*10.1*/("""</style>

<h2>"""),_display_(/*12.6*/message),format.raw/*12.13*/("""</h2>

<div style="margin: 0 auto">

    <ul>
        """),_display_(/*17.10*/for(item <- content) yield /*17.30*/{_display_(Seq[Any](format.raw/*17.31*/("""

            """),format.raw/*19.13*/("""<li class="product" style="list-style: none; display: inline-block; padding-right:6px; max-width: 33.33333%">
                <section>
                    <figure>
                        <img class="product--image" src="""),_display_(/*22.58*/{val a = item.get("Id"); routes.Application.renderImage(""+a)}),format.raw/*22.120*/(""" """),format.raw/*22.121*/("""alt=""/>
                        <figcaption class="product--about">
                            <h3 class="product--name">"""),_display_(/*24.56*/item/*24.60*/.get("name")),format.raw/*24.72*/("""</h3>
                            <p class="product--description">"""),_display_(/*25.62*/item/*25.66*/.get("description")),format.raw/*25.85*/("""</p>
                            <button class="btn" style="padding: 5px; text-transform: uppercase; font-weight: 600;">
                                Купить
                            </button>
                                <span class="product--price">
                                    """),_display_(/*30.38*/item/*30.42*/.get("price")),format.raw/*30.55*/(""" """),format.raw/*30.56*/("""rub
                                </span>
                        </figcaption>
                    </figure>
                </section>
            </li>

        """)))}),format.raw/*37.10*/("""
    """),format.raw/*38.5*/("""</ul>

</div>
""")))}))}
  }

  def render(message:String,content:List[Map[String, Object]]): play.twirl.api.HtmlFormat.Appendable = apply(message,content)

  def f:((String,List[Map[String, Object]]) => play.twirl.api.HtmlFormat.Appendable) = (message,content) => apply(message,content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Feb 23 00:53:15 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/index.scala.html
                  HASH: 7235e55fd91b33655b47d0faaead410838820f66
                  MATRIX: 749->1|889->53|917->56|948->79|987->81|1015->83|1085->126|1113->127|1148->136|1213->175|1240->176|1268->177|1309->192|1337->199|1419->254|1455->274|1494->275|1536->289|1785->511|1869->573|1899->574|2050->698|2063->702|2096->714|2190->781|2203->785|2243->804|2567->1101|2580->1105|2614->1118|2643->1119|2841->1286|2873->1291
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|34->6|34->6|35->7|37->9|37->9|38->10|40->12|40->12|45->17|45->17|45->17|47->19|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|58->30|58->30|58->30|58->30|65->37|66->38
                  -- GENERATED --
              */
          