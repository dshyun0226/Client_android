package com.artoo.sopt23.artoo_client_android.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.artoo.sopt23.artoo_client_android.Data.TodayArtistData
import com.artoo.sopt23.artoo_client_android.Data.TodayMainData
import com.artoo.sopt23.artoo_client_android.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class HomeTodayRecyclerViewAdapter(val ctx: Context, val dataListMain: ArrayList<TodayMainData>, val dataListArtist:ArrayList<TodayArtistData>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == 0){
            Log.i("hitag","0")
            val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_home_today_artist_main, parent, false)
            return HolderMain(view)
        }
        else{
            Log.i("hitag","1")
            val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_home_today_artist, parent, false)
            return HolderArtist(view)
        }

    }

    override fun getItemCount(): Int = dataListMain.size + dataListArtist.size

    override fun getItemViewType(position: Int): Int {
        if(position == 0){
            return 0
        }
        else {
            return 1
        }
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(position == 0)
        {
            (holder as HolderMain).university.text = dataListMain[position].university
            (holder).name.text = dataListMain[position].name
            (holder).intro.text = dataListMain[position].intro
            Glide.with(ctx)
                .load(dataListMain[position].back_img_url)
                .into((holder).backimg)
        }
        else {
            (holder as HolderArtist).title.text = dataListArtist[position-1].title
            Glide.with(ctx)
                .load(dataListArtist[position-1].img_url)
                .into((holder).img)
        }
    }

    inner class HolderMain(itemView: View): RecyclerView.ViewHolder(itemView){
        val university: TextView = itemView.findViewById(R.id.tv_rv_item_home_today_artist_main_university) as TextView
        val name: TextView = itemView.findViewById(R.id.tv_rv_item_home_today_artist_main_name) as TextView
        val intro: TextView = itemView.findViewById(R.id.tv_rv_item_home_today_artist_main_introduction) as TextView
        val backimg: ImageView = itemView.findViewById(R.id.iv_rv_item_home_today_artist_main_product) as ImageView
    }

    inner class HolderArtist(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.txt_rv_item_home_today_artist_title) as TextView
        val img: ImageView = itemView.findViewById(R.id.img_rv_item_home_today_artist_product) as ImageView
    }
}