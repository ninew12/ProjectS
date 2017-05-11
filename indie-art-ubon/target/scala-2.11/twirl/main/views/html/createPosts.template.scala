
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createPosts_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class createPosts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[forms.forumForm.Data],models.User,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(forumForm: Form[forms.forumForm.Data],user: models.User)(implicit request: RequestHeader , messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.inline.fieldConstructor

Seq[Any](format.raw/*1.113*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

"""),_display_(/*5.2*/main(Messages("home.title"),Some(user))/*5.41*/{_display_(Seq[Any](format.raw/*5.42*/("""
"""),format.raw/*6.1*/("""<div class="container">
  <br><br><br>
  <div class="mt mb ">
    <h3><i class="fa fa-pencil-square-o" aria-hidden="true"></i> CREATE POSTS</h3>
  </div>
  <div class="panel panel-info">
    <div class="panel-body">
      <div class="container">
        <div class="row">
          <div class="col-sm-1  ">
          </div>
          <div class="col-sm-8  ">
            """),_display_(/*18.14*/helper/*18.20*/.form(action = routes.IndieApplication.forum())/*18.67*/ {_display_(Seq[Any](format.raw/*18.69*/("""
            """),_display_(/*19.14*/helper/*19.20*/.CSRF.formField),format.raw/*19.35*/("""

            """),format.raw/*21.13*/("""<h5 >หัวข้อกระทู้</h5>
            """),_display_(/*22.14*/b3/*22.16*/.hidden( "forumID", user.userID )),format.raw/*22.49*/("""
            """),_display_(/*23.14*/b3/*23.16*/.text( forumForm("title"), '_label -> "Topic" )),format.raw/*23.63*/("""
            """),_display_(/*24.14*/b3/*24.16*/.textarea( forumForm("detail"), '_label -> "details" ,'rows -> 3 )),format.raw/*24.82*/("""
            """),_display_(/*25.14*/b3/*25.16*/.file( forumForm("imagepost"), '_label -> "File" )),format.raw/*25.66*/("""
            """),_display_(/*26.14*/b3/*26.16*/.text( forumForm("vdopost"), '_label -> "Link", '_help -> "@@youtube" )),format.raw/*26.87*/("""

            """),format.raw/*28.13*/("""<div class=" text-right">
              <button type="submit" class="btn btn-primary">Submit</button> &nbsp; &nbsp;
              <button type="submit" class="btn btn-danger">Cancel</button>
            </div>

            """)))}),format.raw/*33.14*/("""
          """),format.raw/*34.11*/("""</div>   <!-- col-md-8 -->
        </div>   <!-- row -->
      </div><!-- container -->
    </div><!-- panal-body -->
  </div><!-- panal -->
</div><!--inner-->
"""),_display_(/*40.2*/footer()),format.raw/*40.10*/("""
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(forumForm:Form[forms.forumForm.Data],user:models.User,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(forumForm,user)(request,messages)

  def f:((Form[forms.forumForm.Data],models.User) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (forumForm,user) => (request,messages) => apply(forumForm,user)(request,messages)

  def ref: this.type = this

}


}

/**/
object createPosts extends createPosts_Scope0.createPosts
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:43 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/createPosts.scala.html
                  HASH: db68d45ba72583380198dac8bc098f975df94e39
                  MATRIX: 594->1|834->112|862->114|907->170|954->209|992->210|1020->212|1431->596|1446->602|1502->649|1542->651|1584->666|1599->672|1635->687|1679->703|1743->740|1754->742|1808->775|1850->790|1861->792|1929->839|1971->854|1982->856|2069->922|2111->937|2122->939|2193->989|2235->1004|2246->1006|2338->1077|2382->1093|2642->1322|2682->1334|2875->1501|2904->1509|2937->1512
                  LINES: 20->1|25->1|26->2|28->5|28->5|28->5|29->6|41->18|41->18|41->18|41->18|42->19|42->19|42->19|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24|48->25|48->25|48->25|49->26|49->26|49->26|51->28|56->33|57->34|63->40|63->40|64->41
                  -- GENERATED --
              */
          