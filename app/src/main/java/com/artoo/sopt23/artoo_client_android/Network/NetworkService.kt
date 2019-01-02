package com.artoo.sopt23.artoo_client_android.Network

import com.artoo.sopt23.artoo_client_android.Post.PostJoinResponse
import com.artoo.sopt23.artoo_client_android.Post.PostLoginResponse
import com.artoo.sopt23.artoo_client_android.Post.PostMypageIntroResponse
import com.artoo.sopt23.artoo_client_android.Post.PostProductUploadResponse
import com.google.gson.JsonObject
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

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

    //ProductUpload::create
    @Multipart
    @POST("/artworks")
    fun postProductUploadResponse(
        @Header("Authorization") token: String,
        @Part("a_name") a_name: RequestBody,
        @Part("a_width") a_width: Int,
        @Part("a_height") a_height: Int,
        //@Part("a_depth") a_depth: Int,
        @Part("a_category") a_category: RequestBody,
        @Part("a_form") a_form: RequestBody,
        @Part("a_price") a_price: Int,
        @Part("a_detail") a_detail: RequestBody,
        @Part("a_year") a_year: RequestBody,
        @Part picUrl: MultipartBody.Part?,
        @Part("a_tags") a_tags: RequestBody,
        @Part("a_license") a_license: RequestBody///,
        //@Part("a_material") a_material: RequestBody,
        //@Part("a_expression") a_expressions: RequestBody
        ): Call<PostProductUploadResponse>

    //Mypage::Intro::Create&Update
    @POST("/users/{u_idx}/description")
    fun postMypageIntroResponse(
        @Header("Content-Type") content_type: String,
        @Header("Authorization") token: String,
        @Body() body: JsonObject
    ): Call<PostMypageIntroResponse>


    @GET("/users/{u_idx}/description")
    fun getMypageIntroResponse(
        @Header("Content-Type") content_type: String,
        @Path("u_idx") u_idx: Int
    )

}