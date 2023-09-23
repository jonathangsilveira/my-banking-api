package com.silveira.jonathang.api.mybanking

interface Mapper<in T, out R> {
    fun map(source: T): R
}