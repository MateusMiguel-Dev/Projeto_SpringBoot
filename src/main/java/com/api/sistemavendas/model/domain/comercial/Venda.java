package com.api.sistemavendas.model.domain.comercial;

import com.api.sistemavendas.model.domain.pessoal.Usuario;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Venda{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVenda;
    @OneToMany(mappedBy = "Venda")
    Set<Item> itens;
    @ManyToOne
    private Usuario usuario;
}
