package org.example.Interacoes;

import org.example.Conecta_banco.Conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Busca {
    public void buscar(){
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("produtos");
    EntityManager em = emf.createEntityManager();

    Conection conexao = em.find(Conection.class,1L);
    System.out.print(conexao.getNome_produto());
    em.close();
    emf.close();
}
}
