package br.com.gabrielcaio.ConsultasPersonalizadas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielcaio.ConsultasPersonalizadas.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	List<Livro> findByAno(Integer ano);

	List<Livro> findByAutor(String autor);

	List<Livro> findByTitulo(String titulo);

	Long countByAno(Integer ano);

}