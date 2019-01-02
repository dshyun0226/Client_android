package com.artoo.sopt23.artoo_client_android.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.activity_join1.*

class JoinActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join1)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_join_next1.setOnClickListener{
            val intent = Intent(this, JoinActivity2::class.java)
            startActivity(intent)
        }
    }
}
