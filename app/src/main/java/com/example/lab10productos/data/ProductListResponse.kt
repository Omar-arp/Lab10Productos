package com.example.lab10productos.data

import com.google.gson.annotations.SerializedName

data class ProductListResponse(
    @SerializedName("products") val products: List<Product>
)
