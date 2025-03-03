package org.example.Conecta_banco;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Conection {
    @Id
    @GeneratedValue()

    private long id;
    private String nome;
    private double codigo_barra;

    public Conection(String nome, double codigo_barra) {
        this.nome = nome;
        this.codigo_barra = codigo_barra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCodigo_barra() {
        return codigo_barra;
    }

    public void setCodigo_barra(double codigo_barra) {
        this.codigo_barra = codigo_barra;
    }
}
