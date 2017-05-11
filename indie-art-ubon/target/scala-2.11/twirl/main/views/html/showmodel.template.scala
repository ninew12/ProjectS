
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showmodel_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object showmodel_Scope1 {
import forms._

class showmodel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.User,Form[CommentForm.Data],Seq[models.Comment],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.User, commentForm: Form[CommentForm.Data],dbcommemt : Seq[models.Comment])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.inline.fieldConstructor

Seq[Any](format.raw/*3.143*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
"""),_display_(/*6.2*/main(Messages("home.title"),Some(user))/*6.41*/{_display_(Seq[Any](format.raw/*6.42*/("""

  """),format.raw/*8.3*/("""<div class="container">
    <div class="col-sm-8 ">
      <br><br>
      <h3>Name Models</h3>
    </div>
    <div class="col-sm-8 " >
      <!--upload file html-->
      <iframe src=""""),_display_(/*15.21*/routes/*15.27*/.Assets.at("members/01/car2.html")),format.raw/*15.61*/("""" name="iframe_a" height="480" width="740" style="border:none;"></iframe>
      <br>

      <a href="#"><i class="fa fa-eye" aria-hidden="true"></i>  2 </a>
      <a href="#"><i class="fa fa-thumbs-o-up" aria-hidden="true"></i>  1 </a>

      <div class=" text-right" >
        <button class="btn btn-info btn-sm " ><i class="fa fa-plus" aria-hidden="true"></i>  FOLLOW</button>
        <button class="btn btn-success btn-sm " ><i class="fa fa-plus-square" aria-hidden="true"></i>  COLLECT</button>
        <button class="btn btn-warning btn-sm " ><i class="fa fa-download" aria-hidden="true"></i>  DOWNLOAD</button>
      </div>

      <div class="row">
        <h5><span class="badge">2</span> Comment </h5>
        <br>
        <div class="col-sm-1">
          <img class="img-responsive user-photo" src="assets/images/user.png" >
        </div><!-- /col-sm-1 -->
        <div class="col-sm-10">
          """),_display_(/*34.12*/helper/*34.18*/.form(action = routes.IndieApplication.comment)/*34.65*/ {_display_(Seq[Any](format.raw/*34.67*/("""
            """),_display_(/*35.14*/helper/*35.20*/.CSRF.formField),format.raw/*35.35*/("""

            """),_display_(/*37.14*/b3/*37.16*/.hidden( "commenterID", user.userID )),format.raw/*37.53*/("""

            """),_display_(/*39.14*/b3/*39.16*/.textarea( commentForm("detail"), '_label -> "details", 'rows -> 3 )),format.raw/*39.84*/("""

            """),format.raw/*41.13*/("""<div class=" text-right" >
              <button type="submit" class="btn btn-info  ">send</button>
            </div>
          """)))}),format.raw/*44.12*/("""
        """),format.raw/*45.9*/("""</div>
      </div><!-- /row -->
      <br>

      <div class="row">
        """),_display_(/*50.10*/for(comment
          <- dbcommemt) yield /*51.24*/{_display_(Seq[Any](format.raw/*51.25*/("""
        """),format.raw/*52.9*/("""<div class="col-sm-1">
          <img class="img-responsive user-photo" src="assets/images/user.png" >
        </div><!-- /col-sm-1 -->
        <div class="col-sm-10">

          <div class="panel panel-default">
            <div class="panel-heading">
              <strong>"""),_display_(/*59.24*/comment/*59.31*/.userID),format.raw/*59.38*/("""</strong> <span class="text-muted">commented 5 days ago</span>
            </div>
            <div class="panel-body">
              <h5>"""),_display_(/*62.20*/comment/*62.27*/.detail),format.raw/*62.34*/("""</h5>
            </div><!-- /panel-body -->
          </div><!-- /panel panel-default -->
        </div><!-- /col-sm-10 -->
      """)))}),format.raw/*66.8*/("""
      """),format.raw/*67.7*/("""</div><!--row-->


    </div><!--col-md-8-->

    <div id="land-widget" class="col-sm-4 list-group ">
      <li  class=" list-group-item ">
        <img  src= "assets/images/user.png" class="img-circle " width="70">
        <h5 class="list-group-item-heading">By name user</h5>
        <a href="/profile" class="btn btn-info btn-block "  ><i class="fa fa-user" aria-hidden="true"></i>  VIEW PROFILE</a>
      </li>

      <li class="list-group-item">
        <h5 class="list-group-item-heading">About This Model</h5>
        <h5>Description</h5>
        <h5>Date</h5>
        <h5>Time</h5>
        <a href="#"><i class="fa fa-tag" aria-hidden="true"></i></a>
      </li>
      <li id="super_recent_posts_widget-3" class="widget recent_custom_posts testimonial list-group-item">
        <h4 class="widgettitle list-group-item-heading"><a href="#">Vad tycker andra om Vulkan</a></h4>
        <div class="recent_custom_posts_item">
          <div class="post-entry">
            <div class="testemonial-item">
              <div class="mb-thumb"></div>
              <blockquote cite="https://www.vulkanmedia.se/testimonial/jag-ar-mycket-nojd-med-det-fardiga-resultatet/" title="Jag är mycket nöjd med det färdiga resultatet">
                <a href="https://www.vulkanmedia.se/testimonial/jag-ar-mycket-nojd-med-det-fardiga-resultatet/">
                  <p><i class="fa fa-quote-left"></i> Jag har från första stund varit nöjd med Vulkan. Jag har fått bra handledning och fint bemötande. <i class="fa fa-quote-right"></i></p>
                </a>
                <i class="fa fa-user fa-fw pull-left"></i><small>Thomas Nybom                                            </small>
              </blockquote>
            </div>
            <div class="clear"> </div>
          </div>
        </div>
      </li>
    </div><!--col-md-4 list-group-->
  </div><!--container-->

  <!-- /Page -->

  """)))}),format.raw/*108.4*/("""
"""))
      }
    }
  }

  def render(user:models.User,commentForm:Form[CommentForm.Data],dbcommemt:Seq[models.Comment],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,commentForm,dbcommemt)(request,messages)

  def f:((models.User,Form[CommentForm.Data],Seq[models.Comment]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,commentForm,dbcommemt) => (request,messages) => apply(user,commentForm,dbcommemt)(request,messages)

  def ref: this.type = this

}


}
}

/**/
object showmodel extends showmodel_Scope0.showmodel_Scope1.showmodel
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:44 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/showmodel.scala.html
                  HASH: 4738ff562d7e927ccea48a52eb44e915228ff64a
                  MATRIX: 653->20|923->161|951->163|994->217|1041->256|1079->257|1111->263|1329->454|1344->460|1399->494|2355->1423|2370->1429|2426->1476|2466->1478|2508->1493|2523->1499|2559->1514|2603->1531|2614->1533|2672->1570|2716->1587|2727->1589|2816->1657|2860->1673|3024->1806|3061->1816|3171->1899|3223->1935|3262->1936|3299->1946|3609->2229|3625->2236|3653->2243|3821->2384|3837->2391|3865->2398|4031->2534|4066->2542|6030->4475
                  LINES: 23->3|28->3|29->4|30->6|30->6|30->6|32->8|39->15|39->15|39->15|58->34|58->34|58->34|58->34|59->35|59->35|59->35|61->37|61->37|61->37|63->39|63->39|63->39|65->41|68->44|69->45|74->50|75->51|75->51|76->52|83->59|83->59|83->59|86->62|86->62|86->62|90->66|91->67|132->108
                  -- GENERATED --
              */
          