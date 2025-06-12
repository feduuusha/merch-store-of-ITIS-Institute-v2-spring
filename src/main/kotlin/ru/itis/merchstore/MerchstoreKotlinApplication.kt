package ru.itis.merchstore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MerchstoreKotlinApplication

fun main(args: Array<String>) {
    runApplication<MerchstoreKotlinApplication>(*args)
}
