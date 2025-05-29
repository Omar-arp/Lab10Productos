package com.example.lab10productos.data

import retrofit2.http.*
import retrofit2.Response

interface ProductApiService {

    @GET("products")
    suspend fun getProducts(): Response<ProductListResponse>

    @POST("products/add")
    suspend fun createProduct(@Body product: Product): Response<Product>

    @PUT("products/{id}")
    suspend fun updateProduct(@Path("id") id: Int, @Body product: Product): Response<Product>

    @DELETE("products/{id}")
    suspend fun deleteProduct(@Path("id") id: Int): Response<Unit>
}
