package br.com.gabrielcaio.ConsultasPersonalizadas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielcaio.ConsultasPersonalizadas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
