package com.example.domain.network

import com.example.domain.model.Product

interface NetworkService {
    suspend fun getProducts(): ResultWrapper<List<Product>>
}

sealed class ResultWrapper<out T> {
    data class Success<out T>(val value: T): ResultWrapper<T>()
    data class Failure(val error: Throwable): ResultWrapper<Nothing>()
}