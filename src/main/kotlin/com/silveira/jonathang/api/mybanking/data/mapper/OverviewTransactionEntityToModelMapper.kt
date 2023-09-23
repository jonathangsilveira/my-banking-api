package com.silveira.jonathang.api.mybanking.data.mapper

import com.silveira.jonathang.api.mybanking.Mapper
import com.silveira.jonathang.api.mybanking.data.entity.TransactionEntityModel
import com.silveira.jonathang.api.mybanking.model.OverviewTransactionModel

internal class OverviewTransactionEntityToModelMapper : Mapper<TransactionEntityModel, OverviewTransactionModel> {
    override fun map(source: TransactionEntityModel): OverviewTransactionModel = with(source) {
        OverviewTransactionModel(
                targetAccount = accountIdentifier,
                value = transactionValue,
                description = description,
                date = date,
                id = id?.toString() ?: ""
        )
    }
}