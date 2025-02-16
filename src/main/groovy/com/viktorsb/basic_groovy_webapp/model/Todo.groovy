package com.viktorsb.basic_groovy_webapp.model

import jakarta.persistence.*

@Entity
@Table(name = 'todo')
class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    @Column
    String task

    @Column
    Boolean isCompleted
}
