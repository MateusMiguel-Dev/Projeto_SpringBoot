package com.api.sistemavendas.model;

public class Venda {
    private String horario;
    private int codVendedor;
    private int codProduto;
    private float valorTotal;
    private String data;
    private int codigo;

    public Venda() {
    }

    public Venda(String horario, int codVendedor, int codProduto, float valorTotal, String data, int codigo) {
        this.horario = horario;
        this.codVendedor = codVendedor;
        this.codProduto = codProduto;
        this.valorTotal = valorTotal;
        this.data = data;
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}