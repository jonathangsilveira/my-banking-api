package com.silveira.jonathang.api.mybanking.data.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.util.*

@Entity
class TransactionEntityModel(
        val accountIdentifier: String,
        val transactionValue: Double,
        val description: String?
) {
    @Id
    @GeneratedValue
    var id: UUID? = null
        private set

    val date: Date = Date()
}
