
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object postsUser_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class postsUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[models.User,Seq[models.Foruminfo],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User,dbforuminfo : Seq[models.Foruminfo])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.86*/("""
"""),format.raw/*2.1*/("""<!-- dbforuminfo : Seq[models.Foruminfo] -->
<!DOCTYPE html>
"""),_display_(/*4.2*/main(Messages("home.title"),Some(user))/*4.41*/{_display_(Seq[Any](format.raw/*4.42*/("""

  """),format.raw/*6.3*/("""<div class="container">
      <br><br><br>
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
                                """),_display_(/*30.34*/for(foruminfo
                                  <- dbforuminfo) yield /*31.50*/{_display_(Seq[Any](format.raw/*31.51*/("""
                                  """),format.raw/*32.35*/("""<tr>
                                      <td>
                                        <img src="assets/images/user.png" class="img-circle" width="60">
                                      </td>
                                      <td>
                                          <h5>
                                              <b>"""),_display_(/*38.51*/foruminfo/*38.60*/.title),format.raw/*38.66*/("""</b>
                                          </h5>
                                          <h6><i class="fa fa-user" aria-hidden="true"></i> by """),_display_(/*40.97*/user/*40.101*/.fullName),format.raw/*40.110*/("""</h6>
                                      </td>
                                      <td>
                                          <h5>
                                              <b>"""),_display_(/*44.51*/foruminfo/*44.60*/.detail),format.raw/*44.67*/("""</b>
                                          </h5>
                                      </td>
                                      <td><h5><i class="fa fa-calendar" aria-hidden="true"></i> 23/01/2560</h5></td>
                                      <td>
                                          <div class="btn-group">
                                            <a href=""""),_display_(/*50.55*/routes/*50.61*/.IndieApplication.showpost(foruminfo.userID )),format.raw/*50.106*/(""" """),format.raw/*50.107*/(""""><button class="btn btn-warning" value="right" type="button" >Read More
                                                <i class="fa fa-fw fa-arrow-right"></i></button></a>
                                          </div>
                                      </td>
                                  </tr>
                                """)))}),format.raw/*55.34*/("""
                              """),format.raw/*56.31*/("""</tbody>
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

""")))}),format.raw/*87.2*/("""
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
object postsUser extends postsUser_Scope0.postsUser
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:43 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/postsUser.scala.html
                  HASH: 22474b84c0187b2ff1992a22a2e4f8d431383794
                  MATRIX: 571->1|750->85|778->87|867->151|914->190|952->191|984->197|2044->1230|2124->1294|2163->1295|2227->1331|2597->1674|2615->1683|2642->1689|2820->1840|2834->1844|2865->1853|3086->2047|3104->2056|3132->2063|3542->2446|3557->2452|3624->2497|3654->2498|4030->2843|4090->2875|5047->3802
                  LINES: 20->1|25->1|26->2|28->4|28->4|28->4|30->6|54->30|55->31|55->31|56->32|62->38|62->38|62->38|64->40|64->40|64->40|68->44|68->44|68->44|74->50|74->50|74->50|74->50|79->55|80->56|111->87
                  -- GENERATED --
              */
          