package br.com.gabrielcaio.TodoList.infra;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.gabrielcaio.TodoList.service.exceptions.TodoAlreadyExistsException;
import br.com.gabrielcaio.TodoList.service.exceptions.TodoNotExistsException;
import br.com.gabrielcaio.TodoList.service.exceptions.TodoNotFoundException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(TodoAlreadyExistsException.class)
	private ResponseEntity<String> todoAlreadyExistsExceptionHandler(TodoAlreadyExistsException ex) {
		return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
	}
	@ExceptionHandler(TodoNotExistsException.class)
	private ResponseEntity<String> todoNotExistsExceptionHandler(TodoNotExistsException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
	@ExceptionHandler(TodoNotFoundException.class)
	private ResponseEntity<String> todoNotFoundExceptionHandler(TodoNotFoundException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}	

}
