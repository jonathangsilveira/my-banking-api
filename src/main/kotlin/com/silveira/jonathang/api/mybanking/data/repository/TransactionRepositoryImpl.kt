package com.silveira.jonathang.api.mybanking.data.repository

import com.silveira.jonathang.api.mybanking.data.entity.TransactionEntityModel
import org.springframework.data.repository.CrudRepository
import java.util.*

interface TransactionRepository : CrudRepository<TransactionEntityModel, UUID>