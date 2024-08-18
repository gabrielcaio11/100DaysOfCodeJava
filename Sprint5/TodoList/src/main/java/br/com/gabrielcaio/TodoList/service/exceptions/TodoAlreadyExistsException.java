package br.com.gabrielcaio.TodoList.service.exceptions;

public class TodoAlreadyExistsException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public TodoAlreadyExistsException(String msg) {
		super(msg);
	}

}
