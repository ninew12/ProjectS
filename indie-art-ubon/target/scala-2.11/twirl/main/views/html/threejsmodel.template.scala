
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object threejsmodel_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class threejsmodel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
	<head>
		<title>three.js webgl - collada - blender</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0">
		<style>
			body """),format.raw/*8.9*/("""{"""),format.raw/*8.10*/("""
				"""),format.raw/*9.5*/("""font-family: Monospace;
				background-color: #000000;
				margin: 0px;
				overflow: hidden;
			"""),format.raw/*13.4*/("""}"""),format.raw/*13.5*/("""
			"""),format.raw/*14.4*/("""#info """),format.raw/*14.10*/("""{"""),format.raw/*14.11*/("""
				"""),format.raw/*15.5*/("""color: #fff;
				position: absolute;
				top: 10px;
				width: 100%;
				text-align: center;
				z-index: 100;
				display:block;
			"""),format.raw/*22.4*/("""}"""),format.raw/*22.5*/("""
			"""),format.raw/*23.4*/("""a """),format.raw/*23.6*/("""{"""),format.raw/*23.7*/(""" """),format.raw/*23.8*/("""color: red """),format.raw/*23.19*/("""}"""),format.raw/*23.20*/("""
		"""),format.raw/*24.3*/("""</style>
	</head>

	<body>
		<div id="info">
			<a href="http://threejs.org" target="_blank">three.js</a> -
			monster by <a href="http://www.3drt.com/downloads.htm" target="_blank">3drt</a>
		</div>

		<script src="/assets/javascripts/threejs/three.js"></script>
		<script src="/assets/javascripts/threejs/loaders/collada/Animation.js"></script>
		<script src="/assets/javascripts/threejs/loaders/collada/AnimationHandler.js"></script>
		<script src="/assets/javascripts/threejs/loaders/collada/KeyFrameAnimation.js"></script>

		<script src="/assets/javascripts/threejs/loaders/ColladaLoader.js"></script>

		<script src="/assets/javascripts/threejs/Detector.js"></script>
		<script src="/assets/javascripts/threejs/libs/stats.min.js"></script>

		<script>
			if ( ! Detector.webgl ) Detector.addGetWebGLMessage();
			var container, stats;
			var camera, scene, renderer, objects;
			var particleLight, pointLight;
			var dae;
			var clock = new THREE.Clock();
			var mixer;
			// Collada model
			var loader = new THREE.ColladaLoader();
			loader.options.convertUpAxis = true;
			loader.load( url('/assets/members/01/monster.dae'), function ( collada ) """),format.raw/*54.77*/("""{"""),format.raw/*54.78*/("""
				"""),format.raw/*55.5*/("""dae = collada.scene;
				dae.traverse( function ( child ) """),format.raw/*56.38*/("""{"""),format.raw/*56.39*/("""
					"""),format.raw/*57.6*/("""if ( child instanceof THREE.SkinnedMesh ) """),format.raw/*57.48*/("""{"""),format.raw/*57.49*/("""
						"""),format.raw/*58.7*/("""var animation = new THREE.Animation( child, child.geometry.animation );
						animation.play();
					"""),format.raw/*60.6*/("""}"""),format.raw/*60.7*/("""
				"""),format.raw/*61.5*/("""}"""),format.raw/*61.6*/(""" """),format.raw/*61.7*/(""");
				dae.scale.x = dae.scale.y = dae.scale.z = 0.002;
				dae.position.x = -1;
				dae.updateMatrix();
				init();
				animate();
			"""),format.raw/*67.4*/("""}"""),format.raw/*67.5*/(""" """),format.raw/*67.6*/(""");
			function init() """),format.raw/*68.20*/("""{"""),format.raw/*68.21*/("""
				"""),format.raw/*69.5*/("""container = document.createElement( 'div' );
				document.body.appendChild( container );
				camera = new THREE.PerspectiveCamera( 50, window.innerWidth / window.innerHeight, 1, 2000 );
				camera.position.set( 2, 4, 5 );
				scene = new THREE.Scene();
				scene.fog = new THREE.FogExp2( 0x000000, 0.035 );
				// Add Blender exported Collada model
				mixer = new THREE.AnimationMixer( scene );
				var loader = new THREE.JSONLoader();
				loader.load( url('/assets/members/01/monster.js'), function ( geometry, materials ) """),format.raw/*78.89*/("""{"""),format.raw/*78.90*/("""
					"""),format.raw/*79.6*/("""// adjust color a bit
					var material = materials[ 0 ];
					material.morphTargets = true;
					material.color.setHex( 0xffaaaa );
					var faceMaterial = new THREE.MultiMaterial( materials );
					for ( var i = 0; i < 729; i ++ ) """),format.raw/*84.39*/("""{"""),format.raw/*84.40*/("""
						"""),format.raw/*85.7*/("""// random placement in a grid
						var x = ( ( i % 27 )  - 13.5 ) * 2 + THREE.Math.randFloatSpread( 1 );
						var z = ( Math.floor( i / 27 ) - 13.5 ) * 2 + THREE.Math.randFloatSpread( 1 );
						// leave space for big monster
						if ( Math.abs( x ) < 2 && Math.abs( z ) < 2 ) continue;
						mesh = new THREE.Mesh( geometry, faceMaterial );
						var s = THREE.Math.randFloat( 0.00075, 0.001 );
						mesh.scale.set( s, s, s );
						mesh.position.set( x, 0, z );
						mesh.rotation.y = THREE.Math.randFloat( -0.25, 0.25 );
						mesh.matrixAutoUpdate = false;
						mesh.updateMatrix();
						scene.add( mesh );
						mixer.clipAction( geometry.animations[0], mesh )
								.setDuration( 1 )			// one second
								.startAt( - Math.random() )	// random phase (already running)
								.play();					// let's go
					"""),format.raw/*102.6*/("""}"""),format.raw/*102.7*/("""
				"""),format.raw/*103.5*/("""}"""),format.raw/*103.6*/(""" """),format.raw/*103.7*/(""");
				// Add the COLLADA
				scene.add( dae );
				// Lights
				scene.add( new THREE.AmbientLight( 0xcccccc ) );
				pointLight = new THREE.PointLight( 0xff4400, 5, 30 );
				pointLight.position.set( 5, 0, 0 );
				scene.add( pointLight );
				// Renderer
				renderer = new THREE.WebGLRenderer();
				renderer.setPixelRatio( window.devicePixelRatio );
				renderer.setSize( window.innerWidth, window.innerHeight );
				container.appendChild( renderer.domElement );
				// Stats
				stats = new Stats();
				container.appendChild( stats.dom );
				// Events
				window.addEventListener( 'resize', onWindowResize, false );
			"""),format.raw/*121.4*/("""}"""),format.raw/*121.5*/("""
			"""),format.raw/*122.4*/("""//
			function onWindowResize( event ) """),format.raw/*123.37*/("""{"""),format.raw/*123.38*/("""
				"""),format.raw/*124.5*/("""renderer.setSize( window.innerWidth, window.innerHeight );
				camera.aspect = window.innerWidth / window.innerHeight;
				camera.updateProjectionMatrix();
			"""),format.raw/*127.4*/("""}"""),format.raw/*127.5*/("""
			"""),format.raw/*128.4*/("""//
			function animate() """),format.raw/*129.23*/("""{"""),format.raw/*129.24*/("""
				"""),format.raw/*130.5*/("""requestAnimationFrame( animate );
				var delta = clock.getDelta();
				// animate Collada model
				THREE.AnimationHandler.update( delta );
				mixer.update( delta );
				render();
				stats.update();
			"""),format.raw/*137.4*/("""}"""),format.raw/*137.5*/("""
			"""),format.raw/*138.4*/("""function render() """),format.raw/*138.22*/("""{"""),format.raw/*138.23*/("""
				"""),format.raw/*139.5*/("""var timer = Date.now() * 0.0005;
				camera.position.x = Math.cos( timer ) * 10;
				camera.position.y = 4;
				camera.position.z = Math.sin( timer ) * 10;
				camera.lookAt( scene.position );
				renderer.render( scene, camera );
			"""),format.raw/*145.4*/("""}"""),format.raw/*145.5*/("""
		"""),format.raw/*146.3*/("""</script>
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
object threejsmodel extends threejsmodel_Scope0.threejsmodel
              /*
                  -- GENERATED --
                  DATE: Thu May 04 13:12:44 ICT 2017
                  SOURCE: C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/app/views/threejsmodel.scala.html
                  HASH: de84c9aeface903a7c6496af293039791bded573
                  MATRIX: 623->0|902->253|930->254|962->260|1090->361|1118->362|1150->367|1184->373|1213->374|1246->380|1413->520|1441->521|1473->526|1502->528|1530->529|1558->530|1597->541|1626->542|1657->546|2871->1732|2900->1733|2933->1739|3020->1798|3049->1799|3083->1806|3153->1848|3182->1849|3217->1857|3347->1960|3375->1961|3408->1967|3436->1968|3464->1969|3632->2110|3660->2111|3688->2112|3739->2135|3768->2136|3801->2142|4363->2676|4392->2677|4426->2684|4692->2922|4721->2923|4756->2931|5624->3771|5653->3772|5687->3778|5716->3779|5745->3780|6418->4425|6447->4426|6480->4431|6549->4471|6579->4472|6613->4478|6803->4640|6832->4641|6865->4646|6920->4672|6950->4673|6984->4679|7224->4891|7253->4892|7286->4897|7333->4915|7363->4916|7397->4922|7665->5162|7694->5163|7726->5167
                  LINES: 25->1|32->8|32->8|33->9|37->13|37->13|38->14|38->14|38->14|39->15|46->22|46->22|47->23|47->23|47->23|47->23|47->23|47->23|48->24|78->54|78->54|79->55|80->56|80->56|81->57|81->57|81->57|82->58|84->60|84->60|85->61|85->61|85->61|91->67|91->67|91->67|92->68|92->68|93->69|102->78|102->78|103->79|108->84|108->84|109->85|126->102|126->102|127->103|127->103|127->103|145->121|145->121|146->122|147->123|147->123|148->124|151->127|151->127|152->128|153->129|153->129|154->130|161->137|161->137|162->138|162->138|162->138|163->139|169->145|169->145|170->146
                  -- GENERATED --
              */
          