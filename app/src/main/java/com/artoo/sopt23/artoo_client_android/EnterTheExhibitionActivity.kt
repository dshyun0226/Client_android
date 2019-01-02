package com.artoo.sopt23.artoo_client_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.activity_enter_the_exhibition.*
import kotlinx.android.synthetic.main.activity_exhibition_detail.*

class EnterTheExhibitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_the_exhibition)

        btn_enter_ex.setOnClickListener {
            val nextIntent = Intent(this, ExhibitionDetailActivity::class.java)
            startActivity(nextIntent)
        }
    }
}
