package br.com.gabrielcaio.apirestful.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielcaio.apirestful.entities.Produto;
import br.com.gabrielcaio.apirestful.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	private ProdutoService produtoService;

	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	@GetMapping("{id}")
	public ResponseEntity<Optional<Produto>> getProdutoPorId(@PathVariable Long id) {
		// body,status
		return new ResponseEntity<>(produtoService.findById(id), HttpStatus.OK);

	}

	@GetMapping
	public ResponseEntity<List<Produto>> getProdutos() {
		return new ResponseEntity<List<Produto>>(produtoService.findAll(), HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<Produto> create(@RequestBody Produto produto) {
		return new ResponseEntity<>(produtoService.create(produto),HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Produto> update(@RequestBody Produto produto) {
		return new ResponseEntity<>(produtoService.update(produto),HttpStatus.CREATED);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		produtoService.deleteById(id);
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
