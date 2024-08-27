package br.com.gabrielcaio.ConsultasPersonalizadas.controller;

import br.com.gabrielcaio.ConsultasPersonalizadas.entities.Product;
import br.com.gabrielcaio.ConsultasPersonalizadas.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = productService.findAll();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product product = productService.findById(id);
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        Product savedProduct = productService.create(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }
    @PostMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id,@RequestBody Product product) {
    	product.setId(id);
        Product savedProduct = productService.create(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
