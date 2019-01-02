package com.artoo.sopt23.artoo_client_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView
import com.artoo.sopt23.artoo_client_android.Data.ProductUploadTagLayoutData
import com.artoo.sopt23.artoo_client_android.Fragment.ProductUploadAlertFragment
import com.artoo.sopt23.artoo_client_android.Fragment.ProductUploadThemeFragment
import kotlinx.android.synthetic.main.activity_product_upload.*
import org.w3c.dom.Text
import java.util.ArrayList

class ProductUploadActivity : AppCompatActivity() {

    val themes = ArrayList<String>()
    val layouts = ArrayList<ProductUploadTagLayoutData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_upload)

        setAlertDialog()
        setViewClickListener()

        var categories = arrayOf("인물", "동물", "식물", "사물", "추상화", "풍경")
        spn_product_upload_category.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, categories)

        var formats = arrayOf("드로잉", "페인팅", "동양화", "혼합매체", "조형/공예", "디지털")
        spn_product_upload_format.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, formats)

        var licenses = arrayOf("CCL표시안함", "저작권표시", "저작권표시-비영리", "저작자표시-동일조건변경허락", "저작자표시-변경금지", "저작자표시-비영리-동일조건변경허락", "저작자표시-비영리-변경금지")
        spn_product_upload_license.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, licenses)

        setSpinnerItemSelectedListener()
    }

    private fun setAlertDialog() {
        val alert_dialog = ProductUploadAlertFragment()
        alert_dialog.show(supportFragmentManager, alert_dialog.tag)
    }

    private fun setViewClickListener() {
        btn_product_upload_close.setOnClickListener {
            finish()
        }
        btn_product_upload_open_album.setOnClickListener {

        }

        btn_product_upload_add_theme.setOnClickListener {
            val bottom_sheet_dialog = ProductUploadThemeFragment()
            bottom_sheet_dialog.show(supportFragmentManager, bottom_sheet_dialog.tag)
        }
        btn_product_upload_delivery_parcel.setOnClickListener {

        }
        btn_product_upload_delivery_direct.setOnClickListener {

        }
        btn_product_upload_finish.setOnClickListener {
            finish()
        }
    }

    private fun setSpinnerItemSelectedListener(){

        spn_product_upload_category.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }
        }
        spn_product_upload_format.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }
        }
        spn_product_upload_license.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }
        }
    }

    fun setTag() {

        for (i in 0 until themes.size)
            Log.d(":::::product_upload_theme_activity:::::themes:::::setTag::", i.toString()+themes[i])
        Log.d(":::::product_upload_theme_activity:::::themes:::::setTag::layouts.size::", layouts.size.toString())

        layouts.clear()

        if (themes.size == 0) {
            /*해시태그 선택 안했을 때*/
            btn_product_upload_add_theme.visibility = View.VISIBLE
            rl_product_upload_tag1.visibility = View.GONE
            rl_product_upload_tag2.visibility = View.GONE
            rl_product_upload_tag3.visibility = View.GONE
        } else if (themes.size == 1) {
            /*해시태그 1개 선택 했을 때*/

            layouts.add(ProductUploadTagLayoutData(rl_product_upload_tag1, tv_product_upload_tag1))

            setRemoveTagButtonClickListener()

            tv_product_upload_tag1.setText(themes[0])
            btn_product_upload_add_theme.visibility = View.VISIBLE
            rl_product_upload_tag1.visibility = View.VISIBLE
            rl_product_upload_tag2.visibility = View.GONE
            rl_product_upload_tag3.visibility = View.GONE

        } else if (themes.size == 2) {
            /*해시태그 2개 선택 했을 때*/
            layouts.add(ProductUploadTagLayoutData(rl_product_upload_tag1, tv_product_upload_tag1))
            layouts.add(ProductUploadTagLayoutData(rl_product_upload_tag2, tv_product_upload_tag2))

            setRemoveTagButtonClickListener()

            tv_product_upload_tag1.setText(themes[0])
            tv_product_upload_tag2.setText(themes[1])
            btn_product_upload_add_theme.visibility = View.VISIBLE
            rl_product_upload_tag1.visibility = View.VISIBLE
            rl_product_upload_tag2.visibility = View.VISIBLE
            rl_product_upload_tag3.visibility = View.GONE
        } else if (themes.size == 3) {
            /*해시태그 3개 선택 했을 때*/
            layouts.add(ProductUploadTagLayoutData(rl_product_upload_tag1, tv_product_upload_tag1))
            layouts.add(ProductUploadTagLayoutData(rl_product_upload_tag2, tv_product_upload_tag2))
            layouts.add(ProductUploadTagLayoutData(rl_product_upload_tag3, tv_product_upload_tag3))

            setRemoveTagButtonClickListener()

            tv_product_upload_tag1.setText(themes[0])
            tv_product_upload_tag2.setText(themes[1])
            tv_product_upload_tag3.setText(themes[2])
            btn_product_upload_add_theme.visibility = View.GONE
            rl_product_upload_tag1.visibility = View.VISIBLE
            rl_product_upload_tag2.visibility = View.VISIBLE
            rl_product_upload_tag3.visibility = View.VISIBLE

        }
    }

    private fun setRemoveTagButtonClickListener() {

        btn_product_upload_delete_tag1.setOnClickListener {

//            removeTag()
            removeTag(tv_product_upload_tag1.text.toString())
        }
        btn_product_upload_delete_tag2.setOnClickListener {
//            removeTag(1)
            removeTag(tv_product_upload_tag2.text.toString())
        }
        btn_product_upload_delete_tag3.setOnClickListener {
//            removeTag(2)
            removeTag(tv_product_upload_tag3.text.toString())
        }

    }

    fun removeTag(rTag: String) {

        var rIdx: Int = -1

        Log.e("ABAB:rTag", rTag)
        for (i in 0 until themes.size) {
            Log.e("ABAB:themes", themes.get(i))
            if (themes.get(i).equals(rTag)) {
                rIdx = i
                Log.d(":::::product_upload_theme_activity:::::themes:::::removeTag::rTag::", themes.get(rIdx))
                break
            }
        }


        layouts.removeAt(rIdx)
        themes.removeAt(rIdx)
        setTag()
    }

//    fun removeTag(rTag: String) {
//
//        for (i in themes.size) {
//
//        }
//    }

}
