package prodyna.ted.ted23quarkus.entity

import io.quarkus.hibernate.orm.panache.PanacheEntity
import javax.persistence.Entity

@Entity
data class ToDo (var message: String) : PanacheEntity() {

    constructor() : this("")

}