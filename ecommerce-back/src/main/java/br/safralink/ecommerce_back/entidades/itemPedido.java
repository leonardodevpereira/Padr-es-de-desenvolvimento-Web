package br.safralink.ecommerce_back.entidades;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class itemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer quantidade;

    private BigDecimal valorUnitario;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Produto produto;
}   

