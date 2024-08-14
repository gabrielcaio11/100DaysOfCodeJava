package br.com.gabrielcaio.apirestful.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.gabrielcaio.apirestful.entities.Produto;
import br.com.gabrielcaio.apirestful.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Optional<Produto> findById(Long id) {
		return produtoRepository.findById(id);

	}

	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}
	
	public Produto create(Produto produto) {
		return produtoRepository.save(produto);
	}

	

	public Produto update(Produto produto) {		
			return produtoRepository.save(produto);
	}

	public void deleteById(Long id) {
		produtoRepository.deleteById(id);
	}

}
