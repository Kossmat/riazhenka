
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

"""),format.raw/*5.1*/("""<body>
<h2>"""),_display_(/*6.6*/message),format.raw/*6.13*/("""</h2>

<header class="base-header">

    <a href="#">
        <img class="logo" src='"""),_display_(/*11.33*/routes/*11.39*/.Assets.at("images/logo.png")),format.raw/*11.68*/("""'>
    </a>


    <section class="phone-number">
        <h1>(+495)777-77-77</h1>
        <p>доставка бесплатно</p>
    </section> <!-- end phone-number -->

    <section class="contact">
        <div class="login">
            <button class="btn" type="">Регистрация</button>
            <button class="btn" type="">Залогиниться</button>
        </div>

        <div class="basket">
            <p>Корзина</p>
            <input type="text" name="" value="" placeholder="0 товаров 0 рублей">
            <button class="btn" type="">оформить заказ</button>
        </div>
    </section> <!-- end contact -->

    <nav>
        <ul class="menu">
            <li><a href="">Меню</li>
            <li><a href="">О доставке</a></li>
            <li><a href="">Акции</a></li>
            <li><a href="">Новости</a></li>
            <li><a href="">О компании</a></li>
            <li><a href="">Отзывы</a></li>
            <li><input type="search" name="q" placeholder="Поиск">
                <input type="submit" value="Найти"></li>
        </ul> <!-- end menu -->
    </nav>

</header> <!-- end header -->

<section class="banner" style='background: #F39C12 url("""),_display_(/*48.57*/routes/*48.63*/.Assets.at("images/banners/banner.jpg")),format.raw/*48.102*/("""); background-repeat: no-repeat; background-size: cover;'>
    <article class="banner-wrapper">

        <h1>
            let us make your lives easier
        </h1>

        <p>
            We specialize in crafting awesome ideas for web, mobile and beyond.
        </p>

        <button class="btn"><i class="fa fa-chevron-down"></i>
        </button>
    </article>

</section> <!-- end banner -->



<main>

    <section class="testimonials">
        <ul>
            <li>
                <h3>Отзыв о</h3>
                <p>Morbi in sem quis dui placerat ornare. Pellentesque odio nisi, euismod in, pharetra a, ultricies in, diam. Sed arcu. Cras consequat.
                </p>
            </li>
            <li>
                <h3>Отзыв о</h3>
                <p>Morbi in sem quis dui placerat ornare. Pellentesque odio nisi, euismod in, pharetra a, ultricies in, diam. Sed arcu. Cras consequat.
                </p>
            </li>
            <li>
                <h3>Отзыв о</h3>
                <p>Morbi in sem quis dui placerat ornare. Pellentesque odio nisi, euismod in, pharetra a, ultricies in, diam. Sed arcu. Cras consequat.
                </p>
            </li>
            <li>
                <h3>Отзыв о</h3>
                <p>Morbi in sem quis dui placerat ornare. Pellentesque odio nisi, euismod in, pharetra a, ultricies in, diam. Sed arcu. Cras consequat.
                </p>
            </li>
        </ul>
    </section> <!-- end testimonials -->

    <section class="product--block">

        <aside class="product--offer">
            <div class="product--day">
                <h3>Ограниченное предложение</h3>
                <a href=""><img src="img/offer.png" alt=""></a>
            </div>

            <div class="product--timer">
                <h3>Таймер</h3>
                <a href=""><img src="img/offer.png" alt=""></a>
            </div>

            <div class="product--day2">
                <h3>Напиток дня</h3>
                <a href=""><img src="img/offer.png" alt=""></a>
            </div>

            <div class="product--testimonial">
                <h3>Комент дня</h3>
                <a href=""><img src="img/offer.png" alt=""></a>
            </div>
        </aside>  <!-- end product-offer -->

        <section class="product--main">
            <header class="product--header">
                <!--ul class="product-type">
                    <h2>Пиво</h2>
                    <li><a href="">Светлое</a></li>
                    <li><a href="">Тёмное</a></li>
                    <li><a href="">Напитки</a></li>
                </ul-->

                <ul class="product--type">
                    <li>Суши</li>
                    <li><a href="">Суши</a></li>
                    <li><a href="">Сашими</a></li>
                    <li><a href="">Ролы</a></li>
                    <li><a href="">Сеты</a></li>
                </ul>
            </header> <!-- end product-header -->

            <ul class="product">
                """),_display_(/*137.18*/for(item <- content) yield /*137.38*/{_display_(Seq[Any](format.raw/*137.39*/("""
                    """),format.raw/*138.21*/("""<li class="product--item">
                        <figure>
                            <img class="product--image" src="""),_display_(/*140.62*/{val a = item.get("imgSrc"); routes.Assets.at(""+a)}),format.raw/*140.114*/(""" """),format.raw/*140.115*/("""alt=""/>

                            <figcaption class="product--about">
                                <h3 class="product--name">"""),_display_(/*143.60*/item/*143.64*/.get("name")),format.raw/*143.76*/("""</h3>
                                <p class="product--description"><strong>Lorem ipsum</strong>"""),_display_(/*144.94*/item/*144.98*/.get("description")),format.raw/*144.117*/("""
                                """),format.raw/*145.33*/("""</p>
                                <button class="btn">
                                    Купить
                                </button>
                                    <span class="product--price">
                                        """),_display_(/*150.42*/item/*150.46*/.get("price")),format.raw/*150.59*/(""" """),format.raw/*150.60*/("""rub
                                    </span>
                            </figcaption>
                        </figure>
                    </li> <!-- end product-item -->
                """)))}),format.raw/*155.18*/("""
            """),format.raw/*156.13*/("""</ul>
        </section> <!-- end product-main -->
    </section> <!-- end product-block -->



    <section class="product--line">
        <header class="product--header">
            <ul class="product-type">
                <li>Пыво</li>
                <li><a href="">Светлое</a></li>
                <li><a href="">Тёмное</a></li>
                <li><a href="">Напитки</a></li>
            </ul>
        </header> <!-- /header -->

        <!--<ul class="product--type">-->
            <!--<li class="product--item">-->
                <!--<figure>-->
                    <!--<img class="product--image" src="""),format.raw/*175.57*/("""{"""),format.raw/*175.58*/("""val a = item.get("imgSrc"); routes.Assets.at(""+a)"""),format.raw/*175.108*/("""}"""),format.raw/*175.109*/(""" """),format.raw/*175.110*/("""alt=""/>-->

                    <!--<figcaption class="product--about">-->
                        <!--<h3 class="product--name">item.get("name")</h3>-->
                        <!--<p class="product--description"><strong>Lorem ipsum</strong> dolor sit amet, consectetur adipiscing elit adipiscing elit-->
                        <!--</p>-->
                        <!--<button class="btn">-->
                            <!--Купить-->
                        <!--</button>-->
                                <!--<span class="product--price">-->
                                    <!--item.get("price") rub-->
                                <!--</span>-->
                    <!--</figcaption>-->
                <!--</figure>-->
            <!--</li> &lt;!&ndash; end product-item &ndash;&gt;-->

        </ul>
    </section>  <!-- end product-line -->


    <nav>
        <ul class="menu">
            <li><a href="">Меню</li>
            <li><a href="">О доставке</a></li>
            <li><a href="">Акции</a></li>
            <li><a href="">Новости</a></li>
            <li><a href="">О компании</a></li>
            <li><a href="">Отзывы</a></li>
            <li><input type="search" name="q" placeholder="Поиск">
                <input type="submit" value="Найти"></li>
        </ul> <!-- end menu -->
    </nav>
