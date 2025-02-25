package io.github.edsonzucchi.springkotlinkafka

import io.github.edsonzucchi.springkotlinkafka.producer.ExampleStringProducer
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController(
    private val exampleStringProducer: ExampleStringProducer
) {

    @PostMapping("/test")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun sendTestMessage(@RequestParam("message") message: String) {
        exampleStringProducer.sendStringMessage(message)
    }
}