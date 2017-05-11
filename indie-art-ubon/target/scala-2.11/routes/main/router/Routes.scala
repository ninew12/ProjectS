
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/conf/routes
// @DATE:Thu May 04 13:12:42 ICT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ApplicationController_6: controllers.ApplicationController,
  // @LINE:11
  SocialAuthController_4: controllers.SocialAuthController,
  // @LINE:12
  CredentialsAuthController_1: controllers.CredentialsAuthController,
  // @LINE:13
  SignUpController_0: controllers.SignUpController,
  // @LINE:14
  IndieApplication_2: controllers.IndieApplication,
  // @LINE:38
  Assets_3: controllers.Assets,
  // @LINE:39
  WebJarAssets_5: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ApplicationController_6: controllers.ApplicationController,
    // @LINE:11
    SocialAuthController_4: controllers.SocialAuthController,
    // @LINE:12
    CredentialsAuthController_1: controllers.CredentialsAuthController,
    // @LINE:13
    SignUpController_0: controllers.SignUpController,
    // @LINE:14
    IndieApplication_2: controllers.IndieApplication,
    // @LINE:38
    Assets_3: controllers.Assets,
    // @LINE:39
    WebJarAssets_5: controllers.WebJarAssets
  ) = this(errorHandler, ApplicationController_6, SocialAuthController_4, CredentialsAuthController_1, SignUpController_0, IndieApplication_2, Assets_3, WebJarAssets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ApplicationController_6, SocialAuthController_4, CredentialsAuthController_1, SignUpController_0, IndieApplication_2, Assets_3, WebJarAssets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """run""", """controllers.ApplicationController.run"""),
    ("""GET""", this.prefix, """controllers.ApplicationController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.ApplicationController.signIn"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.ApplicationController.signUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signOut""", """controllers.ApplicationController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""", """controllers.SocialAuthController.authenticate(provider:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/credentials""", """controllers.CredentialsAuthController.authenticate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.signUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """selectmodel""", """controllers.IndieApplication.selectmodel"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """selectModel""", """controllers.IndieApplication.selectmodel"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pagelist""", """controllers.ApplicationController.getlist"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showpost/$id<[^/]+>""", """controllers.IndieApplication.showpost(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts""", """controllers.IndieApplication.posts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """model""", """controllers.IndieApplication.model"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showmodel""", """controllers.IndieApplication.showmodel"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """col""", """controllers.IndieApplication.collection"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/$id<[^/]+>""", """controllers.IndieApplication.profile(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """member""", """controllers.IndieApplication.member"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forums""", """controllers.IndieApplication.forums"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forum""", """controllers.IndieApplication.forum"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment""", """controllers.IndieApplication.comment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upmodel""", """controllers.IndieApplication.upmodel"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/$id<[^/]+>""", """controllers.IndieApplication.userP(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.IndieApplication.upload"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.IndieApplication.threejs2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ApplicationController_run0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("run")))
  )
  private[this] lazy val controllers_ApplicationController_run0_invoker = createInvoker(
    ApplicationController_6.run,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "run",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """run"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ApplicationController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ApplicationController_index1_invoker = createInvoker(
    ApplicationController_6.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ApplicationController_signIn2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_ApplicationController_signIn2_invoker = createInvoker(
    ApplicationController_6.signIn,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signIn",
      Nil,
      "GET",
      """""",
      this.prefix + """signIn"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ApplicationController_signUp3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_ApplicationController_signUp3_invoker = createInvoker(
    ApplicationController_6.signUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signUp",
      Nil,
      "GET",
      """""",
      this.prefix + """signUp"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ApplicationController_signOut4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signOut")))
  )
  private[this] lazy val controllers_ApplicationController_signOut4_invoker = createInvoker(
    ApplicationController_6.signOut,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signOut",
      Nil,
      "GET",
      """""",
      this.prefix + """signOut"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_SocialAuthController_authenticate5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate5_invoker = createInvoker(
    SocialAuthController_4.authenticate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """authenticate/$provider<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CredentialsAuthController_authenticate6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/credentials")))
  )
  private[this] lazy val controllers_CredentialsAuthController_authenticate6_invoker = createInvoker(
    CredentialsAuthController_1.authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CredentialsAuthController",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """authenticate/credentials"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SignUpController_signUp7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_signUp7_invoker = createInvoker(
    SignUpController_0.signUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "signUp",
      Nil,
      "POST",
      """""",
      this.prefix + """signUp"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_IndieApplication_selectmodel8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("selectmodel")))
  )
  private[this] lazy val controllers_IndieApplication_selectmodel8_invoker = createInvoker(
    IndieApplication_2.selectmodel,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "selectmodel",
      Nil,
      "GET",
      """""",
      this.prefix + """selectmodel"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_IndieApplication_selectmodel9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("selectModel")))
  )
  private[this] lazy val controllers_IndieApplication_selectmodel9_invoker = createInvoker(
    IndieApplication_2.selectmodel,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "selectmodel",
      Nil,
      "GET",
      """""",
      this.prefix + """selectModel"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ApplicationController_getlist10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pagelist")))
  )
  private[this] lazy val controllers_ApplicationController_getlist10_invoker = createInvoker(
    ApplicationController_6.getlist,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "getlist",
      Nil,
      "GET",
      """""",
      this.prefix + """pagelist"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_IndieApplication_showpost11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showpost/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IndieApplication_showpost11_invoker = createInvoker(
    IndieApplication_2.showpost(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "showpost",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """showpost/$id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_IndieApplication_posts12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts")))
  )
  private[this] lazy val controllers_IndieApplication_posts12_invoker = createInvoker(
    IndieApplication_2.posts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "posts",
      Nil,
      "GET",
      """""",
      this.prefix + """posts"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_IndieApplication_model13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("model")))
  )
  private[this] lazy val controllers_IndieApplication_model13_invoker = createInvoker(
    IndieApplication_2.model,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "model",
      Nil,
      "GET",
      """""",
      this.prefix + """model"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_IndieApplication_showmodel14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showmodel")))
  )
  private[this] lazy val controllers_IndieApplication_showmodel14_invoker = createInvoker(
    IndieApplication_2.showmodel,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "showmodel",
      Nil,
      "GET",
      """""",
      this.prefix + """showmodel"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_IndieApplication_collection15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("col")))
  )
  private[this] lazy val controllers_IndieApplication_collection15_invoker = createInvoker(
    IndieApplication_2.collection,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "collection",
      Nil,
      "GET",
      """""",
      this.prefix + """col"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_IndieApplication_profile16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IndieApplication_profile16_invoker = createInvoker(
    IndieApplication_2.profile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "profile",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """profile/$id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_IndieApplication_member17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("member")))
  )
  private[this] lazy val controllers_IndieApplication_member17_invoker = createInvoker(
    IndieApplication_2.member,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "member",
      Nil,
      "GET",
      """""",
      this.prefix + """member"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_IndieApplication_forums18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forums")))
  )
  private[this] lazy val controllers_IndieApplication_forums18_invoker = createInvoker(
    IndieApplication_2.forums,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "forums",
      Nil,
      "GET",
      """""",
      this.prefix + """forums"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_IndieApplication_forum19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forum")))
  )
  private[this] lazy val controllers_IndieApplication_forum19_invoker = createInvoker(
    IndieApplication_2.forum,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "forum",
      Nil,
      "POST",
      """""",
      this.prefix + """forum"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_IndieApplication_comment20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment")))
  )
  private[this] lazy val controllers_IndieApplication_comment20_invoker = createInvoker(
    IndieApplication_2.comment,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "comment",
      Nil,
      "POST",
      """""",
      this.prefix + """comment"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_IndieApplication_upmodel21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upmodel")))
  )
  private[this] lazy val controllers_IndieApplication_upmodel21_invoker = createInvoker(
    IndieApplication_2.upmodel,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "upmodel",
      Nil,
      "GET",
      """""",
      this.prefix + """upmodel"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_IndieApplication_userP22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_IndieApplication_userP22_invoker = createInvoker(
    IndieApplication_2.userP(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "userP",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """user/$id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_IndieApplication_upload23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_IndieApplication_upload23_invoker = createInvoker(
    IndieApplication_2.upload,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "upload",
      Nil,
      "POST",
      """""",
      this.prefix + """upload"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_IndieApplication_threejs224_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_IndieApplication_threejs224_invoker = createInvoker(
    IndieApplication_2.threejs2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.IndieApplication",
      "threejs2",
      Nil,
      "GET",
      """GET         /test                            controllers.IndieApplication.b4wmodel
GET         /test                            controllers.IndieApplication.three""",
      this.prefix + """test"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Assets_at25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at25_invoker = createInvoker(
    Assets_3.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_WebJarAssets_at26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at26_invoker = createInvoker(
    WebJarAssets_5.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ApplicationController_run0_route(params) =>
      call { 
        controllers_ApplicationController_run0_invoker.call(ApplicationController_6.run)
      }
  
    // @LINE:7
    case controllers_ApplicationController_index1_route(params) =>
      call { 
        controllers_ApplicationController_index1_invoker.call(ApplicationController_6.index)
      }
  
    // @LINE:8
    case controllers_ApplicationController_signIn2_route(params) =>
      call { 
        controllers_ApplicationController_signIn2_invoker.call(ApplicationController_6.signIn)
      }
  
    // @LINE:9
    case controllers_ApplicationController_signUp3_route(params) =>
      call { 
        controllers_ApplicationController_signUp3_invoker.call(ApplicationController_6.signUp)
      }
  
    // @LINE:10
    case controllers_ApplicationController_signOut4_route(params) =>
      call { 
        controllers_ApplicationController_signOut4_invoker.call(ApplicationController_6.signOut)
      }
  
    // @LINE:11
    case controllers_SocialAuthController_authenticate5_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate5_invoker.call(SocialAuthController_4.authenticate(provider))
      }
  
    // @LINE:12
    case controllers_CredentialsAuthController_authenticate6_route(params) =>
      call { 
        controllers_CredentialsAuthController_authenticate6_invoker.call(CredentialsAuthController_1.authenticate)
      }
  
    // @LINE:13
    case controllers_SignUpController_signUp7_route(params) =>
      call { 
        controllers_SignUpController_signUp7_invoker.call(SignUpController_0.signUp)
      }
  
    // @LINE:14
    case controllers_IndieApplication_selectmodel8_route(params) =>
      call { 
        controllers_IndieApplication_selectmodel8_invoker.call(IndieApplication_2.selectmodel)
      }
  
    // @LINE:15
    case controllers_IndieApplication_selectmodel9_route(params) =>
      call { 
        controllers_IndieApplication_selectmodel9_invoker.call(IndieApplication_2.selectmodel)
      }
  
    // @LINE:18
    case controllers_ApplicationController_getlist10_route(params) =>
      call { 
        controllers_ApplicationController_getlist10_invoker.call(ApplicationController_6.getlist)
      }
  
    // @LINE:19
    case controllers_IndieApplication_showpost11_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_IndieApplication_showpost11_invoker.call(IndieApplication_2.showpost(id))
      }
  
    // @LINE:20
    case controllers_IndieApplication_posts12_route(params) =>
      call { 
        controllers_IndieApplication_posts12_invoker.call(IndieApplication_2.posts)
      }
  
    // @LINE:21
    case controllers_IndieApplication_model13_route(params) =>
      call { 
        controllers_IndieApplication_model13_invoker.call(IndieApplication_2.model)
      }
  
    // @LINE:22
    case controllers_IndieApplication_showmodel14_route(params) =>
      call { 
        controllers_IndieApplication_showmodel14_invoker.call(IndieApplication_2.showmodel)
      }
  
    // @LINE:23
    case controllers_IndieApplication_collection15_route(params) =>
      call { 
        controllers_IndieApplication_collection15_invoker.call(IndieApplication_2.collection)
      }
  
    // @LINE:24
    case controllers_IndieApplication_profile16_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_IndieApplication_profile16_invoker.call(IndieApplication_2.profile(id))
      }
  
    // @LINE:25
    case controllers_IndieApplication_member17_route(params) =>
      call { 
        controllers_IndieApplication_member17_invoker.call(IndieApplication_2.member)
      }
  
    // @LINE:26
    case controllers_IndieApplication_forums18_route(params) =>
      call { 
        controllers_IndieApplication_forums18_invoker.call(IndieApplication_2.forums)
      }
  
    // @LINE:27
    case controllers_IndieApplication_forum19_route(params) =>
      call { 
        controllers_IndieApplication_forum19_invoker.call(IndieApplication_2.forum)
      }
  
    // @LINE:28
    case controllers_IndieApplication_comment20_route(params) =>
      call { 
        controllers_IndieApplication_comment20_invoker.call(IndieApplication_2.comment)
      }
  
    // @LINE:29
    case controllers_IndieApplication_upmodel21_route(params) =>
      call { 
        controllers_IndieApplication_upmodel21_invoker.call(IndieApplication_2.upmodel)
      }
  
    // @LINE:30
    case controllers_IndieApplication_userP22_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_IndieApplication_userP22_invoker.call(IndieApplication_2.userP(id))
      }
  
    // @LINE:31
    case controllers_IndieApplication_upload23_route(params) =>
      call { 
        controllers_IndieApplication_upload23_invoker.call(IndieApplication_2.upload)
      }
  
    // @LINE:35
    case controllers_IndieApplication_threejs224_route(params) =>
      call { 
        controllers_IndieApplication_threejs224_invoker.call(IndieApplication_2.threejs2)
      }
  
    // @LINE:38
    case controllers_Assets_at25_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at25_invoker.call(Assets_3.at(path, file))
      }
  
    // @LINE:39
    case controllers_WebJarAssets_at26_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at26_invoker.call(WebJarAssets_5.at(file))
      }
  }
}