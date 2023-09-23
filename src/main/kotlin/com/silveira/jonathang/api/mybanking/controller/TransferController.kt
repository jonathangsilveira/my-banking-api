package com.silveira.jonathang.api.mybanking.controller

import com.silveira.jonathang.api.mybanking.Mapper
import com.silveira.jonathang.api.mybanking.data.entity.TransactionEntityModel
import com.silveira.jonathang.api.mybanking.data.mapper.OverviewTransactionEntityToModelMapper
import com.silveira.jonathang.api.mybanking.data.mapper.TransactionModelToEntityMapper
import com.silveira.jonathang.api.mybanking.data.repository.TransactionRepository
import com.silveira.jonathang.api.mybanking.model.OverviewTransactionModel
import com.silveira.jonathang.api.mybanking.model.TransactionModel
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/transfer")
class TransferController(
        private val repository: TransactionRepository,
        private val transactionModelToEntityMapper: Mapper<TransactionModel, TransactionEntityModel> = TransactionModelToEntityMapper(),
        private val transactionEntityToModelMapper: Mapper<TransactionEntityModel, OverviewTransactionModel> = OverviewTransactionEntityToModelMapper()
) {

    @PostMapping("/new")
    fun newTransfer(@RequestBody transactionModel: TransactionModel) {
        val entityModel = transactionModelToEntityMapper.map(transactionModel)
        repository.save(entityModel)
    }

    @GetMapping("/all")
    fun getAllTransactions(): List<OverviewTransactionModel> =
            repository.findAll().map(transactionEntityToModelMapper::map)
}