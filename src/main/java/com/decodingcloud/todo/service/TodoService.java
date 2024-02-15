package com.decodingcloud.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decodingcloud.todo.entity.Todo;
import com.decodingcloud.todo.repository.TodoRepository;
import com.decodingcloud.todo.utils.ResourceNotFoundException;

@Service
public class TodoService {
	
	@Autowired
	TodoRepository todoRepository;
	
	public List<Todo> findAll() {
        return todoRepository.findAll();
    }


    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }


    public Todo findById(Long id) {
        Todo todo = todoRepository.findById(id)
               .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id " + id));
        return todo;
    }
    
    public Todo updateTodo(Long id, Todo todoDetails) {
        Todo todo = todoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id " + id));
        todo.setTitle(todoDetails.getTitle());
        todo.setCompleted(todoDetails.isCompleted());

        return todoRepository.save(todo);
    }


    public void deleteTodo(Long id) {
        Todo todo = todoRepository.findById(id)
               .orElseThrow(() -> new ResourceNotFoundException("Todo not found with id " + id));
        todoRepository.delete(todo);
    }

}
