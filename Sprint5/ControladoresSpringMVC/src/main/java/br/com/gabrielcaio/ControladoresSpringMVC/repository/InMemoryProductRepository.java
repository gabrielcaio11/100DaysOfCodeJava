package br.com.gabrielcaio.ControladoresSpringMVC.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import br.com.gabrielcaio.ControladoresSpringMVC.entities.Produto;

@Component
public class InMemoryProductRepository implements ProdutoRepository {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public List<Produto> findAll() {
        return produtos;
    }

    @Override
    public Produto findById(Long id) {
        return produtos.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Produto save(Produto product) {
        if (product.getId() == null) {
            product.setId(new Random().nextLong());
        }
        produtos.add(product);
        return product;
    }

    @Override
    public void deleteById(Long id) {
        produtos.removeIf(produto -> produto.getId().equals(id));
    }
}
