package br.com.gabrielcaio.TodoList.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.gabrielcaio.TodoList.entities.Todo;
import br.com.gabrielcaio.TodoList.repository.TodoRepository;
import br.com.gabrielcaio.TodoList.service.exceptions.TodoAlreadyExistsException;
import br.com.gabrielcaio.TodoList.service.exceptions.TodoNotExistsException;
import br.com.gabrielcaio.TodoList.service.exceptions.TodoNotFoundException;

@Service
public class TodoService {

	private TodoRepository todoRepository;

	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	public Todo findById(Long id) {
		return todoRepository.findById(id).orElseThrow(() -> new TodoNotFoundException("Id not found"));
	}
	public Page<Todo> findAll(Pageable pageable) {
		return todoRepository.findAll(pageable);
	}

	public Todo create(Todo todo) {
		if (isTodoExists(todo)) {
			throw new TodoAlreadyExistsException("Todo Already Exists");
		}
		return todoRepository.save(todo);
	}

	private boolean isTodoExists(Todo todo) {
		if (todoRepository.existsById(todo.getId())) {
			return true;
		}
		return false;
	}

	public Todo update(Todo todo) {
		if (!isTodoExists(todo)) {
			throw new TodoNotExistsException("Todo Not Exists");
		}
		return todoRepository.save(todo);
	}

	public void deleteById(Long id) {
		if (!todoRepository.existsById(id)) {
			throw new TodoNotExistsException("Todo Not Exists");
		}
		todoRepository.deleteById(id);
	}
}
