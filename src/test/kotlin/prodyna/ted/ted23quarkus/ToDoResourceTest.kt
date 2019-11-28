package prodyna.ted.ted23quarkus

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import jdk.nashorn.internal.ir.annotations.Ignore
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
open class ToDoResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/rest/todo/ping")
          .`then`()
             .statusCode(200)
             .body("message", `is`("Ping successful!"))
    }

}