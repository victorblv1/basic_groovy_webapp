package com.viktorsb.basic_groovy_webapp.service

import com.viktorsb.basic_groovy_webapp.model.Todo

interface TodoService {
    List<Todo> findAll()
    Todo findById(Long id)
    Todo saveTodo(Todo todo)
    Todo updateTodo(Todo todo)
    Todo deleteTodo(Todo todo)
}