package com.artoo.sopt23.artoo_client_android.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.artoo.sopt23.artoo_client_android.Network.ApplicationController
import com.artoo.sopt23.artoo_client_android.Network.NetworkService
import com.artoo.sopt23.artoo_client_android.R
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import kotlinx.android.synthetic.main.activity_join.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class JoinActivity : AppCompatActivity() {

    /*val input_email: String = et_join_email.text.toString()
    val input_password: String = et_join_password.text.toString()
    val input_name: String = et_join_email.text.toString()
    val input_phone: String = et_join_phone.text.toString()
    val input_location: String = et_join_location.text.toString()
    val input_bank: Int = spn_join_bank.selectedItemPosition
    val input_account: String = et_join_account.text.toString()
    val input_university: String = et_join_university.text.toString()
    val input_major: String = et_join_major.text.toString()*/

    /*var jsonObject = JSONObject()*/


    /*val networkService: NetworkService by lazy {
        ApplicationController.instance.networkService
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        setOnClickListener()
    }

    private fun setOnClickListener() {

        btn_join_next1.setOnClickListener {
            /*jsonObject.put("u_email", input_email)
            jsonObject.put("u_pw", input_password)*/

            ll_join_first.visibility = View.GONE
            ll_join_second.visibility = View.VISIBLE
        }
        btn_join_next2.setOnClickListener {
            /*jsonObject.put("u_name", input_name)
            jsonObject.put("u_phone", input_phone)
            jsonObject.put("u_address", input_location)*/

            ll_join_second.visibility = View.GONE
            ll_join_third.visibility = View.VISIBLE
        }
        btn_join_next3.setOnClickListener {
            /*jsonObject.put("u_bank", input_bank)
            jsonObject.put("u_account", input_account)*/

            ll_join_third.visibility = View.GONE
            ll_join_fourth.visibility = View.VISIBLE
        }
        btn_join_success.setOnClickListener {
            /*jsonObject.put("u_school", input_university)
            jsonObject.put("u_dept", input_major)*/

            /*getJoinResponse()*/
        }
    }

    /*private fun getJoinResponse() {

        Log.d("*****JoinActivity::json::", jsonObject.toString())

        val gsonObject = JsonParser().parse(jsonObject.toString()) as JsonObject
        Log.d("*****JoinActivity::gson::", gsonObject.toString())

        val postSignUpResponse: Call<PostJoinResponse> = networkService.postJoinResponse("application/json", gsonObject)
        postSignUpResponse.enqueue(object : Callback<PostJoinResponse> {
            override fun onFailure(call: Call<PostJoinResponse>, t: Throwable) {
                Log.e("New_user_Join_Failed", t.toString())
            }
            override fun onResponse(call: Call<PostJoinResponse>, response: Response<PostJoinResponse>) {
                if (response.isSuccessful) {

                    toast(response.body()!!.message)
                    Log.d("*****JoinActivity::", response.body().toString())

                    finish()
                }
            }
        })
    }*/
}
