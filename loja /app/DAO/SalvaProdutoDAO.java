package DAO;

import models.Produto;
import play.data.Form;
import play.data.FormFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SalvaProdutoDAO {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja");
        EntityManager em = emf.createEntityManager();

        Produto p1 = new Produto();


        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        em.close();


    }
}
