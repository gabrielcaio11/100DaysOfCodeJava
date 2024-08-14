package br.com.gabrielcaio.apirestful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielcaio.apirestful.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
