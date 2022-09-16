package io.github.daggerok.htmx

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.domain.Sort
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.relational.core.mapping.Table
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.reactive.result.view.Rendering
import reactor.core.publisher.Mono
import java.time.Instant

@SpringBootApplication
class ThymeleafDynamicHtmxApplication

fun main(args: Array<String>) {
    runApplication<ThymeleafDynamicHtmxApplication>(*args)
}

@Table("users")
data class User(
    val name: String = "",
    @LastModifiedDate
    @DateTimeFormat(iso = DATE_TIME)
    val timestamp: Instant? = null,
    @Id val id: Long? = null,
)

interface Users : R2dbcRepository<User, Long>

data class CreateUserFormData(
    val name: String = "",
)

@Controller
class IndexPage(private val users: Users) {

    // @ModelAttribute
    // fun createUserFormData(): CreateUserFormData =
    //     CreateUserFormData()

    @GetMapping("/")
    fun indexHtml() =
        Rendering.view("index")
            .modelAttribute("users", users.findAll(Sort.by("timestamp").descending()))
            .modelAttribute("createUserFormData", CreateUserFormData())
            .build()

    @PostMapping("/")
    fun createUser(@ModelAttribute createUserFormData: CreateUserFormData) =
        users.save(User(name = createUserFormData.name))
            .then(Mono.just("redirect:/"))
}
