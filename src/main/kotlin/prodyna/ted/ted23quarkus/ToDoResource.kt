package prodyna.ted.ted23quarkus

import prodyna.ted.ted23quarkus.entity.ToDo
import prodyna.ted.ted23quarkus.service.ToDoService
import javax.annotation.security.PermitAll
import javax.annotation.security.RolesAllowed
import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/rest/todo")
open class ToDoResource {

    @Inject
    @field: Default
    lateinit var todoService: ToDoService

    @GET
    @Path("ping")
    @Produces(MediaType.APPLICATION_JSON)
    @PermitAll
    fun hello() = ToDo("Ping successful!")

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @PermitAll
    fun testApi() = todoService.getAll()

    @POST
    @RolesAllowed("user")
    fun add(toDo: ToDo) = todoService.add(toDo)

    @DELETE
    @Path("/delete/{id}")
    @RolesAllowed("user")
    fun delete(@PathParam("id") id: Long) = todoService.delete(id)
}