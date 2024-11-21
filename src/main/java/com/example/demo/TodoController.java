package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author skokurin
 * @since 09.11.2024
 */
@RestController
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody TodoInput input) {
        var todo = new Todo();
        todo.setId(UUID.randomUUID());
        todo.setContent(input.content());
        return todoRepository.save(todo);
    }
}
