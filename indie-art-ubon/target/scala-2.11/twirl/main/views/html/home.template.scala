
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.User,Seq[models.Foruminfo],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User,dbforuminfo : Seq[models.Foruminfo])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""

"""),_display_(/*3.2*/main(Messages("home.title"), Some(user))/*3.42*/ {_display_(Seq[Any](format.raw/*3.44*/("""

    """),_display_(/*5.6*/modelsUser(user)),format.raw/*5.22*/("""

    """),_display_(/*7.6*/postsUser(user,dbforuminfo)),format.raw/*7.33*/("""


    """),format.raw/*10.5*/("""<br><br><br> <!--footer -->
       """),_display_(/*11.9*/footer()),format.raw/*11.17*/("""
""")))}),format.raw/*12.2*/("""
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
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:43 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/home.scala.html
                  HASH: ebeaa7b4de66ed7fdc454bf0fe8f01e049a95f16
                  MATRIX: 561->1|740->85|770->90|818->130|857->132|891->141|927->157|961->166|1008->193|1045->203|1108->240|1137->248|1170->251
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|29->5|31->7|31->7|34->10|35->11|35->11|36->12
                  -- GENERATED --
              */
          