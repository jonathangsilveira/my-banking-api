package com.silveira.jonathang.api.mybanking.model

import java.util.Date

data class OverviewTransactionModel(
        val targetAccount: String,
        val value: Double,
        val description: String?,
        val date: Date,
        val id: String
)
