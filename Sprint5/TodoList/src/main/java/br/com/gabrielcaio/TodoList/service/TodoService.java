package br.com.gabrielcaio.TodoList.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.gabrielcaio.TodoList.entities.Todo;
import br.com.gabrielcaio.TodoList.repository.TodoRepository;

@Service
public class TodoService {

	private TodoRepository todoRepository;
	
	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public Optional<Todo> findById(Long id){
		return todoRepository.findById(id);
	}
	public List<Todo> findAll(){
		return todoRepository.findAll();
	}
	
	public Todo create(Todo todo) {
		return todoRepository.save(todo);
	}
	public Todo update(Todo todo) {
		return todoRepository.save(todo);
	}
	public void deleteById(Long id) {
		todoRepository.deleteById(id);
	}
}
