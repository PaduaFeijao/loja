
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<body style="margin: 0px">



    <div class="card-panel red centralizarTexto textoColorWhite fontePadrao" >
      Cadastro De Produtos
    </div>

    <div class="formulario">
      <form action="/produto/novo" method="get">

        <label for="nome">Nome</label>
        <input type="text" name="nome" id="nome">

        <label for="preco">Preço</label>
        <input type="number" name="preco" id="preco" title="R$">

        <label for="marca">Marca</label>
        <input type="text" name="marca" id="marca">

        <label for="categoria">Categoria</label>
        <input type="text" name="categoria" id="categoria">

        <label for="descricao">Descrição</label>
        <textarea name="descricao" id="descricao"></textarea>
        <br>
        <button class="btn waves-effect waves-light red"  type="submit" name="action">Cadastrar
          <i class="material-icons right"></i>
        </button>
      </form>
    </div>

    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*36.55*/routes/*36.61*/.Assets.versioned("images/foto2.jpeg")),format.raw/*36.99*/("""">
    <img src="images/foto1.jpeg" alt="">

    <div class="rodape">

    </div>

    <input type="file" name="arquivos" class="btn btn-success"  accept="image/png, image/jpeg"  multiple />

  </body>


""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-08-28T17:43:10.356
                  SOURCE: /Users/padua/workspace-play/loja/app/views/index.scala.html
                  HASH: 950bee3d9912b1eff138aa79a60c599c6b547eea
                  MATRIX: 941->1|1037->4|1064->6|1095->29|1134->31|1163->34|2183->1027|2198->1033|2257->1071
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|67->36|67->36|67->36
                  -- GENERATED --
              */
          