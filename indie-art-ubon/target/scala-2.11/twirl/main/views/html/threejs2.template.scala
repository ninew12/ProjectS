
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object threejs2_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class threejs2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
  <head>
    <meta charset=utf-8>
    <title>My first three.js app</title>
    <script src="/assets/javascripts/threejs/three.js"></script>
    <script type="text/javascript">
      window.onload = function() """),format.raw/*8.34*/("""{"""),format.raw/*8.35*/("""
        """),format.raw/*9.9*/("""var scene = new THREE.Scene();
        var camera = new THREE.PerspectiveCamera( 75, window.innerWidth / window.innerHeight, 0.1, 1000 );

        var renderer = new THREE.WebGLRenderer();
        renderer.setSize( window.innerWidth, window.innerHeight );
        document.body.appendChild( renderer.domElement );

        var geometry = new THREE.BoxGeometry( 1, 1, 1 );
        var material = new THREE.MeshBasicMaterial( """),format.raw/*17.53*/("""{"""),format.raw/*17.54*/(""" """),format.raw/*17.55*/("""color: 0x00ff00 """),format.raw/*17.71*/("""}"""),format.raw/*17.72*/(""" """),format.raw/*17.73*/(""");
        var cube = new THREE.Mesh( geometry, material );
        scene.add( cube );

        camera.position.z = 5;

        function render() """),format.raw/*23.27*/("""{"""),format.raw/*23.28*/("""
          """),format.raw/*24.11*/("""requestAnimationFrame( render );

          cube.rotation.x += 0.1;
          cube.rotation.y += 0.1;

          renderer.render( scene, camera );
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
        """),format.raw/*31.9*/("""render();
      """),format.raw/*32.7*/("""}"""),format.raw/*32.8*/("""
    """),format.raw/*33.5*/("""</script>
  </head>
  <body>
    <h1> testing one two three</h1>
  </body>
</html>
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
object threejs2 extends threejs2_Scope0.threejs2
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:44 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/threejs2.scala.html
                  HASH: b85afe2b78f6cf962b11abea9f5430e7300c8cfa
                  MATRIX: 615->0|881->239|909->240|945->250|1405->682|1434->683|1463->684|1507->700|1536->701|1565->702|1745->854|1774->855|1814->867|2002->1028|2031->1029|2068->1039|2112->1056|2140->1057|2173->1063
                  LINES: 25->1|32->8|32->8|33->9|41->17|41->17|41->17|41->17|41->17|41->17|47->23|47->23|48->24|54->30|54->30|55->31|56->32|56->32|57->33
                  -- GENERATED --
              */
          