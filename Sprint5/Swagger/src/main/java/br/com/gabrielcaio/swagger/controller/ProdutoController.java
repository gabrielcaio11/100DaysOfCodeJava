package br.com.gabrielcaio.swagger.controller;

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

import br.com.gabrielcaio.swagger.entities.Produto;
import br.com.gabrielcaio.swagger.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	private ProdutoService produtoService;

	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	@Operation(description = "Busca o produto pelo id")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "retorna o produto"),
			@ApiResponse(responseCode = "400", description = "Não existe um produto com id informado") })
	@GetMapping("{id}")
	public ResponseEntity<Optional<Produto>> getProdutoPorId(@PathVariable Long id) {
		// body,status
		return new ResponseEntity<>(produtoService.findById(id), HttpStatus.OK);

	}

	@Operation(description = "Retorna todos os produtos")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "retorna todo os produtos"),
			@ApiResponse(responseCode = "400", description = "Não existe produtos cadastrados") })
	@GetMapping
	public ResponseEntity<List<Produto>> getProdutos() {
		return new ResponseEntity<List<Produto>>(produtoService.findAll(), HttpStatus.OK);

	}

	@Operation(description = "adiciona um produto")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "201", description = "retorna  o produto adicionado"),
			@ApiResponse(responseCode = "400", description = "Não existe produtos cadastrados") })
	@PostMapping
	public ResponseEntity<Produto> create(@RequestBody Produto produto) {
		return new ResponseEntity<>(produtoService.create(produto), HttpStatus.CREATED);
	}

	@Operation(description = "atualiza um produto")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "201", description = "retorna  o produto atualizado"),
			@ApiResponse(responseCode = "400", description = "Não existe esse produto informado") })
	@PutMapping
	public ResponseEntity<Produto> update(@RequestBody Produto produto) {
		return new ResponseEntity<>(produtoService.update(produto), HttpStatus.CREATED);
	}

	@Operation(description = "deleta um produto pelo id")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "204", description = "produto deletado com sucesso"),
			@ApiResponse(responseCode = "400", description = "Não existe esse produto informado") })
	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		produtoService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
