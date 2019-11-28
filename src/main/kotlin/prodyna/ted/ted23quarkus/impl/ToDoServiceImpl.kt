package prodyna.ted.ted23quarkus.impl

import prodyna.ted.ted23quarkus.dao.ToDoDao
import prodyna.ted.ted23quarkus.entity.ToDo
import prodyna.ted.ted23quarkus.service.ToDoService
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
open class ToDoServiceImpl : ToDoService {

    @Inject
    @field: Default
    lateinit var toDoDao: ToDoDao

    @Transactional
    override fun add(toDo: ToDo) = toDoDao.persist(toDo)

    override fun getAll(): List<ToDo> = toDoDao.listAll()

    @Transactional
    override fun delete(id: Long) = toDoDao.delete("id", id)
}