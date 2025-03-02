package io.github.edsonzucchi.springkotlinkafka.producer

import io.github.edsonzucchi.springkotlinkafka.DataClass
import io.github.edsonzucchi.springkotlinkafka.EXAMPLE_TOPIC_NAME
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class ExampleStringProducer (
    private val kafkaTemplate: KafkaTemplate<String, DataClass>
){

    fun sendClass(dto: DataClass){
        kafkaTemplate.send(EXAMPLE_TOPIC_NAME, dto)
    }
}