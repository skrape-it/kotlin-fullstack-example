package app.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class ExampleController {

    var count = 0

    @GetMapping("/time")
    fun getCurrentTime() = Foo(count = count++)

}

data class Foo(
        val count: Int = 0,
        val time: LocalDateTime = LocalDateTime.now()
)
