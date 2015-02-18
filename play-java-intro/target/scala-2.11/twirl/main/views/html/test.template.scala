
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


    <script>

        function getRolls()"""),format.raw/*42.28*/("""{"""),format.raw/*42.29*/("""
            """),format.raw/*43.13*/("""var a = '"""),_display_(/*43.23*/controllers/*43.34*/.Admin.getRolls()),format.raw/*43.51*/("""';
            a = a.replace(/&quot;/g,'"');
            var objs = $.parseJSON(a);
            return objs;
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""

        """),format.raw/*49.9*/("""function getPersons()"""),format.raw/*49.30*/("""{"""),format.raw/*49.31*/("""
            """),format.raw/*50.13*/("""var a = '"""),_display_(/*50.23*/controllers/*50.34*/.Admin.getPersons()),format.raw/*50.53*/("""';
            a = a.replace(/&quot;/g,'"');
            var objs = $.parseJSON(a);
            return objs;
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/("""

        """),format.raw/*56.9*/("""function loadGridRolls(Id, data)"""),format.raw/*56.41*/("""{"""),format.raw/*56.42*/("""

            """),format.raw/*58.13*/("""jQuery("#"+Id+"").jqGrid("""),format.raw/*58.38*/("""{"""),format.raw/*58.39*/("""
                """),format.raw/*59.17*/("""datatype: "local",
                //height: 250,
                colNames:['Actions','Id','name', 'description', 'weight'],
                colModel:[
                    """),format.raw/*63.21*/("""{"""),format.raw/*63.22*/("""name: 'act', index: 'act', width: 75"""),format.raw/*63.58*/("""}"""),format.raw/*63.59*/(""",
                    """),format.raw/*64.21*/("""{"""),format.raw/*64.22*/("""name:'Id',index:'id', width:60"""),format.raw/*64.52*/("""}"""),format.raw/*64.53*/(""",
                    """),format.raw/*65.21*/("""{"""),format.raw/*65.22*/("""name:'name',index:'name', width:100, editable:true"""),format.raw/*65.72*/("""}"""),format.raw/*65.73*/(""",
                    """),format.raw/*66.21*/("""{"""),format.raw/*66.22*/("""name:'description',index:'description', editable:true"""),format.raw/*66.75*/("""}"""),format.raw/*66.76*/(""",
                    """),format.raw/*67.21*/("""{"""),format.raw/*67.22*/("""name:'weight',index:'weight', width:80, align:"right",sorttype:"float", editable:true"""),format.raw/*67.107*/("""}"""),format.raw/*67.108*/(""",
                ],
                gridComplete: function()"""),format.raw/*69.41*/("""{"""),format.raw/*69.42*/("""
                    """),format.raw/*70.21*/("""var ids = $("#"+Id+"").jqGrid('getDataIDs');
                    for(var i=0;i < ids.length;i++)"""),format.raw/*71.52*/("""{"""),format.raw/*71.53*/("""
                        """),format.raw/*72.25*/("""var cl = ids[i];
                        be = "<input style='height:22px;width:20px;' type='button' value='E' onclick=\"$('#list').editRow('"+cl+"');\"  />";
                        se = "<input style='height:22px;width:20px;' type='button' value='C' onclick=\"$('#list').restoreRow('"+cl+"');\"  />";
                        $("#"+Id+"").jqGrid('setRowData',ids[i],"""),format.raw/*75.65*/("""{"""),format.raw/*75.66*/("""act:be+se"""),format.raw/*75.75*/("""}"""),format.raw/*75.76*/(""");
                    """),format.raw/*76.21*/("""}"""),format.raw/*76.22*/("""
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/(""",
                viewrecords: true,
                multiselect: false,
            """),format.raw/*80.13*/("""}"""),format.raw/*80.14*/(""");

            for(var i=0;i<=data.length;i++)"""),format.raw/*82.44*/("""{"""),format.raw/*82.45*/("""
                """),format.raw/*83.17*/("""jQuery("#"+Id+"").jqGrid('addRowData', i, data[i]);
            """),format.raw/*84.13*/("""}"""),format.raw/*84.14*/("""
        """),format.raw/*85.9*/("""}"""),format.raw/*85.10*/("""

        """),format.raw/*87.9*/("""function loadGridPersons(Id, data)"""),format.raw/*87.43*/("""{"""),format.raw/*87.44*/("""
            """),format.raw/*88.13*/("""var lastsel;
            jQuery("#"+Id+"").jqGrid("""),format.raw/*89.38*/("""{"""),format.raw/*89.39*/("""
                """),format.raw/*90.17*/("""datatype: "local",
                //height: 250,
                colNames:['Actions','Id','name', 'age'],
                colModel:[
                    """),format.raw/*94.21*/("""{"""),format.raw/*94.22*/("""name: 'act', index: 'act', width: 75"""),format.raw/*94.58*/("""}"""),format.raw/*94.59*/(""",
                    """),format.raw/*95.21*/("""{"""),format.raw/*95.22*/("""name:'Id',index:'id', width:60"""),format.raw/*95.52*/("""}"""),format.raw/*95.53*/(""",
                    """),format.raw/*96.21*/("""{"""),format.raw/*96.22*/("""name:'name',index:'name', width:100, editable:true"""),format.raw/*96.72*/("""}"""),format.raw/*96.73*/(""",
                    """),format.raw/*97.21*/("""{"""),format.raw/*97.22*/("""name:'age',index:'age', editable:true"""),format.raw/*97.59*/("""}"""),format.raw/*97.60*/(""",
                ],
                gridComplete: function()"""),format.raw/*99.41*/("""{"""),format.raw/*99.42*/("""
                    """),format.raw/*100.21*/("""var ids = $("#"+Id+"").jqGrid('getDataIDs');
                    for(var i=0;i < ids.length;i++)"""),format.raw/*101.52*/("""{"""),format.raw/*101.53*/("""
                        """),format.raw/*102.25*/("""var cl = ids[i];
                        be = "<input style='height:22px;width:20px;' type='button' value='E' onclick=\"$('#list').editRow('"+cl+"');\"  />";
                        se = "<input style='height:22px;width:20px;' type='button' value='C' onclick=\"$('#list').restoreRow('"+cl+"');\"  />";
                        $("#"+Id+"").jqGrid('setRowData',ids[i],"""),format.raw/*105.65*/("""{"""),format.raw/*105.66*/("""act:be+se"""),format.raw/*105.75*/("""}"""),format.raw/*105.76*/(""");
                    """),format.raw/*106.21*/("""}"""),format.raw/*106.22*/("""
                """),format.raw/*107.17*/("""}"""),format.raw/*107.18*/(""",
  //TODO    //    onSelectRow: function(id)"""),format.raw/*108.44*/("""{"""),format.raw/*108.45*/("""
            """),format.raw/*109.13*/("""//        if(id && id!==lastsel)"""),format.raw/*109.45*/("""{"""),format.raw/*109.46*/("""
            """),format.raw/*110.13*/("""//            jQuery("#"+Id+"").jqGrid('restoreRow',lastsel);
            //            jQuery("#"+Id+"").jqGrid('editRow',id,true);
            //            lastsel=id;
            //        """),format.raw/*113.23*/("""}"""),format.raw/*113.24*/("""
            """),format.raw/*114.13*/("""//    """),format.raw/*114.19*/("""}"""),format.raw/*114.20*/(""",
                viewrecords: true,
                multiselect: false,
            """),format.raw/*117.13*/("""}"""),format.raw/*117.14*/(""");

            for(var i=0;i<=data.length;i++)"""),format.raw/*119.44*/("""{"""),format.raw/*119.45*/("""
                """),format.raw/*120.17*/("""jQuery("#"+Id+"").jqGrid('addRowData', i, data[i]);
            """),format.raw/*121.13*/("""}"""),format.raw/*121.14*/("""

            """),format.raw/*123.13*/("""//jQuery("#"+Id+"").jqGrid('navGrid',"#pager","""),format.raw/*123.59*/("""{"""),format.raw/*123.60*/("""edit:false,add:false,del:false"""),format.raw/*123.90*/("""}"""),format.raw/*123.91*/(""");
        """),format.raw/*124.9*/("""}"""),format.raw/*124.10*/("""

        """),format.raw/*126.9*/("""jQuery().ready(function ()"""),format.raw/*126.35*/("""{"""),format.raw/*126.36*/("""

            """),format.raw/*128.13*/("""$('#selectTable').on('change', function(what)"""),format.raw/*128.58*/("""{"""),format.raw/*128.59*/("""

                """),format.raw/*130.17*/("""$("#list").jqGrid('GridUnload');

                var select = $('#selectTable').val();

                if(select == 'class models.Roll')"""),format.raw/*134.50*/("""{"""),format.raw/*134.51*/("""

                    """),format.raw/*136.21*/("""var rollsFromController = getRolls();

                    loadGridRolls('list', rollsFromController);

                """),format.raw/*140.17*/("""}"""),format.raw/*140.18*/("""else if(select == 'class models.Person')"""),format.raw/*140.58*/("""{"""),format.raw/*140.59*/("""

                    """),format.raw/*142.21*/("""var personsFromController = getPersons();

                    loadGridPersons('list', personsFromController);

                """),format.raw/*146.17*/("""}"""),format.raw/*146.18*/("""


            """),format.raw/*149.13*/("""}"""),format.raw/*149.14*/(""");


	    """),format.raw/*152.6*/("""}"""),format.raw/*152.7*/(""");
    </script>


