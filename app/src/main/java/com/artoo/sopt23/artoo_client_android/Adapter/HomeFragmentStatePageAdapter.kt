package com.artoo.sopt23.artoo_client_android.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.artoo.sopt23.artoo_client_android.Data.TodayArtistData
import com.artoo.sopt23.artoo_client_android.Fragment.HomeThemeFragment
import com.artoo.sopt23.artoo_client_android.Fragment.HomeTodayFragment

//Home Tab Adapter
class HomeFragmentStatePagerAdapter(fm : FragmentManager, val fragmentCount : Int, val todayArtistList: ArrayList<TodayArtistData>): FragmentStatePagerAdapter(fm){

    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return HomeTodayFragment().apply {
                todayArtistData = todayArtistList
            }
            1 -> return HomeThemeFragment()
            else -> return null
        }
    }
    override fun getCount(): Int = fragmentCount

}