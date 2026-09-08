package br.safralink.ecommerce_back.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.safralink.ecommerce_back.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Integer>{

}
