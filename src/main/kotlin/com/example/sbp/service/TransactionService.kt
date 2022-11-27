package com.example.sbp.service

import com.example.sbp.dto.MessageDto
import com.example.sbp.repository.ClientRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class TransactionService(
    private val clientRepository: ClientRepository,
    private val kafkaTemplate: KafkaTemplate<String, MessageDto>
) {

    fun checkAccountExistence(message: MessageDto) =
        clientRepository.findByPhoneAndBankName(message.phone, message.toBank)

    fun addTransaction(message: MessageDto) {
        checkAccountExistence(message)?.let {
            kafkaTemplate.send("transactions", message)
        } ?: throw NotFoundException()
    }
}