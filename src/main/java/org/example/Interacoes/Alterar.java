package org.example.Interacoes;

import org.example.Conecta_banco.Conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Alterar {
    public void altera(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("produtos");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Conection conexao = em.find(Conection.class,1L);
        em.detach(conexao);
        conexao.setCodigo_de_barra(123124);
        conexao.setNome_produto("mostarda");

        em.merge(conexao);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
