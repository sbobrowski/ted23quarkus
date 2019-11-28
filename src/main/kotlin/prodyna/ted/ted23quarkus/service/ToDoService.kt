package prodyna.ted.ted23quarkus.service

import prodyna.ted.ted23quarkus.entity.ToDo

interface ToDoService {

    fun add(todo: ToDo)

    fun getAll() : List<ToDo>

    fun delete(id: Long): Long
}