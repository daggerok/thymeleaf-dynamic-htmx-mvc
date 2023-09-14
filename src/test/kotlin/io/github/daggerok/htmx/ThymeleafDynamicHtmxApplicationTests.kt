package io.github.daggerok.htmx

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ThymeleafDynamicHtmxApplicationTests {

    @Test
    fun `should test context`() {
        // don't know how to test if page hasn't been fully reloaded...
    }
}
