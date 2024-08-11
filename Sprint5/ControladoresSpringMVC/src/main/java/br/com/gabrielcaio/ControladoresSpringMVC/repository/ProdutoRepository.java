package br.com.gabrielcaio.ControladoresSpringMVC.repository;

import java.util.List;

import br.com.gabrielcaio.ControladoresSpringMVC.entities.Produto;

public interface ProdutoRepository {
    List<Produto> findAll();
    Produto findById(Long id);
    Produto save(Produto produto);
    void deleteById(Long id);
}