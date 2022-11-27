package com.example.mbank.consumer

import com.example.dto.MessageDto
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class Listener {

    @KafkaListener(topics = ["mbank"], containerFactory = "kafkaListenerContainerFactory")
    fun listenGroupFoo(message: MessageDto) {
        println("Зачисление из ${message.fromBank}: ${message.amount}")
    }
}