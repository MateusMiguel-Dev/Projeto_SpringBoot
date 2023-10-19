package com.api.sistemavendas.model;

public class Usuario {
    private String nome;
    private String senha;
    private String email;
    private Long cod;
    private String telefone;
    private String cpf;

    public Usuario() {
    }

    public Usuario(String nome, String senha, String email, Long cod, String telefone, String cpf) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cod = cod;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
