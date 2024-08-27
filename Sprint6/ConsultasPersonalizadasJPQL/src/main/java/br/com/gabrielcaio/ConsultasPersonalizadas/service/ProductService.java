package br.com.gabrielcaio.ConsultasPersonalizadas.service;
import br.com.gabrielcaio.ConsultasPersonalizadas.entities.Product;
import br.com.gabrielcaio.ConsultasPersonalizadas.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

   
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }
    public Product create(Product product) {
    	return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
