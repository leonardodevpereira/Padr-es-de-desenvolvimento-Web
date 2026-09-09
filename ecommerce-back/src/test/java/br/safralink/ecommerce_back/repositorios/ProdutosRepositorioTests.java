package br.safralink.ecommerce_back.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.safralink.ecommerce_back.entidades.Categoria;
import br.safralink.ecommerce_back.entidades.Produto;

@SpringBootTest
public class ProdutosRepositorioTests {
    @Autowired
    private ProdutoRepositorio produtoRepositorio;
    
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    
@Test
    public void deveSalvarUmProdutoNovo() {
        var produto = new Produto();
        produto.setNome("null");
        produto.setDescricao("SSD de 2TB, 16GB de RAM, Processador i7 14th");
        produto.setPreco(new BigDecimal("12500"));
        produto.setEstoque(Short.parseShort("10"));

        var categoria = categoriaRepositorio.findById(Short.parseShort("1")).orElseThrow();
        
        produtoRepositorio.save(produto);
        assertNotNull(produto.getId());
        assertEquals(6,produto.getId());
    }
}
