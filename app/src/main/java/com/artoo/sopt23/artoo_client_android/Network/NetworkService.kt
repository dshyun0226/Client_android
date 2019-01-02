package com.artoo.sopt23.artoo_client_android.Network

import com.artoo.sopt23.artoo_client_android.Data.Response.Get.GetTodayArtistResponse
import com.artoo.sopt23.artoo_client_android.Data.Response.Get.GetUserDescResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface NetworkService {
    // 오늘의 작품 조회
    @GET("/today")
    fun getTodayArtistResponse(
    ): Call<GetTodayArtistResponse>

    // 유저 소개 조회
    @GET("/users/{u_idx}/description")
    fun getUserDescResponse(
        @Header("Content-Type") content_type: String,
        @Path("u_idx") u_idx: Int
    ): Call<GetUserDescResponse>
}