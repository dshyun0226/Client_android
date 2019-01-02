package com.artoo.sopt23.artoo_client_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.artoo.sopt23.artoo_client_android.Network.ApplicationController
import com.artoo.sopt23.artoo_client_android.Network.NetworkService
import com.artoo.sopt23.artoo_client_android.Post.PostLoginResponse
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.toast
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {

    val jsonObject = JSONObject()
    val networkService: NetworkService by lazy {
        ApplicationController.instance.networkService
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_login.setOnClickListener {

            val input_email = et_login_email.text.toString()
            val input_pw = et_login_password.text.toString()


            jsonObject.put("email", input_email)
            jsonObject.put("password", input_pw)

            getLoginResponse()
        }
        btn_login_join.setOnClickListener {
            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getLoginResponse() {
        Log.d("*****LoginActivity::json::", jsonObject.toString())

        val gsonObject = JsonParser().parse(jsonObject.toString()) as JsonObject
        Log.d("*****JoinActivity::gson::", gsonObject.toString())

        val postSignUpResponse: Call<PostLoginResponse> = networkService.postLoginResponse("application/json", gsonObject)
        postSignUpResponse.enqueue(object : Callback<PostLoginResponse> {
            override fun onFailure(call: Call<PostLoginResponse>, t: Throwable) {
                Log.e("User_Login_Failed", t.toString())
            }
            override fun onResponse(call: Call<PostLoginResponse>, response: Response<PostLoginResponse>) {
                if (response.isSuccessful) {

                    toast(response.body()!!.message)
                    Log.d("*****JoinActivity::", response.body().toString())

                    finish()
                }
            }
        })
    }
}
