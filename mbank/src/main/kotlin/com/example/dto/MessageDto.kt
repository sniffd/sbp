package com.example.dto

import com.example.mbank.annotation.NoArg
import java.math.BigDecimal

@NoArg
data class MessageDto(
    var phone: String,
    var amount: BigDecimal,
    var fromBank: String,
    var toBank: String
)
