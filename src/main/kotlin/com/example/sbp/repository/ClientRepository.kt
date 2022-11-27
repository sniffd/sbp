package com.example.sbp.repository

import com.example.sbp.entity.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<Client, Long> {

    fun findByPhoneAndBankName(phone: String, bankName: String): Client?
}