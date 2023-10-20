package com.api.sistemavendas.model;

import java.util.Date;

public class Produto {
    private int codigo;
    private String nome;
    private float valorPrateleira;
    private float valorReal;
    private int qtdeEstoque;
    private Date validade;

    public Produto() {
    }

    public Produto(int codigo, String nome, float valorPrateleira, float valorReal, int qtdeEstoque, Date validade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorPrateleira = valorPrateleira;
        this.valorReal = valorReal;
        this.qtdeEstoque = qtdeEstoque;
        this.validade = validade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorPrateleira() {
        return valorPrateleira;
    }

    public void setValorPrateleira(float valorPrateleira) {
        this.valorPrateleira = valorPrateleira;
    }

    public float getValorReal() {
        return valorReal;
    }

    public void setValorReal(float valorReal) {
        this.valorReal = valorReal;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
}