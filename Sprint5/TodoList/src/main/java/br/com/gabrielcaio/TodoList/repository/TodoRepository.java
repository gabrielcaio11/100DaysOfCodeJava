package br.com.gabrielcaio.TodoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gabrielcaio.TodoList.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
