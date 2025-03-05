package org.example.Interacoes;

import org.example.Conecta_banco.Conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete {
    public void delete(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("produtos");
        EntityManager em = emf.createEntityManager();


        Conection conexao = em.find(Conection.class, 1L);

        if (conexao!=null){
            em.getTransaction().begin();
            em.remove(conexao);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
        }
    }


