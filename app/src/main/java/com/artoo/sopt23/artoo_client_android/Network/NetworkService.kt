package com.artoo.sopt23.artoo_client_android.Network

import com.artoo.sopt23.artoo_client_android.Post.PostJoinResponse
import com.artoo.sopt23.artoo_client_android.Post.PostLoginResponse
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface NetworkService {

    //Join
    @POST("/users")
    fun postJoinResponse(
        @Header("Content-Type") content_type: String,
        @Body() body: JsonObject
    ): Call<PostJoinResponse>

    //Login
    @POST("/login")
    fun postLoginResponse(
        @Header("Content-Type") content_type: String,
        @Body() body: JsonObject
    ): Call<PostLoginResponse>
}