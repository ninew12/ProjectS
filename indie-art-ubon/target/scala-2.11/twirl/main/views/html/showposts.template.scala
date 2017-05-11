
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object showposts_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class showposts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Form[forms.CommentForm.Data],Seq[models.Foruminfo],Seq[models.Comment],Seq[models.DBUser],models.User,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Forms: Form[forms.CommentForm.Data],dbforuminfo : Seq[models.Foruminfo], dbcommemt : Seq[models.Comment],users : Seq[models.DBUser],user: models.User)(implicit request: RequestHeader , messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.inline.fieldConstructor

Seq[Any](format.raw/*1.207*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
"""),_display_(/*4.2*/main(Messages("home.title"), Some(user))/*4.42*/{_display_(Seq[Any](format.raw/*4.43*/("""
   """),format.raw/*5.4*/("""<body>
     <div class="container">
            <br><br><br>
               <div class="panel panel-info">
                  <div class="panel-body">
                    <div class="container">
                      <div class="row">
                        """),_display_(/*12.26*/for(user
                          <- users) yield /*13.36*/{_display_(Seq[Any](format.raw/*13.37*/("""
                            """),format.raw/*14.29*/("""<div class="col-sm-3  ">
                                <ul class="breadcrumb">
                                <li>
                                    <img src="assets/images/"""),_display_(/*17.62*/user/*17.66*/.avatarURL),format.raw/*17.76*/("""" class="img-circle" width="80">
                                    <br>
                                    <a href="#"><i class="fa fa-user" aria-hidden="true"></i> by """),_display_(/*19.99*/user/*19.103*/.fullName),format.raw/*19.112*/("""</a>
                                </li>
                                    <span> <button class="btn btn-info btn-sm " ><i class="fa fa-plus" aria-hidden="true"></i>  FOLLOW</button></span>
                                    <br><a><i class="fa fa-calendar" aria-hidden="true"></i> 26/01/2560</a>
                                    <br><a><i class="fa fa-clock-o" aria-hidden="true"></i> 15:50 น.</a>
                                    <br><a href="#"><i class="fa fa-eye" aria-hidden="true"></i>  2 </a>
                                    <br>
                                    <a href="#"><i class="fa fa-tag" aria-hidden="true"></i> Other</a>

                                </ul>
                             </div>
                           """)))}),format.raw/*30.29*/("""
                             """),format.raw/*31.30*/("""<div class="col-sm-8  ">
                               """),_display_(/*32.33*/for(foruminfo
                                 <- dbforuminfo) yield /*33.49*/{_display_(Seq[Any](format.raw/*33.50*/("""
                                     """),format.raw/*34.38*/("""<h3>"""),_display_(/*34.43*/foruminfo/*34.52*/.title),format.raw/*34.58*/("""</h3>
                                     <hr>
                                  <!--upload image-->
                                   <img src= """"),_display_(/*37.48*/foruminfo/*37.57*/.imagepost),format.raw/*37.67*/("""" class="img-responsive" width="600">

                                 <!--add Description -->
                                  <h5> """),_display_(/*40.41*/foruminfo/*40.50*/.detail),format.raw/*40.57*/("""</h5>

                                  <!--video upload-->

                                    <div class="responsive-embed" >

                                      <iframe class="embed-responsive-item" src=""""),_display_(/*46.83*/foruminfo/*46.92*/.vdopost),format.raw/*46.100*/(""""  frameborder="0"  allowfullscreen ></iframe>

                                    </div>
                                  """)))}),format.raw/*49.36*/("""
                                   """),format.raw/*50.36*/("""<br>
                                  <div class="row">
                                                 <h5><span class="badge">2</span> Comment </h5>
                                                 <br>
                                                 <div class="col-sm-1">
                                                          <img class="img-responsive user-photo" src="assets/images/user.png" >
                                                 </div><!-- /col-sm-1 -->
                                  <div class="col-sm-10">
                                    """),_display_(/*58.38*/helper/*58.44*/.form(action = routes.IndieApplication.comment())/*58.93*/ {_display_(Seq[Any](format.raw/*58.95*/("""
                                        """),_display_(/*59.42*/helper/*59.48*/.CSRF.formField),format.raw/*59.63*/("""
                                                      """),_display_(/*60.56*/b3/*60.58*/.textarea( Forms("detail"), '_label -> "Comment" ,'rows -> 3 )),format.raw/*60.120*/("""
                                                    """),format.raw/*61.53*/("""<div class=" text-right" >
                                                         <button type="submit" class="btn btn-info  ">send</button>
                                                       </div>
                                                 """)))}),format.raw/*64.51*/("""
                                               """),format.raw/*65.48*/("""</div>
                                         </div><!-- /row -->
                                         <br>
                                 <div class="row">
                                   """),_display_(/*69.37*/for(comment
                                     <- dbcommemt) yield /*70.51*/{_display_(Seq[Any](format.raw/*70.52*/("""
                                        """),format.raw/*71.41*/("""<div class="col-sm-1">
                                                    <img class="img-responsive user-photo" src="assets/images/user.png" >
                                           </div><!-- /col-sm-1 -->

                                       <div class="col-sm-10">
                                            <div class="panel panel-default">
                                                 <div class="panel-heading">
                                                       <strong>myusername</strong> <span class="text-muted">commented 5 days ago</span>
                                                 </div>
                                          <div class="panel-body">
                                            <h5>"""),_display_(/*81.50*/comment/*81.57*/.detail),format.raw/*81.64*/("""</h5>
                                          </div><!-- /panel-body -->
                                        </div><!-- /panel panel-default -->
                                      </div><!-- /col-sm-10 -->
                                    """)))}),format.raw/*85.38*/("""
                                    """),format.raw/*86.37*/("""</div><!--row-->
                                   </div>   <!-- col-md-8 -->
                                </div>   <!-- row -->
                             </div><!-- container -->
                          </div><!-- panal-body -->
                        </div><!-- panal -->
                      </div><!-- container -->
              <!--link social-->

       </body>
       """)))}),format.raw/*96.9*/("""
"""))
      }
    }
  }

  def render(Forms:Form[forms.CommentForm.Data],dbforuminfo:Seq[models.Foruminfo],dbcommemt:Seq[models.Comment],users:Seq[models.DBUser],user:models.User,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(Forms,dbforuminfo,dbcommemt,users,user)(request,messages)

  def f:((Form[forms.CommentForm.Data],Seq[models.Foruminfo],Seq[models.Comment],Seq[models.DBUser],models.User) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (Forms,dbforuminfo,dbcommemt,users,user) => (request,messages) => apply(Forms,dbforuminfo,dbcommemt,users,user)(request,messages)

  def ref: this.type = this

}


}

