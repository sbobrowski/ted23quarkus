package prodyna.ted.ted23quarkus.dao

import io.quarkus.hibernate.orm.panache.PanacheRepository
import prodyna.ted.ted23quarkus.entity.ToDo
import javax.inject.Singleton

@Singleton
open class ToDoDao : PanacheRepository<ToDo>