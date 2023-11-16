package com.api.sistemavendas.model.domain.comercial;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int qtde;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Venda venda;
}
