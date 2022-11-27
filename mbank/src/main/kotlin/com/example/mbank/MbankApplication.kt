package com.example.mbank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MbankApplication

fun main(args: Array<String>) {
    runApplication<MbankApplication>(*args)
}
