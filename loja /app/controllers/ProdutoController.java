package controllers;


import EntityManager.EntityManagerCreator;
import models.Produto;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.persistence.EntityManager;


public class ProdutoController extends Controller {
    @Inject
    private FormFactory formularios;

    private EntityManager em;


    public Result salvaNovoProduto(String nome){


        Form<Produto> formulario = formularios.form(Produto.class).bindFromRequest();
        Produto produto = formulario.get();

        return ok("formulario recebido para o produto: " + produto.getNome());
        //    return ok(views.html.home.render());


    }
}
