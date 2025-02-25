package io.github.edsonzucchi.springkotlinkafka.consumer

import io.github.edsonzucchi.springkotlinkafka.EXAMPLE_TOPIC_NAME
import io.github.edsonzucchi.springkotlinkafka.GROUP_ID
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class ExampleConsumer {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @KafkaListener(topics = [EXAMPLE_TOPIC_NAME], groupId = GROUP_ID)
    fun firstListener(message: String) {
        logger.info("First listener: $message")
    }
}