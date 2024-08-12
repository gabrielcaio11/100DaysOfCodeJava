package br.com.gabrielcaio.SpringDataJPA.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gabrielcaio.SpringDataJPA.entities.Produto;
import br.com.gabrielcaio.SpringDataJPA.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public Produto create(Produto produto) {
		return produtoRepository.save(produto);
	}

	public Produto getProduto(Long id) {
		return produtoRepository.findById(id).get();

	}

	public Produto update(Produto produto) {		
			return produtoRepository.save(produto);
	}

	public void delete(Long id) {
		produtoRepository.deleteById(id);
	}

	public List<Produto> getProdutos() {

		return produtoRepository.findAll();
	}

}
