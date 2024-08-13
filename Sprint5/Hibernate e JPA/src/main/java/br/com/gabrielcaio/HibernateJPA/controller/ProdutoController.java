package br.com.gabrielcaio.HibernateJPA.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielcaio.HibernateJPA.entities.Produto;
import br.com.gabrielcaio.HibernateJPA.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	private ProdutoService produtoService;

	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	@PostMapping
	public Produto create(@RequestBody Produto produto) {
		return produtoService.create(produto);
	}

	@GetMapping("{id}")
	public Produto getProduto(@PathVariable Long id) {
		return produtoService.getProduto(id);

	}

	@GetMapping
	public List<Produto> getProdutos() {
		return produtoService.getProdutos();

	}

	@PutMapping
	public Produto update(@RequestBody Produto produto) {
		return produtoService.update(produto);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		produtoService.delete(id);
	}

}
