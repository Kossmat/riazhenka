
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
                  DATE: Sat Feb 21 23:09:49 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/test.scala.html
                  HASH: 1b0d1729eed48c3417adbe96e8c7245c73ce27f6
                  MATRIX: 748->1|901->66|929->69|960->92|999->94|1027->96|1067->110|1081->116|1174->189|1249->238|1263->244|1356->317|1431->366|1445->372|1527->434|1633->514|1647->520|1706->559|1780->607|1794->613|1878->676|1921->692|1949->699|1978->700|2046->742|2077->757|2116->758|2152->767|2188->776|2210->777|2255->792|2287->797|2402->885|2417->891|2455->908|2716->1142|2755->1165|2794->1166|2835->1179|2884->1201|2929->1230|2968->1231|3017->1252|3049->1257|3076->1263|3130->1286|3171->1299|3217->1314|3249->1319|3395->1437|3424->1438|3466->1452|3529->1487|3558->1488|3603->1505|3723->1597|3752->1598|3801->1619|3854->1644|3883->1645|3936->1670|4002->1708|4031->1709|4076->1726|4105->1727|4148->1742|4177->1743|4216->1755|4245->1756|4282->1766|4329->1785|4358->1786|4399->1799|4436->1809|4456->1820|4494->1837|4638->1954|4667->1955|4704->1965|4764->1997|4793->1998|4835->2012|4888->2037|4917->2038|4962->2055|5162->2227|5191->2228|5255->2264|5284->2265|5334->2287|5363->2288|5421->2318|5450->2319|5500->2341|5529->2342|5607->2392|5636->2393|5686->2415|5715->2416|5796->2469|5825->2470|5875->2492|5904->2493|6018->2578|6048->2579|6137->2640|6166->2641|6215->2662|6339->2758|6368->2759|6421->2784|6815->3150|6844->3151|6881->3160|6910->3161|6961->3184|6990->3185|7035->3202|7064->3203|7177->3288|7206->3289|7281->3336|7310->3337|7355->3354|7447->3418|7476->3419|7512->3428|7541->3429|7578->3439|7632->3465|7661->3466|7703->3480|7776->3525|7805->3526|7851->3544|8018->3682|8048->3683|8099->3705|8248->3825|8278->3826|8347->3866|8377->3867|8406->3868|8454->3887|8484->3888|8528->3903|8558->3904|8596->3914|8625->3915
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|40->12|43->15|43->15|43->15|44->16|44->16|44->16|45->17|46->18|51->23|51->23|51->23|58->30|58->30|58->30|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|64->36|65->37|71->43|71->43|72->44|72->44|72->44|73->45|74->46|74->46|75->47|75->47|75->47|76->48|77->49|77->49|78->50|78->50|79->51|79->51|81->53|81->53|83->55|83->55|83->55|84->56|84->56|84->56|84->56|88->60|88->60|90->62|90->62|90->62|92->64|92->64|92->64|93->65|97->69|97->69|97->69|97->69|98->70|98->70|98->70|98->70|99->71|99->71|99->71|99->71|100->72|100->72|100->72|100->72|101->73|101->73|101->73|101->73|103->75|103->75|104->76|105->77|105->77|106->78|109->81|109->81|109->81|109->81|110->82|110->82|111->83|111->83|114->86|114->86|116->88|116->88|117->89|118->90|118->90|119->91|119->91|121->93|121->93|121->93|123->95|123->95|123->95|125->97|129->101|129->101|131->103|135->107|135->107|135->107|135->107|136->108|138->110|138->110|141->113|141->113|144->116|144->116
                  -- GENERATED --
              */
          