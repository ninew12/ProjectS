
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object posts_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class posts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.User,Seq[models.Foruminfo],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User,dbforuminfo : Seq[models.Foruminfo])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""
"""),format.raw/*2.1*/("""<!-- dbforuminfo : Seq[models.Foruminfo] -->
<!DOCTYPE html>
"""),_display_(/*4.2*/main(Messages("home.title"))/*4.30*/{_display_(Seq[Any](format.raw/*4.31*/("""

  """),format.raw/*6.3*/("""<div class="container">
      <h3><i class="fa fa-list-alt" aria-hidden="true"></i> Blender Artists Community</h3>
      <h5>   Welcome to the Blender Artists Community.</h5>
    <div class="panel panel-info">
       <div class="panel-body">
              <div class="container">
                  <div class="row">
                      <div class="col-md-11">
                          <ul class="breadcrumb">
                              <li>
                                  <i class="fa fa-list-alt" aria-hidden="true"></i><a href="#"> General Forums</a>
                              </li>
                          </ul>
                      </div>
                  </div>
             </div>

          <div class="section">
              <div class="container">
                  <div class="row">
                      <div class="col-md-11">
                          <table class="table  table-filte ">
                              <tbody>
                                """),_display_(/*29.34*/for(foruminfo
                                  <- dbforuminfo) yield /*30.50*/{_display_(Seq[Any](format.raw/*30.51*/("""
                                  """),format.raw/*31.35*/("""<tr>
                                      <td>
                                        <img src="assets/images/user.png" class="img-circle" width="60">
                                      </td>
                                      <td>
                                          <h5>
                                              <b>"""),_display_(/*37.51*/foruminfo/*37.60*/.title),format.raw/*37.66*/("""</b>
                                          </h5>
                                          <h6><i class="fa fa-user" aria-hidden="true"></i> by """),_display_(/*39.97*/user/*39.101*/.fullName),format.raw/*39.110*/("""</h6>
                                      </td>
                                      <td>
                                          <h5>
                                              <b>"""),_display_(/*43.51*/foruminfo/*43.60*/.detail),format.raw/*43.67*/("""</b>
                                          </h5>
                                      </td>
                                      <td><h5><i class="fa fa-calendar" aria-hidden="true"></i> 23/01/2560</h5></td>
                                      <td>
                                          <div class="btn-group">
                                            <a href=""""),_display_(/*49.55*/routes/*49.61*/.IndieApplication.userP(foruminfo.userID )),format.raw/*49.103*/(""" """),format.raw/*49.104*/(""""><button class="btn btn-warning" value="right" type="button" >Read More
                                                <i class="fa fa-fw fa-arrow-right"></i></button></a>
                                          </div>
                                      </td>
                                  </tr>
                                """)))}),format.raw/*54.34*/("""
                              """),format.raw/*55.31*/("""</tbody>
                          </table>
                      </div>
                  </div>
              </div>
          </div>
          <hr>
          <div class="container ">
          <nav aria-label="Page navigation">
             <ul class="pagination pagination-sm ">
              <li>
                  <a href="#" aria-label="Previous">
                 <span aria-hidden="true">&laquo;</span>
                 </a>
             </li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>

             <li>
                 <a href="#" aria-label="Next">
                 <span aria-hidden="true">&raquo;</span>
              </a>
             </li>
           </ul>
         </nav>
        </div><!-- container -->
      </div><!-- panal-body -->
    </div><!-- panal -->
  </div><!-- container -->

""")))}),format.raw/*86.2*/("""
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
object posts extends posts_Scope0.posts
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:43 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/posts.scala.html
                  HASH: 19edcbddc279a38f67c3de4cce267ac5c8ff2043
                  MATRIX: 563->1|742->85|770->87|859->151|895->179|933->180|965->186|2005->1199|2085->1263|2124->1264|2188->1300|2558->1643|2576->1652|2603->1658|2781->1809|2795->1813|2826->1822|3047->2016|3065->2025|3093->2032|3503->2415|3518->2421|3582->2463|3612->2464|3988->2809|4048->2841|5005->3768
                  LINES: 20->1|25->1|26->2|28->4|28->4|28->4|30->6|53->29|54->30|54->30|55->31|61->37|61->37|61->37|63->39|63->39|63->39|67->43|67->43|67->43|73->49|73->49|73->49|73->49|78->54|79->55|110->86
                  -- GENERATED --
              */
          