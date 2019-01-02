package com.artoo.sopt23.artoo_client_android.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.artoo.sopt23.artoo_client_android.Fragment.*


//Home Tab Adapter
class HomeArtistFragmentStatePagerAdapter(fm : FragmentManager, val fragmentCount : Int): FragmentStatePagerAdapter(fm){

    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return HomeArtist1Fragment()
            1 -> return HomeArtist2Fragment()
            2 -> return HomeArtist3Fragment()
            3 -> return HomeArtist4Fragment()
            4 -> return HomeArtist5Fragment()
            else -> return null
        }
    }
    override fun getCount(): Int = fragmentCount
}