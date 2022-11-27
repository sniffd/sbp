package com.example.sbp.controller

import com.example.dto.MessageDto
import com.example.sbp.service.TransactionService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TransactionController(private val transactionService: TransactionService) {

    @PostMapping("/postTransaction")
    fun postTransaction(@RequestBody message: MessageDto) {
        transactionService.addTransaction(message)
    }
}