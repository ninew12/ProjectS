
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object uploadModel_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object uploadModel_Scope1 {
import forms._

class uploadModel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[models.User,Form[forms.uploadForm.Data],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: models.User,uploadForm: Form[forms.uploadForm.Data])(implicit request: RequestHeader , messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.inline.fieldConstructor
def /*6.2*/blend/*6.7*/ = {{ Seq("C"->"Category","C"->"Character","A"->"Assets","S"->"Scene","O"->"Others") }};
Seq[Any](format.raw/*2.115*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
"""),format.raw/*6.93*/("""
"""),_display_(/*7.2*/main(Messages("home.title"), Some(user))/*7.42*/{_display_(Seq[Any](format.raw/*7.43*/("""
  """),format.raw/*8.3*/("""<div class="container">
         <br><br><br>
            <div class="mt mb ">
               <h3><i class="fa fa-upload" aria-hidden="true"></i> UPLOAD MODEL</h3>
           </div>
             <div class="panel panel-info">
                <div class="panel-body">
                  <div class="container">
                    <div class="row">
                     <div class="col-sm-1  ">
                     </div>
                      <div class="col-sm-8  ">

                        """),_display_(/*21.26*/helper/*21.32*/.form(action = routes.IndieApplication.upload,'enctype -> "multipart/form-data")/*21.112*/ {_display_(Seq[Any](format.raw/*21.114*/("""
                          """),_display_(/*22.28*/helper/*22.34*/.CSRF.formField),format.raw/*22.49*/("""

                            """),_display_(/*24.30*/b3/*24.32*/.text( uploadForm("title"), '_label -> "Topic" )),format.raw/*24.80*/("""
                            """),_display_(/*25.30*/b3/*25.32*/.textarea( uploadForm("detail"), '_label -> "details" ,'rows -> 3 )),format.raw/*25.99*/("""
                            """),_display_(/*26.30*/b3/*26.32*/.select( uploadForm("modelType"), options = blend, '_label -> "Select" )),format.raw/*26.104*/("""
                            """),_display_(/*27.30*/b3/*27.32*/.file( uploadForm("picture"), '_label -> "Picturefile" )),format.raw/*27.88*/("""
                            """),_display_(/*28.30*/b3/*28.32*/.file( uploadForm("picture"), '_label -> "Blendfile" )),format.raw/*28.86*/("""
                            """),_display_(/*29.30*/b3/*29.32*/.file( uploadForm("picture"), '_label -> "Jsonfile" )),format.raw/*29.85*/("""
                            """),_display_(/*30.30*/b3/*30.32*/.file( uploadForm("picture"), '_label -> "Htmlfile" )),format.raw/*30.85*/("""

                            """),format.raw/*32.29*/("""<div class=" text-right">
                               <button type="submit" class="btn btn-primary">Submit</button> &nbsp; &nbsp;
                               <button type="submit" class="btn btn-danger">Cancel</button>
                             </div>

                          """)))}),format.raw/*37.28*/("""

                            """),format.raw/*39.29*/("""</div>   <!-- col-md-8 -->
                         </div>   <!-- row -->
                      </div><!-- container -->
                   </div><!-- panal-body -->
                 </div><!-- panal -->
              </div><!--inner-->


           <!--dialog -->
                     <div class="modal" id="model" role="dialog">
           	                <div class="modal-dialog">
                                <div class="modal-content">
                                      <div class="modal-header">
                                             <button type="button" class="close" data-dismiss="modal" aria-hidden="true" >×</button>
                                             <h4 class="modal-title">เงื่อนไขการอัพโหลดผลงาน</h4>
                                       </div>
                               <div class="modal-body">
                                 <!-- <div class="well">
                                     <p>&nbsp;&nbsp;&nbsp;&nbsp;ผลงานที่ทำการอัพโหลดเป็นผลงานที่ถูกพัฒนาขึ้นด้วยสมาชิกเอง</p>
                                     <p>&nbsp;&nbsp;&nbsp;&nbsp;หากมีการคัดลอกผลงานเพื่อนำมาอัพโหลดทางเราจะไม่รับผิดชอบใดๆทั้งสิ้น</p>
                                     <p>&nbsp;&nbsp;&nbsp;&nbsp;ผู้พัฒนาต้องการแชร์ผลงานให้สมาชิกท่านอื่นโดยไม่มีเงื่อนไขหรือเสียค่าใช้จ่ายใดๆทั้งสิ้น</p>
                                </div> -->
                              </div>
                                  <div class="modal-footer">
                                             <a href="#" data-dismiss="modal" class="btn">Close</a>
                                             <a href="#" class="btn btn-warning">Ok</a>
                                 </div>
                             </div>
                         </div>
                     </div>  <!--dialog -->

          """),_display_(/*70.12*/footer()),format.raw/*70.20*/("""
""")))}),format.raw/*71.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,uploadForm:Form[forms.uploadForm.Data],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,uploadForm)(request,messages)

  def f:((models.User,Form[forms.uploadForm.Data]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,uploadForm) => (request,messages) => apply(user,uploadForm)(request,messages)

  def ref: this.type = this

}


}
}

/**/
object uploadModel extends uploadModel_Scope0.uploadModel_Scope1.uploadModel
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:44 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/uploadModel.scala.html
                  HASH: 872547a8249307cf54cd65c2e0a7d6393a56e3ed
                  MATRIX: 644->18|868->189|880->194|997->131|1027->135|1071->280|1099->283|1147->323|1185->324|1215->328|1749->835|1764->841|1854->921|1895->923|1951->952|1966->958|2002->973|2062->1006|2073->1008|2142->1056|2200->1087|2211->1089|2299->1156|2357->1187|2368->1189|2462->1261|2520->1292|2531->1294|2608->1350|2666->1381|2677->1383|2752->1437|2810->1468|2821->1470|2895->1523|2953->1554|2964->1556|3038->1609|3098->1641|3423->1935|3483->1967|5351->3808|5380->3816|5413->3819
                  LINES: 23->2|27->6|27->6|28->2|30->4|31->6|32->7|32->7|32->7|33->8|46->21|46->21|46->21|46->21|47->22|47->22|47->22|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|53->28|53->28|53->28|54->29|54->29|54->29|55->30|55->30|55->30|57->32|62->37|64->39|95->70|95->70|96->71
                  -- GENERATED --
              */
          