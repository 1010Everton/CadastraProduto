package org.example;

import org.example.Conecta_banco.Conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("produtos");
        EntityManager em =emf.createEntityManager();
        Conection conexao = new Conection("vigor",123143242);

        conexao.setId(1L);
        em.getTransaction().begin();
        em.merge(conexao);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
