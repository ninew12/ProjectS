
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/newk12/Documents/ProjectS/seniorprojects/indie-art-ubon/conf/routes
// @DATE:Thu May 04 13:12:42 ICT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
