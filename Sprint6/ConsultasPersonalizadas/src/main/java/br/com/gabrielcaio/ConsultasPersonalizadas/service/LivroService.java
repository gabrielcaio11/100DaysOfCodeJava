package br.com.gabrielcaio.ConsultasPersonalizadas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gabrielcaio.ConsultasPersonalizadas.entities.Livro;
import br.com.gabrielcaio.ConsultasPersonalizadas.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	public List<Livro> encontrarPorTitulo(String titulo) {
		return livroRepository.findByTitulo(titulo);
	}

	public List<Livro> encontrarPorAutor(String autor) {
		return livroRepository.findByAutor(autor);
	}

	public List<Livro> encontrarPorAno(Integer ano) {
		return livroRepository.findByAno(ano);
	}

	public List<Livro> listarTodos() {
		return livroRepository.findAll();
	}
	
	public Long quantidadeDeLivrosPorAno(Integer ano) {
		return livroRepository.countByAno(ano);
	}
}
