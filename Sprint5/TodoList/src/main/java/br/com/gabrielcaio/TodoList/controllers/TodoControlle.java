package br.com.gabrielcaio.TodoList.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielcaio.TodoList.entities.Todo;
import br.com.gabrielcaio.TodoList.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/TODOS")
public class TodoControlle {

	private TodoService todoService;

	public TodoControlle(TodoService todoService) {
		this.todoService = todoService;
	}

	@Operation(description = "Busca o todo pelo id")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "retorna o todo"),
			@ApiResponse(responseCode = "400", description = "Não existe um todo com id informado") })
	@GetMapping("{id}")
	public ResponseEntity<Todo> findById(@PathVariable Long id) {
		return new ResponseEntity<>(todoService.findById(id), HttpStatus.OK);

	}
	@Operation(description = "Retorna todos os todo")

	@ApiResponses(value = {

			@ApiResponse(responseCode = "200", description = "retorna todo os todo"),

			@ApiResponse(responseCode = "400", description = "Não existe todo cadastrados") })

	@GetMapping
	public ResponseEntity<Page<Todo>> findAll(
			@RequestParam(defaultValue = "0") int page, 
			@RequestParam(defaultValue = "10") int size) {
		//Pageable pageable = PageRequest.of(page, size);
		return new ResponseEntity<Page<Todo>>(todoService.findAll(PageRequest.of(page, size)), HttpStatus.OK);


	}

	@Operation(description = "adiciona um todo")

	@ApiResponses(value = {

			@ApiResponse(responseCode = "201", description = "retorna  o todo adicionado"),
			@ApiResponse(responseCode = "209", description = "conflito - todo ja existe") })

	@PostMapping
	public ResponseEntity<Todo> create(@RequestBody Todo todo) {
		return new ResponseEntity<>(todoService.create(todo), HttpStatus.CREATED);
	}

	@Operation(description = "atualiza um todo")

	@ApiResponses(value = {

			@ApiResponse(responseCode = "201", description = "retorna  o todo atualizado"),

			@ApiResponse(responseCode = "400", description = "Não existe esse todo informado") })

	@PutMapping
	public ResponseEntity<Todo> update(@RequestBody Todo todo) {
		return new ResponseEntity<>(todoService.update(todo), HttpStatus.CREATED);
	}

	@Operation(description = "deleta um todo pelo id")

	@ApiResponses(value = {

			@ApiResponse(responseCode = "204", description = "todo deletado com sucesso"),

			@ApiResponse(responseCode = "400", description = "Não existe esse todo informado") })

	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		todoService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
