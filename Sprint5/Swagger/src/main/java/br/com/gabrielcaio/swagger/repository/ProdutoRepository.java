package br.com.gabrielcaio.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielcaio.swagger.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
