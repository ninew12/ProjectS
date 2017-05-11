
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.5*/("""<br><br>
    <div id="social">
      <div class="row ">
        <div class="col-lg-1  col-lg-offset-4">
          <a href="https://www.facebook.com"><img src="assets/images/social/facebook.png" class="img-responsive"></a>
        </div>
        <div class="col-lg-1">
          <a href="https://plus.google.com"><img src="assets/images/social/google.png" class="img-responsive"></a>
        </div>
        <div class="col-lg-1">
          <a href="https://www.instagram.com"><img src="assets/images/social/instagram.png" class="img-responsive"></a>
        </div>
        <div class="col-lg-1">
          <a href= "https://www.twitter.com"><img src="assets/images/social/twitter.png" class="img-responsive"></a>
        </div>
        <div class="col-lg-1">
          <a href="https://www.pinterest.com"><img src="assets/images/social/pinterest.png" class="img-responsive"></a>
        </div>
      </div><!--/row -->
    </div><!-- #Custom Javascripts Links -->

    <!-- <br><br><br>  -->
       <div id="footerwrap">
           <div class="container ">
             <h5 class="text-center">Computer science At Ubon Ratchathani University </h5>
           </div><!--/footer -->
         </div><!--/footerwrap -->
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:43 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/footer.scala.html
                  HASH: 3e3dbd1f870a3aafbc59c543f0b2520945a11427
                  MATRIX: 611->6
                  LINES: 25->2
                  -- GENERATED --
              */
          