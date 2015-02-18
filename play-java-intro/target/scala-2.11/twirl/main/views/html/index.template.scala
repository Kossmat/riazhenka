
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[Map[String, String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, content: List[Map[String,String]]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.5*/("""<h2>"""),_display_(/*5.10*/message),format.raw/*5.17*/("""</h2>

    """),_display_(/*7.6*/for(item <- content) yield /*7.26*/{_display_(Seq[Any](format.raw/*7.27*/("""
        """),format.raw/*8.9*/("""<div>
            <section>
                <figure>
                    <img src="img/u42.png" alt="">
                    <figcaption>
                        <h3>"""),_display_(/*13.30*/item/*13.34*/.get("name")),format.raw/*13.46*/("""</h3>
                        <p>"""),_display_(/*14.29*/item/*14.33*/.get("description")),format.raw/*14.52*/("""</p>
                        <button>
                            <h5>
                                Купить
                                <span class="price">
                                    200rub
                                </span>
                            </h5>
                        </button>
                    </figcaption>
                </figure>
            </section>
        </div>
    """)))}),format.raw/*27.6*/("""

""")))}))}
  }

  def render(message:String,content:List[Map[String, String]]): play.twirl.api.HtmlFormat.Appendable = apply(message,content)

  def f:((String,List[Map[String, String]]) => play.twirl.api.HtmlFormat.Appendable) = (message,content) => apply(message,content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 19 01:53:56 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/index.scala.html
                  HASH: 775af438d607ee65a407fdc138b5820c048f042d
                  MATRIX: 749->1|889->53|917->56|948->79|987->81|1019->87|1050->92|1077->99|1114->111|1149->131|1187->132|1222->141|1415->307|1428->311|1461->323|1522->357|1535->361|1575->380|2022->797
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|35->7|35->7|35->7|36->8|41->13|41->13|41->13|42->14|42->14|42->14|55->27
                  -- GENERATED --
              */
          