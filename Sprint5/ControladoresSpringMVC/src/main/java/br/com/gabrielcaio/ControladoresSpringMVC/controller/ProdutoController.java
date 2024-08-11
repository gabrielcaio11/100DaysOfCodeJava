package br.com.gabrielcaio.ControladoresSpringMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielcaio.ControladoresSpringMVC.entities.Produto;
import br.com.gabrielcaio.ControladoresSpringMVC.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/products")
public class ProdutoController {
    @Autowired
    private ProdutoRepository productRepository;

    @GetMapping
    public List<Produto> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produto getProductById(@PathVariable Long id) {
        return productRepository.findById(id);
    }

    @PostMapping
    public Produto createProduct(@RequestBody Produto product) {
        return productRepository.save(product);
    }

    @PutMapping("/{id}")
    public Produto updateProduct(@PathVariable Long id, @RequestBody Produto produto) {
    	Produto existeProduto = productRepository.findById(id);
    	existeProduto.setName(produto.getName());
    	existeProduto.setDescription(produto.getDescription());
    	existeProduto.setPrice(produto.getPrice());
        return productRepository.save(existeProduto);
    }
}
