package com.artoo.sopt23.artoo_client_android.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.activity_join3.*

class JoinActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join3)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_join_next3.setOnClickListener {
            val intent = Intent(this, JoinActivity4::class.java)
            startActivity(intent)
        }
    }
}
