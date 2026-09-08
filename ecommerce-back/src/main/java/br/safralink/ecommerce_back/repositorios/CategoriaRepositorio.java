package br.safralink.ecommerce_back.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.safralink.ecommerce_back.entidades.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Short>{

}
