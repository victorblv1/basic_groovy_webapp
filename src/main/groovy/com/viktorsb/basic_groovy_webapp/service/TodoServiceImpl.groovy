package com.viktorsb.basic_groovy_webapp.service

import com.viktorsb.basic_groovy_webapp.model.Todo
import com.viktorsb.basic_groovy_webapp.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository

    @Override
    List<Todo> findAll() {
        todoRepository.findAll()
    }

    @Override
    Todo findById(Long id) {
        todoRepository.findById todoId get()
    }

    @Override
    Todo saveTodo(Todo todo) {
        todoRepository.save todo
    }

    @Override
    Todo updateTodo(Todo todo) {
        todoRepository.save todo
    }

    @Override
    Todo deleteTodo(Todo todo) {
        todoRepository.deleteById todoId
    }
}