
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object selectPosts_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class selectPosts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Form[forms.CommentForm.Data],Seq[models.Foruminfo],Seq[models.Comment],Seq[models.DBUser],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Forms: Form[forms.CommentForm.Data],dbforuminfo : Seq[models.Foruminfo], dbcommemt : Seq[models.Comment],users : Seq[models.DBUser])(implicit request: RequestHeader , messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.inline.fieldConstructor

Seq[Any](format.raw/*1.189*/("""
"""),format.raw/*2.1*/("""<!-- , dbcomment : Seq[models.Comment] -->
<!DOCTYPE html>
"""),_display_(/*5.2*/main(Messages("home.title"))/*5.30*/{_display_(Seq[Any](format.raw/*5.31*/("""
   """),format.raw/*6.4*/("""<body>
     <div class="container">
            <br><br><br>
               <div class="panel panel-info">
                  <div class="panel-body">
                    <div class="container">
                      <div class="row">
                        """),_display_(/*13.26*/for(user
                          <- users) yield /*14.36*/{_display_(Seq[Any](format.raw/*14.37*/("""
                            """),format.raw/*15.29*/("""<div class="col-sm-3  ">
                                <ul class="breadcrumb">
                                <li>
                                    <img src="assets/images/"""),_display_(/*18.62*/user/*18.66*/.avatarURL),format.raw/*18.76*/("""" class="img-circle" width="80">
                                    <br>
                                    <a href="#"><i class="fa fa-user" aria-hidden="true"></i> by """),_display_(/*20.99*/user/*20.103*/.fullName),format.raw/*20.112*/("""</a>
                                </li>
                                    <span> <button class="btn btn-info btn-sm " ><i class="fa fa-plus" aria-hidden="true"></i>  FOLLOW</button></span>
                                    <br><a><i class="fa fa-calendar" aria-hidden="true"></i> 26/01/2560</a>
                                    <br><a><i class="fa fa-clock-o" aria-hidden="true"></i> 15:50 น.</a>
                                    <br><a href="#"><i class="fa fa-eye" aria-hidden="true"></i>  2 </a>
                                    <br>
                                    <a href="#"><i class="fa fa-tag" aria-hidden="true"></i> Other</a>

                                </ul>
                             </div>
                           """)))}),format.raw/*31.29*/("""
                        """),format.raw/*32.25*/("""<div class="col-sm-8  ">
                          """),_display_(/*33.28*/for(foruminfo
                            <- dbforuminfo) yield /*34.44*/{_display_(Seq[Any](format.raw/*34.45*/("""
                                """),format.raw/*35.33*/("""<h3>"""),_display_(/*35.38*/foruminfo/*35.47*/.title),format.raw/*35.53*/("""</h3>
                                <hr>
                             <!--upload image-->
                              <img src= """"),_display_(/*38.43*/foruminfo/*38.52*/.imagepost),format.raw/*38.62*/("""" class="img-responsive" width="600">

                            <!--add Description -->
                             <h5> """),_display_(/*41.36*/foruminfo/*41.45*/.detail),format.raw/*41.52*/("""</h5>

                             <!--video upload-->

                               <div class="embed-responsive embed-responsive-16by9" >

                                 <iframe class="embed-responsive-item" src=""""),_display_(/*47.78*/foruminfo/*47.87*/.vdopost),format.raw/*47.95*/("""" style="border:none;"></iframe>

                               </div>
                             """)))}),format.raw/*50.31*/("""
                              """),format.raw/*51.31*/("""<br>
                             <div class="row">
                                            <h5><span class="badge">2</span> Comment </h5>
                                            <br>
                                            <div class="col-sm-1">
                                                     <img class="img-responsive user-photo" src="assets/images/user.png" >
                                            </div><!-- /col-sm-1 -->
                             <div class="col-sm-10">
                               """),_display_(/*59.33*/helper/*59.39*/.form(action = routes.IndieApplication.comment())/*59.88*/ {_display_(Seq[Any](format.raw/*59.90*/("""
                                   """),_display_(/*60.37*/helper/*60.43*/.CSRF.formField),format.raw/*60.58*/("""
                                                 """),_display_(/*61.51*/b3/*61.53*/.textarea( Forms("detail"), '_label -> "Comment" ,'rows -> 3 )),format.raw/*61.115*/("""
                                               """),format.raw/*62.48*/("""<div class=" text-right" >
                                                    <button type="submit" class="btn btn-info  ">send</button>
                                                  </div>
                                            """)))}),format.raw/*65.46*/("""
                                          """),format.raw/*66.43*/("""</div>
                                    </div><!-- /row -->
                                    <br>
                            <div class="row">
                              """),_display_(/*70.32*/for(comment
                                <- dbcommemt) yield /*71.46*/{_display_(Seq[Any](format.raw/*71.47*/("""
                                   """),format.raw/*72.36*/("""<div class="col-sm-1">
                                               <img class="img-responsive user-photo" src="assets/images/user.png" >
                                      </div><!-- /col-sm-1 -->

                                  <div class="col-sm-10">
                                       <div class="panel panel-default">
                                            <div class="panel-heading">
                                                  <strong>myusername</strong> <span class="text-muted">commented 5 days ago</span>
                                            </div>
                                     <div class="panel-body">
                                       <h5>"""),_display_(/*82.45*/comment/*82.52*/.detail),format.raw/*82.59*/("""</h5>
                                     </div><!-- /panel-body -->
                                   </div><!-- /panel panel-default -->
                                 </div><!-- /col-sm-10 -->
                               """)))}),format.raw/*86.33*/("""
                               """),format.raw/*87.32*/("""</div><!--row-->
                              </div>   <!-- col-md-8 -->

                           </div>   <!-- row -->
                        </div><!-- container -->
                     </div><!-- panal-body -->
                   </div><!-- panal -->
                 </div><!-- container -->
         <!--link social-->

  </body>
""")))}),format.raw/*98.2*/("""
"""))
      }
    }
  }

  def render(Forms:Form[forms.CommentForm.Data],dbforuminfo:Seq[models.Foruminfo],dbcommemt:Seq[models.Comment],users:Seq[models.DBUser],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(Forms,dbforuminfo,dbcommemt,users)(request,messages)

  def f:((Form[forms.CommentForm.Data],Seq[models.Foruminfo],Seq[models.Comment],Seq[models.DBUser]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (Forms,dbforuminfo,dbcommemt,users) => (request,messages) => apply(Forms,dbforuminfo,dbcommemt,users)(request,messages)

  def ref: this.type = this

}


}

/**/
object selectPosts extends selectPosts_Scope0.selectPosts
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:43 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/selectPosts.scala.html
                  HASH: 34385b10427a47bf4a8392c98998eead9a730d1b
                  MATRIX: 645->1|961->188|989->190|1076->288|1112->316|1150->317|1181->322|1474->588|1535->633|1574->634|1632->664|1841->846|1854->850|1885->860|2086->1034|2100->1038|2131->1047|2932->1817|2986->1843|3066->1896|3140->1954|3179->1955|3241->1989|3273->1994|3291->2003|3318->2009|3482->2146|3500->2155|3531->2165|3687->2294|3705->2303|3733->2310|3987->2537|4005->2546|4034->2554|4170->2659|4230->2691|4801->3235|4816->3241|4874->3290|4914->3292|4979->3330|4994->3336|5030->3351|5109->3403|5120->3405|5204->3467|5281->3516|5555->3759|5627->3803|5839->3988|5913->4046|5952->4047|6017->4084|6749->4789|6765->4796|6793->4803|7060->5039|7121->5072|7504->5425
                  LINES: 20->1|25->1|26->2|28->5|28->5|28->5|29->6|36->13|37->14|37->14|38->15|41->18|41->18|41->18|43->20|43->20|43->20|54->31|55->32|56->33|57->34|57->34|58->35|58->35|58->35|58->35|61->38|61->38|61->38|64->41|64->41|64->41|70->47|70->47|70->47|73->50|74->51|82->59|82->59|82->59|82->59|83->60|83->60|83->60|84->61|84->61|84->61|85->62|88->65|89->66|93->70|94->71|94->71|95->72|105->82|105->82|105->82|109->86|110->87|121->98
                  -- GENERATED --
              */
          