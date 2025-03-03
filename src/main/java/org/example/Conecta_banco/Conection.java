package org.example.Conecta_banco;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Conection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome_produto;
    private double codigo_de_barra;
    public Conection() {
    }

    public Conection(String nome, double codigo_barra) {
        this.nome_produto = nome;
        this.codigo_de_barra = codigo_barra;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome) {
        this.nome_produto = nome;
    }

    public double getCodigo_de_barra() {
        return codigo_de_barra;
    }


    public void setCodigo_de_barra(double codigo_barra) {
        this.codigo_de_barra = codigo_barra;
    }
}
