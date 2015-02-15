
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

      """),format.raw/*5.7*/("""<h3>  """),_display_(/*5.14*/message),format.raw/*5.21*/(""" """),format.raw/*5.22*/("""</h3>

    <form action=""""),_display_(/*7.20*/routes/*7.26*/.Application.addPerson()),format.raw/*7.50*/("""" method="post">
        Name: <input type="text" name="name" style="margin: 3px;"/> <br/>
        Age: <input type="number" name="age" style="width: 40px;margin: 3px;"/> <br/>
        <button style="margin: 3px;">Add</button>
    </form>


""")))}),format.raw/*14.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Feb 15 23:36:21 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/index.scala.html
                  HASH: bdb4e27f1570aa8283ad36273e3c3f99b58eeb5d
                  MATRIX: 723->1|828->18|856->21|887->44|926->46|960->54|993->61|1020->68|1048->69|1100->95|1114->101|1158->125|1430->367
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|35->7|35->7|35->7|42->14
                  -- GENERATED --
              */
          