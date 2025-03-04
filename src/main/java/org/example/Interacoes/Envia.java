package org.example.Interacoes;

import org.example.Conecta_banco.Conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Envia {
    public void enviar(){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("produtos");
    EntityManager em =emf.createEntityManager();
    Conection conexao = new Conection("botavo",312987);


        em.getTransaction().begin();
        em.merge(conexao);
        em.getTransaction().commit();

        em.close();
        emf.close();
}
}
