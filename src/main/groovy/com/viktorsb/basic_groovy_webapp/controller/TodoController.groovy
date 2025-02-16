package com.viktorsb.basic_groovy_webapp.controller

import com.viktorsb.basic_groovy_webapp.model.Todo
import com.viktorsb.basic_groovy_webapp.service.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping('todo')
class TodoController {

    @Autowired
    private TodoService todoService

    @GetMapping
    List<Todo> getAllTodoList() {
        todoService.findAll()
    }

    @PostMapping
    Todo saveTodo(@RequestBody Todo todo) {
        todoService.saveTodo todo
    }

    @PutMapping
    Todo updateTodo(@RequestBody Todo todo) {
        todoService.updateTodo todo
    }

    @DeleteMapping('/{todoId}')
    deleteTodo(@PathVariable Integer todoId) {
        todoService.deleteTodo todoId
    }

    @GetMapping('/{todoId}')
    Todo getTodoById(@PathVariable Integer todoId) {
        todoService.findById todoId
    }
}
