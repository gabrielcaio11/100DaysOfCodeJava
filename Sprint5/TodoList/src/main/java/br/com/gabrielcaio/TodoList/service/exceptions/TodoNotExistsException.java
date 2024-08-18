package br.com.gabrielcaio.TodoList.service.exceptions;

public class TodoNotExistsException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public TodoNotExistsException(String msg) {
		super(msg);
	}

}
