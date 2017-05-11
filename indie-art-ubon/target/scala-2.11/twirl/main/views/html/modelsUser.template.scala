
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modelsUser_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class modelsUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.User,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
"""),_display_(/*3.2*/main(Messages("home.title"),Some(user))/*3.41*/{_display_(Seq[Any](format.raw/*3.42*/("""

"""),format.raw/*5.1*/("""<div class="container">
          <br><br>
           <h3><i class="fa fa-cubes" aria-hidden="true"></i> The 3D Model </h3>
           <br><br>
           <div class="thumbnails">
               <div class="box">
                   <a  class="image fit"><img src="assets/images/model/car.png" alt="" width="600" height="200"/></a>
               <div class="text-left">
                   <a href="#"><i class="fa fa-eye" aria-hidden="true"></i> 1</a>
                   <a href="#"><i class="fa fa-comments" aria-hidden="true"></i> 2</a>
                   <a href="#"><i class="fa fa-thumbs-o-up" aria-hidden="true"></i> 5</a>
               </div>
              <div class="inner">
                   <h5>Car model 3d</h5>
                    <a href="/showmodel" class="button fit" ><i class="fa fa-eye" aria-hidden="true"></i> Watch</a>
              </div>
            </div>

            <div class="box">
                   <a class="image fit"><img src="assets/images/model/jagun.png" alt="" width="600" height="200"/></a>
              <div class="text-left">
                   <a href="#"><i class="fa fa-eye" aria-hidden="true"></i> 2</a>
                   <a href="#"><i class="fa fa-comments" aria-hidden="true"></i> 2</a>
                   <a href="#"><i class="fa fa-thumbs-o-up" aria-hidden="true"></i> 3</a>
              </div>
            <div class="inner">
                  <h5>Vase model 3d </h5>
                  <a href="/showmodel" class="button style2 fit" ><i class="fa fa-eye" aria-hidden="true"></i> Watch</a>
                </div>
            </div>

            <div class="box">
                   <a class="image fit"><img src="assets/images/model/king.png" alt="" width="600" height="200"/></a>
              <div class="text-left">
                   <a href="#"><i class="fa fa-eye" aria-hidden="true"></i> 3</a>
                   <a href="#"><i class="fa fa-comments" aria-hidden="true"></i> 2</a>
                   <a href="#"><i class="fa fa-thumbs-o-up" aria-hidden="true"></i> 2</a>
              </div>
              <div class="inner">
                   <h5>Monkey model 3d</h5>
                   <a href="/showmodel" class="button style3 fit" > <i class="fa fa-eye" aria-hidden="true"></i> Watch</a>
              </div>
            </div>
          </div><!--thumbnails-->

          <div class="text-center ">
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
        </div>
       </div><!-- container -->


""")))}),format.raw/*73.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user)(messages)

  def f:((models.User) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (user) => (messages) => apply(user)(messages)

  def ref: this.type = this

}


}

/**/
object modelsUser extends modelsUser_Scope0.modelsUser
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:43 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/modelsUser.scala.html
                  HASH: fa9790bdfb38394c57b055e5e2f30778eaa1e114
                  MATRIX: 551->1|694->49|722->51|765->69|812->108|850->109|880->113|3986->3189
                  LINES: 20->1|25->1|26->2|27->3|27->3|27->3|29->5|97->73
                  -- GENERATED --
              */
          