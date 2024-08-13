package br.com.gabrielcaio.HibernateJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielcaio.HibernateJPA.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
