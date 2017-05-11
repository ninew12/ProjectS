
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/conf/routes
// @DATE:Thu May 04 13:12:42 ICT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:38
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseSocialAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocialAuthController.authenticate",
      """
        function(provider) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
    // @LINE:10
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signOut"})
        }
      """
    )
  
    // @LINE:18
    def getlist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.getlist",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pagelist"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
    // @LINE:6
    def run: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.run",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "run"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseCredentialsAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CredentialsAuthController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/credentials"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseSignUpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.signUp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseIndieApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def upmodel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.upmodel",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "upmodel"})
        }
      """
    )
  
    // @LINE:31
    def upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.upload",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:24
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.profile",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:26
    def forums: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.forums",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "forums"})
        }
      """
    )
  
    // @LINE:19
    def showpost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.showpost",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showpost/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:23
    def collection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.collection",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "col"})
        }
      """
    )
  
    // @LINE:22
    def showmodel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.showmodel",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showmodel"})
        }
      """
    )
  
    // @LINE:27
    def forum: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.forum",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forum"})
        }
      """
    )
  
    // @LINE:35
    def threejs2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.threejs2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:28
    def comment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.comment",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment"})
        }
      """
    )
  
    // @LINE:21
    def model: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.model",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "model"})
        }
      """
    )
  
    // @LINE:14
    def selectmodel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.selectmodel",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "selectmodel"})
          }
        
        }
      """
    )
  
    // @LINE:20
    def posts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.posts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts"})
        }
      """
    )
  
    // @LINE:25
    def member: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.member",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "member"})
        }
      """
    )
  
    // @LINE:30
    def userP: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.IndieApplication.userP",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
  }


}