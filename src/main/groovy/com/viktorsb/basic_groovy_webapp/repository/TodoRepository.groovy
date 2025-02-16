package com.viktorsb.basic_groovy_webapp.repository

import com.viktorsb.basic_groovy_webapp.model.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository extends JpaRepository<Todo, Long> {
}
