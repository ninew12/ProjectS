
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object b4wmodel_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class b4wmodel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(b4wscript: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
<title>Blend4Web Player</title>
<meta charset="utf-8">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width" />
<link rel="shortcut icon" href="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABmJLR0QAAACOAMyAOgNuAAAACXBIWXMAAA3XAAAN1wFCKJt4AAAAB3RJTUUH3wYZCzUe2Yb52wAAAihJREFUOMt9009onFUUBfDf/WYaRaoFsVFsFAqKi0oWZlJHEMSN4KboJoi66UpF6OhMN3VVhWIRMphQF124qGBEELVWNy6EQK2FTqSCUcRqqhYsCgpG+8+Z73aRj2SaVs/m8e475/DOu/eFa2Hv4ohN556W8QxKGQctXz9n77ZL66lxxW72+E0GtWeJlnT7Ou6vmHVx5KA9439eadDtPY6XsRUb/T/+lrlfZ3LfikG39yB+kerCGB7Aq/+tjx3aE0dML9wn8lKBe/G9cIrcIx3RboR2I0SMihzHByDdJctPdXvzImfwQ5ju3abIO2SM4n3U0Mcf5AZiyV8TTZsWQhrFj/hQ0X9BFr/XRT4q401pTrrH7sbpa968u3AL+bOMnWqD75T1L3B3QXyFEJ6yu3Fa98RDur3NVzuUH8s8qijPKIuj2KreLwv8hnNVNzoybsRJ3WM3r2rfWNxI3K8z+bCMAxjBsl3NLHAWixX1FUV+Rp5kwyerBhfPH8KM1xduxbaq+g0U2o2+iC+r4g0ynlerP0Y0TZ/YUb3+29IBZb41NILfrhis5Pt8KOxrynILMSrisJnjY+q1eeElPLLKyjy8ZrBlaQ6zQ4fzcnAB/2o1zygH72Hn8NAbW/pozWBqaqDdaMl4Audxp872ZZRVhO2V8B+RT2o3WqamyqEIFToT7+K5lSEC11XrBfyklk0vTr4zLCmuane7caj6WGtIx9T741qTX6+nXwbCtMDUVtksMQAAAABJRU5ErkJggg==" />
<link rel="image_src" href="data:image/png;base64,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">
<meta property="og:title" content="Blend4Web Player" />
<meta property="og:description" content="Check out these awesome 3D graphics made with Blend4Web!" />
<meta property="og:image" content="data:image/png;base64,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">

<meta name="description" content="Check out these awesome 3D graphics made with Blend4Web!" />
<meta name='b4w_export_path_html' content=''/>


"""),_display_(/*19.2*/b4wscript),format.raw/*19.11*/("""

"""),format.raw/*21.1*/("""</head>

<body>
    <div id="main_canvas_container"></div>
    <div id="preloader_container">
        <div id="logo_container">
            <div id="preloader_caption">0%</div>
        </div>
        <div id="load_container">
            <div id="first_stage"></div>
            <div id="second_stage"></div>
            <div id="third_stage"></div>
        </div>
        <div id="circle_wrapper">
            <div id="circle_container"></div>
        </div>
    </div>
    <div id="buttons_container">
        <div id="opened_button" class="control_panel_button"></div>
        <div id="hor_button_section">
            <div id="fullscreen_on_button" class="control_panel_button"></div>
            <div id="stereo_buttons_container" class="control_panel_button">
                <div id="hmd_mode_button" class="qual_button"></div>
                <div id="anag_mode_button" class="qual_button"></div>
                <div id="def_mode_button" class="qual_button"></div>
            </div>
            <div id="quality_buttons_container" class="control_panel_button">
                <div id="ultra_mode_button" class="qual_button"></div>
                <div id="high_mode_button" class="qual_button"></div>
                <div id="low_mode_button" class="qual_button"></div>
            </div>
            <div id="sound_on_button" class="control_panel_button"></div>
            <div id="auto_rotate_on_button" class="control_panel_button"></div>
            <div id="pause_button" class="control_panel_button"></div>
            <div id="help_button" class="control_panel_button"></div>
        </div>
        <div id="vert_section_button">
            <div id="tw_button" class="control_panel_button"><a target="_blank" href="//twitter.com/intent/tweet?via=blend4web&text=Check out these awesome 3D graphics made with Blend4Web!&url="></a></div>
            <div id="fb_button" class="control_panel_button"><a target="_blank" href="https://www.facebook.com/sharer/sharer.php?u="></a></div>
            <div id="g_button" class="control_panel_button"><a target="_blank" href="https://plus.google.com/share?url="></a></div>
            <div id="vk_button" class="control_panel_button"><a target="_blank" href="https://vk.com/share.php?url="></a></div>
            <div id="weibo_button" class="control_panel_button"><a target="_blank" href="http://service.weibo.com/share/share.php?title=看看这些用 Blend4Web 所制作的惊人 3D 图形！&url="></a></div>
        </div>
    </div>
    <div id="help_info_container">
        <div id="close_help"></div>
        <div id="rel_version">dev</div>
        <a id="site_link" target="_blank" href="https://www.blend4web.com">blend4web.com</a>
    </div>
    <div id="error_container">
        <div id="error_name"></div>
        <div id="error_info"></div>
    </div>
    <div id="fps_wrapper">
        <div id="prev_fps_circle"></div>
        <div id="fps_container"></div>
    </div>
</body>
</html>
"""))
      }
    }
  }

  def render(b4wscript:String): play.twirl.api.HtmlFormat.Appendable = apply(b4wscript)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (b4wscript) => apply(b4wscript)

  def ref: this.type = this

}


}

/**/
object b4wmodel extends b4wmodel_Scope0.b4wmodel
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:43 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/b4wmodel.scala.html
                  HASH: 3cedab601a664227c559e17e17def10d2088929c
                  MATRIX: 533->1|647->20|677->24|8183->7504|8213->7513|8244->7517
                  LINES: 20->1|25->1|27->3|43->19|43->19|45->21
                  -- GENERATED --
              */
          