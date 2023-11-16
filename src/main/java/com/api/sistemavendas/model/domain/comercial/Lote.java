package com.api.sistemavendas.model.domain.comercial;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Lote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double desconto;
    private int qtdeEstoque;
    @Temporal(TemporalType.TIMESTAMP)
    private Date validade;
    @ManyToOne
    private Produto produto;
}
