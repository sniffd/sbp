package com.example.sbp.dto

import java.math.BigDecimal

data class MessageDto(
    var phone: String,
    var amount: BigDecimal,
    var fromBank: String,
    var toBank: String
)
