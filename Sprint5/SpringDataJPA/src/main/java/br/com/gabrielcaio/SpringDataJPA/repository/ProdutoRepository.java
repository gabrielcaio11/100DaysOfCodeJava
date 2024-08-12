package br.com.gabrielcaio.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielcaio.SpringDataJPA.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
