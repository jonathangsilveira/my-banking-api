package com.silveira.jonathang.api.mybanking.model

data class TransactionModel(
        val targetAccount: String,
        val value: Double,
        val description: String?
)