</main>


<footer class="base-footer">

    <section class="base-footer-wrapper">
        <div>
            <adress>
                <span>Доставка</span> Суши на дом
            </adress></br>
            <adress class="base-footer-copyright">Copyright © 2015 KossMos
            </adress>
        </div>

        <div class="product--menu">
            <h3>Пыво</h3>
            <ul>
                <li>товар 1</li>
                <li>товар 2</li>
                <li>товар 3</li>
            </ul>
        </div>

        <div class="product--menu">
            <h3>Суши</h3>
            <ul>
                <li>товар 1</li>
                <li>товар 2</li>
                <li>товар 3</li>
            </ul>
        </div>

        <div class="delivery">
            <a href=""><img src='"""),_display_(/*240.35*/routes/*240.41*/.Assets.at("images/delivery.png")),format.raw/*240.74*/("""' alt=""></a>
        </div>

    </section>
</footer> <!-- end base-footer -->


<!--  [ scripts ]  -->
<!--<script src="http://code.jquery.com/jquery-latest.js"></script>-->
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap.js"></script>

<!--<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>-->
<script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.2.min.js"><\/script>')</script>
<!--<script src="js/plugins.js"></script>-->
<!--<script src="js/main.js"></script>-->


<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
<script>
            (function(b,o,i,l,e,r)"""),format.raw/*260.35*/("""{"""),format.raw/*260.36*/("""b.GoogleAnalyticsObject=l;b[l]||(b[l]=
            function()"""),format.raw/*261.23*/("""{"""),format.raw/*261.24*/("""(b[l].q=b[l].q||[]).push(arguments)"""),format.raw/*261.59*/("""}"""),format.raw/*261.60*/(""");b[l].l=+new Date;
            e=o.createElement(i);r=o.getElementsByTagName(i)[0];
            e.src='//www.google-analytics.com/analytics.js';
            r.parentNode.insertBefore(e,r)"""),format.raw/*264.43*/("""}"""),format.raw/*264.44*/("""(window,document,'script','ga'));
            ga('create','UA-XXXXX-X');ga('send','pageview');
        </script>
</body>

""")))}))}
  }

  def render(message:String,content:List[Map[String, Object]]): play.twirl.api.HtmlFormat.Appendable = apply(message,content)

  def f:((String,List[Map[String, Object]]) => play.twirl.api.HtmlFormat.Appendable) = (message,content) => apply(message,content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Mar 07 17:21:41 MSK 2015
                  SOURCE: /Users/eldorado/Desktop/activator-1.2.12-minimal/play-java-intro/app/views/index.scala.html
                  HASH: 73ea3bcb020b49191060a06a5479920f34ba8a55
                  MATRIX: 749->1|889->53|917->56|948->79|987->81|1015->83|1052->95|1079->102|1192->188|1207->194|1257->223|2444->1383|2459->1389|2520->1428|5550->4430|5587->4450|5627->4451|5677->4472|5826->4593|5901->4645|5932->4646|6093->4779|6107->4783|6141->4795|6268->4894|6282->4898|6324->4917|6386->4950|6664->5200|6678->5204|6713->5217|6743->5218|6968->5411|7010->5424|7653->6038|7683->6039|7763->6089|7794->6090|7825->6091|9971->8209|9987->8215|10042->8248|10730->8907|10760->8908|10850->8969|10880->8970|10944->9005|10974->9006|11191->9194|11221->9195
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|34->6|34->6|39->11|39->11|39->11|76->48|76->48|76->48|165->137|165->137|165->137|166->138|168->140|168->140|168->140|171->143|171->143|171->143|172->144|172->144|172->144|173->145|178->150|178->150|178->150|178->150|183->155|184->156|203->175|203->175|203->175|203->175|203->175|268->240|268->240|268->240|288->260|288->260|289->261|289->261|289->261|289->261|292->264|292->264
                  -- GENERATED --
              */
          