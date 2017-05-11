
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object guesthome_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class guesthome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.User,Seq[models.Foruminfo],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User,dbforuminfo : Seq[models.Foruminfo])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""
"""),format.raw/*2.1*/("""<!-- , dbforuminfo : Option[models.Foruminfo] -->
"""),_display_(/*3.2*/main(Messages("home.title") )/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
"""),format.raw/*4.1*/("""<body>
  <div id="wrap3">
    <div class="user col-md-6 col-md-offset-3">
        <div class="row">
            <hr class="col-md-12">
            <br><br>
            <h3 class="col-md-10 text-right" >&nbsp;&nbsp;&nbsp;&nbsp;"""),_display_(/*10.72*/Messages("welcome.guest")),format.raw/*10.97*/("""</h3>
            <!-- <div class="col-md-4 text-right">
                <img src=""""),_display_(/*12.28*/user/*12.32*/.avatarURL.getOrElse(routes.Assets.at("images/silhouette.png"))),format.raw/*12.95*/("""" height="40px" />
            </div> -->
            <hr class="col-md-12" >
        </div>
    </div>
    <div class = "container">
      <div id="headerwrap">
      </div>
</div>

    """),_display_(/*22.6*/model(user)),format.raw/*22.17*/("""
"""),format.raw/*23.1*/("""</div>
      """),_display_(/*24.8*/posts(user,dbforuminfo)),format.raw/*24.31*/("""


    """),_display_(/*27.6*/footer()),format.raw/*27.14*/("""

"""),format.raw/*29.1*/("""</body>
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,dbforuminfo:Seq[models.Foruminfo],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,dbforuminfo)(messages)

  def f:((models.User,Seq[models.Foruminfo]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,dbforuminfo) => (messages) => apply(user,dbforuminfo)(messages)

  def ref: this.type = this

}


}

/**/
object guesthome extends guesthome_Scope0.guesthome
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:43 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/guesthome.scala.html
                  HASH: 793b0b8d54c0d1accbe6054fba6aa4a893700039
                  MATRIX: 571->1|750->85|778->87|855->139|892->168|931->170|959->172|1219->405|1265->430|1378->516|1391->520|1475->583|1699->781|1731->792|1760->794|1801->809|1845->832|1882->843|1911->851|1942->855|1982->865
                  LINES: 20->1|25->1|26->2|27->3|27->3|27->3|28->4|34->10|34->10|36->12|36->12|36->12|46->22|46->22|47->23|48->24|48->24|51->27|51->27|53->29|54->30
                  -- GENERATED --
              */
          