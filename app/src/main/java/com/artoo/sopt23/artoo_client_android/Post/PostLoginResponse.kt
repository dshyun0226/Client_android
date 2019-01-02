package com.artoo.sopt23.artoo_client_android.Post

data class PostLoginResponse(
    val status: String,
    val message: String,
    val data: data
)

data class data(
    val token: String
)