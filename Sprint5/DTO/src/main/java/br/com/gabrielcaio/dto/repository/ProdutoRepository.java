package br.com.gabrielcaio.dto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielcaio.dto.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
