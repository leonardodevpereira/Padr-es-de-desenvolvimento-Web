package br.safralink.ecommerce_back.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Categoria {
    private short id;
    private String nome;
    private String descricao;


}
