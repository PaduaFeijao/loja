// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/padua/workspace-play/loja/conf/routes
// @DATE:Wed Aug 28 17:43:09 BRT 2019


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
