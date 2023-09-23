package com.silveira.jonathang.api.mybanking.data.mapper

import com.silveira.jonathang.api.mybanking.Mapper
import com.silveira.jonathang.api.mybanking.data.entity.TransactionEntityModel
import com.silveira.jonathang.api.mybanking.model.TransactionModel


internal class TransactionModelToEntityMapper : Mapper<TransactionModel, TransactionEntityModel> {
    override fun map(source: TransactionModel): TransactionEntityModel = with(source) {
        TransactionEntityModel(
                transactionValue = value,
                accountIdentifier = targetAccount,
                description = description
        )
    }
}