""")))}))}
  }

  def render(message:String,model:List[String],queryResult:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(message,model,queryResult)

  def f:((String,List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (message,model,queryResult) => apply(message,model,queryResult)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Feb 19 01:53:56 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/test.scala.html
                  HASH: 710ed99f5962a728f7a0f26b4cefe71d5ea2a078
                  MATRIX: 748->1|901->66|929->69|960->92|999->94|1027->96|1067->110|1081->116|1174->189|1249->238|1263->244|1356->317|1431->366|1445->372|1527->434|1633->514|1647->520|1706->559|1780->607|1794->613|1878->676|1921->692|1949->699|1978->700|2046->742|2077->757|2116->758|2152->767|2188->776|2210->777|2255->792|2287->797|2402->885|2417->891|2455->908|2718->1144|2757->1167|2796->1168|2837->1181|2886->1203|2931->1232|2970->1233|3019->1254|3051->1259|3078->1265|3132->1288|3173->1301|3219->1316|3251->1321|3331->1373|3360->1374|3401->1387|3438->1397|3458->1408|3496->1425|3640->1542|3669->1543|3706->1553|3755->1574|3784->1575|3825->1588|3862->1598|3882->1609|3922->1628|4066->1745|4095->1746|4132->1756|4192->1788|4221->1789|4263->1803|4316->1828|4345->1829|4390->1846|4590->2018|4619->2019|4683->2055|4712->2056|4762->2078|4791->2079|4849->2109|4878->2110|4928->2132|4957->2133|5035->2183|5064->2184|5114->2206|5143->2207|5224->2260|5253->2261|5303->2283|5332->2284|5446->2369|5476->2370|5565->2431|5594->2432|5643->2453|5767->2549|5796->2550|5849->2575|6243->2941|6272->2942|6309->2951|6338->2952|6389->2975|6418->2976|6463->2993|6492->2994|6605->3079|6634->3080|6709->3127|6738->3128|6783->3145|6875->3209|6904->3210|6940->3219|6969->3220|7006->3230|7068->3264|7097->3265|7138->3278|7216->3328|7245->3329|7290->3346|7472->3500|7501->3501|7565->3537|7594->3538|7644->3560|7673->3561|7731->3591|7760->3592|7810->3614|7839->3615|7917->3665|7946->3666|7996->3688|8025->3689|8090->3726|8119->3727|8208->3788|8237->3789|8287->3810|8412->3906|8442->3907|8496->3932|8891->4298|8921->4299|8959->4308|8989->4309|9041->4332|9071->4333|9117->4350|9147->4351|9221->4396|9251->4397|9293->4410|9354->4442|9384->4443|9426->4456|9648->4649|9678->4650|9720->4663|9755->4669|9785->4670|9899->4755|9929->4756|10005->4803|10035->4804|10081->4821|10174->4885|10204->4886|10247->4900|10322->4946|10352->4947|10411->4977|10441->4978|10480->4989|10510->4990|10548->5000|10603->5026|10633->5027|10676->5041|10750->5086|10780->5087|10827->5105|10994->5243|11024->5244|11075->5266|11224->5386|11254->5387|11323->5427|11353->5428|11404->5450|11561->5578|11591->5579|11635->5594|11665->5595|11703->5605|11732->5606
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|40->12|40->12|40->12|43->15|43->15|43->15|44->16|44->16|44->16|45->17|46->18|51->23|51->23|51->23|58->30|58->30|58->30|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|63->35|64->36|65->37|70->42|70->42|71->43|71->43|71->43|71->43|75->47|75->47|77->49|77->49|77->49|78->50|78->50|78->50|78->50|82->54|82->54|84->56|84->56|84->56|86->58|86->58|86->58|87->59|91->63|91->63|91->63|91->63|92->64|92->64|92->64|92->64|93->65|93->65|93->65|93->65|94->66|94->66|94->66|94->66|95->67|95->67|95->67|95->67|97->69|97->69|98->70|99->71|99->71|100->72|103->75|103->75|103->75|103->75|104->76|104->76|105->77|105->77|108->80|108->80|110->82|110->82|111->83|112->84|112->84|113->85|113->85|115->87|115->87|115->87|116->88|117->89|117->89|118->90|122->94|122->94|122->94|122->94|123->95|123->95|123->95|123->95|124->96|124->96|124->96|124->96|125->97|125->97|125->97|125->97|127->99|127->99|128->100|129->101|129->101|130->102|133->105|133->105|133->105|133->105|134->106|134->106|135->107|135->107|136->108|136->108|137->109|137->109|137->109|138->110|141->113|141->113|142->114|142->114|142->114|145->117|145->117|147->119|147->119|148->120|149->121|149->121|151->123|151->123|151->123|151->123|151->123|152->124|152->124|154->126|154->126|154->126|156->128|156->128|156->128|158->130|162->134|162->134|164->136|168->140|168->140|168->140|168->140|170->142|174->146|174->146|177->149|177->149|180->152|180->152
                  -- GENERATED --
              */
          