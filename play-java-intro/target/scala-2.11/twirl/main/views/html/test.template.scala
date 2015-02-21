
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
        <textarea id="sql query" cols="100" rows="3" name="query">select * from Person</textarea>
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

    <script>
        function foo()"""),format.raw/*43.23*/("""{"""),format.raw/*43.24*/("""
             """),format.raw/*44.14*/("""$('#qwerty').on('click',function() """),format.raw/*44.49*/("""{"""),format.raw/*44.50*/("""
                """),format.raw/*45.17*/("""var id = $('#number').val();
                myJsRoutes.controllers.JsAjax.getItem(id).ajax("""),format.raw/*46.64*/("""{"""),format.raw/*46.65*/("""
                    """),format.raw/*47.21*/("""success : function(data) """),format.raw/*47.46*/("""{"""),format.raw/*47.47*/("""
                        """),format.raw/*48.25*/("""console.log(data)
                    """),format.raw/*49.21*/("""}"""),format.raw/*49.22*/("""
                """),format.raw/*50.17*/("""}"""),format.raw/*50.18*/(""");
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/(""");

        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/("""

        """),format.raw/*55.9*/("""function getRolls()"""),format.raw/*55.28*/("""{"""),format.raw/*55.29*/("""
            """),format.raw/*56.13*/("""var a = '"""),_display_(/*56.23*/controllers/*56.34*/.Admin.getRolls()),format.raw/*56.51*/("""';
            a = a.replace(/&quot;/g,'"');
            var objs = $.parseJSON(a);
            return objs;
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/("""

        """),format.raw/*62.9*/("""function loadGridRolls(Id, data)"""),format.raw/*62.41*/("""{"""),format.raw/*62.42*/("""

            """),format.raw/*64.13*/("""jQuery("#"+Id+"").jqGrid("""),format.raw/*64.38*/("""{"""),format.raw/*64.39*/("""
                """),format.raw/*65.17*/("""datatype: "local",
                //height: 250,
                colNames:['Actions','Id','name', 'description', 'weight'],
                colModel:[
                    """),format.raw/*69.21*/("""{"""),format.raw/*69.22*/("""name: 'act', index: 'act', width: 75"""),format.raw/*69.58*/("""}"""),format.raw/*69.59*/(""",
                    """),format.raw/*70.21*/("""{"""),format.raw/*70.22*/("""name:'Id',index:'id', width:60"""),format.raw/*70.52*/("""}"""),format.raw/*70.53*/(""",
                    """),format.raw/*71.21*/("""{"""),format.raw/*71.22*/("""name:'name',index:'name', width:100, editable:true"""),format.raw/*71.72*/("""}"""),format.raw/*71.73*/(""",
                    """),format.raw/*72.21*/("""{"""),format.raw/*72.22*/("""name:'description',index:'description', editable:true"""),format.raw/*72.75*/("""}"""),format.raw/*72.76*/(""",
                    """),format.raw/*73.21*/("""{"""),format.raw/*73.22*/("""name:'weight',index:'weight', width:80, align:"right",sorttype:"float", editable:true"""),format.raw/*73.107*/("""}"""),format.raw/*73.108*/(""",
                ],
                gridComplete: function()"""),format.raw/*75.41*/("""{"""),format.raw/*75.42*/("""
                    """),format.raw/*76.21*/("""var ids = $("#"+Id+"").jqGrid('getDataIDs');
                    for(var i=0;i < ids.length;i++)"""),format.raw/*77.52*/("""{"""),format.raw/*77.53*/("""
                        """),format.raw/*78.25*/("""var cl = ids[i];
                        be = "<input style='height:22px;width:20px;' type='button' value='E' onclick=\"$('#list').editRow('"+cl+"');\"  />";
                        se = "<input style='height:22px;width:20px;' type='button' value='C' onclick=\"$('#list').restoreRow('"+cl+"');\"  />";
                        $("#"+Id+"").jqGrid('setRowData',ids[i],"""),format.raw/*81.65*/("""{"""),format.raw/*81.66*/("""act:be+se"""),format.raw/*81.75*/("""}"""),format.raw/*81.76*/(""");
                    """),format.raw/*82.21*/("""}"""),format.raw/*82.22*/("""
                """),format.raw/*83.17*/("""}"""),format.raw/*83.18*/(""",
                viewrecords: true,
                multiselect: false,
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/(""");

            for(var i=0;i<=data.length;i++)"""),format.raw/*88.44*/("""{"""),format.raw/*88.45*/("""
                """),format.raw/*89.17*/("""jQuery("#"+Id+"").jqGrid('addRowData', i, data[i]);
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/("""
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/("""

        """),format.raw/*93.9*/("""jQuery().ready(function ()"""),format.raw/*93.35*/("""{"""),format.raw/*93.36*/("""

            """),format.raw/*95.13*/("""$('#selectTable').on('change', function(what)"""),format.raw/*95.58*/("""{"""),format.raw/*95.59*/("""

                """),format.raw/*97.17*/("""$("#list").jqGrid('GridUnload');

                var select = $('#selectTable').val();

                if(select == 'class models.Roll')"""),format.raw/*101.50*/("""{"""),format.raw/*101.51*/("""

                    """),format.raw/*103.21*/("""var rollsFromController = getRolls();

                    loadGridRolls('list', rollsFromController);

                """),format.raw/*107.17*/("""}"""),format.raw/*107.18*/("""else if(select == 'class models.Person')"""),format.raw/*107.58*/("""{"""),format.raw/*107.59*/("""
"""),format.raw/*108.1*/("""s

                """),format.raw/*110.17*/("""}"""),format.raw/*110.18*/("""


            """),format.raw/*113.13*/("""}"""),format.raw/*113.14*/(""");


	    """),format.raw/*116.6*/("""}"""),format.raw/*116.7*/(""");
    </script>


""")))}))}
  }

  def render(message:String,model:List[String],queryResult:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(message,model,queryResult)

  def f:((String,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (message,model,queryResult) => apply(message,model,queryResult)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Feb 21 19:00:19 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/test.scala.html
                  HASH: 6f4cf6b459544b788f89cf8e7485f1d2cea58b62
                  MATRIX: 748->1|901->66|929->69|960->92|999->94|1027->96|1067->110|1081->116|1174->189|1249->238|1263->244|1356->317|1431->366|1445->372|1527->434|1633->514|1647->520|1706->559|1780->607|1794->613|1878->676|1921->692|1949->699|1978->700|2046->742|2077->757|2116->758|2152->767|2188->776|2210->777|2255->792|2287->797|2402->885|2417->891|2455->908|2718->1144|2757->1167|2796->1168|2837->1181|2886->1203|2931->1232|2970->1233|3019->1254|3051->1259|3078->1265|3132->1288|3173->1301|3219->1316|3251->1321|3397->1439|3426->1440|3468->1454|3531->1489|3560->1490|3605->1507|3725->1599|3754->1600|3803->1621|3856->1646|3885->1647|3938->1672|4004->1710|4033->1711|4078->1728|4107->1729|4150->1744|4179->1745|4218->1757|4247->1758|4284->1768|4331->1787|4360->1788|4401->1801|4438->1811|4458->1822|4496->1839|4640->1956|4669->1957|4706->1967|4766->1999|4795->2000|4837->2014|4890->2039|4919->2040|4964->2057|5164->2229|5193->2230|5257->2266|5286->2267|5336->2289|5365->2290|5423->2320|5452->2321|5502->2343|5531->2344|5609->2394|5638->2395|5688->2417|5717->2418|5798->2471|5827->2472|5877->2494|5906->2495|6020->2580|6050->2581|6139->2642|6168->2643|6217->2664|6341->2760|6370->2761|6423->2786|6817->3152|6846->3153|6883->3162|6912->3163|6963->3186|6992->3187|7037->3204|7066->3205|7179->3290|7208->3291|7283->3338|7312->3339|7357->3356|7449->3420|7478->3421|7514->3430|7543->3431|7580->3441|7634->3467|7663->3468|7705->3482|7778->3527|7807->3528|7853->3546|8020->3684|8050->3685|8101->3707|8250->3827|8280->3828|8349->3868|8379->3869|8408->3870|8456->3889|8486->3890|8530->3905|8560->3906|8598->3916|8627->3917
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|40->12|43->15|43->15|43->15|44->16|44->16|44->16|45->17|46->18|51->23|51->23|51->23|58->30|58->30|58->30|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|64->36|65->37|71->43|71->43|72->44|72->44|72->44|73->45|74->46|74->46|75->47|75->47|75->47|76->48|77->49|77->49|78->50|78->50|79->51|79->51|81->53|81->53|83->55|83->55|83->55|84->56|84->56|84->56|84->56|88->60|88->60|90->62|90->62|90->62|92->64|92->64|92->64|93->65|97->69|97->69|97->69|97->69|98->70|98->70|98->70|98->70|99->71|99->71|99->71|99->71|100->72|100->72|100->72|100->72|101->73|101->73|101->73|101->73|103->75|103->75|104->76|105->77|105->77|106->78|109->81|109->81|109->81|109->81|110->82|110->82|111->83|111->83|114->86|114->86|116->88|116->88|117->89|118->90|118->90|119->91|119->91|121->93|121->93|121->93|123->95|123->95|123->95|125->97|129->101|129->101|131->103|135->107|135->107|135->107|135->107|136->108|138->110|138->110|141->113|141->113|144->116|144->116
                  -- GENERATED --
              */
          