/**/
object showposts extends showposts_Scope0.showposts
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:44 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/showposts.scala.html
                  HASH: 716bd56dbd6117de98ec6b4a6063fb3961d04feb
                  MATRIX: 653->1|987->206|1015->208|1058->262|1106->302|1144->303|1175->308|1468->574|1529->619|1568->620|1626->650|1835->832|1848->836|1879->846|2080->1020|2094->1024|2125->1033|2926->1803|2985->1834|3070->1892|3149->1955|3188->1956|3255->1995|3287->2000|3305->2009|3332->2015|3511->2167|3529->2176|3560->2186|3726->2325|3744->2334|3772->2341|4018->2560|4036->2569|4066->2577|4226->2706|4291->2743|4902->3327|4917->3333|4975->3382|5015->3384|5085->3427|5100->3433|5136->3448|5220->3505|5231->3507|5315->3569|5397->3623|5686->3881|5763->3930|5995->4135|6074->4198|6113->4199|6183->4241|6960->4991|6976->4998|7004->5005|7291->5261|7357->5299|7785->5697
                  LINES: 20->1|25->1|26->2|27->4|27->4|27->4|28->5|35->12|36->13|36->13|37->14|40->17|40->17|40->17|42->19|42->19|42->19|53->30|54->31|55->32|56->33|56->33|57->34|57->34|57->34|57->34|60->37|60->37|60->37|63->40|63->40|63->40|69->46|69->46|69->46|72->49|73->50|81->58|81->58|81->58|81->58|82->59|82->59|82->59|83->60|83->60|83->60|84->61|87->64|88->65|92->69|93->70|93->70|94->71|104->81|104->81|104->81|108->85|109->86|119->96
                  -- GENERATED --
              */
          