package com.artoo.sopt23.artoo_client_android.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.artoo.sopt23.artoo_client_android.Adapter.HomeTodayRecyclerViewAdapter
import com.artoo.sopt23.artoo_client_android.Data.TodayArtistData
import com.artoo.sopt23.artoo_client_android.Data.TodayMainData

import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.fragment_home_artist1.*


class HomeArtist1Fragment : Fragment() {

    lateinit var homeTodayRecyclerViewAdapter: HomeTodayRecyclerViewAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home_artist1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
        val snapHelper: LinearSnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv_fragment_home_today_artist1_list)
    }

    private fun setRecyclerView() {
        var dataListMain: ArrayList<TodayMainData> = ArrayList()
        var dataListArtist : ArrayList<TodayArtistData> = ArrayList()
        dataListMain.add(TodayMainData("홍익대학교","최윤정작가","안녕하세열","http://img.vogue.co.kr/vogue/2015/04/style_579bbf94e23cc.jpg"))
        dataListArtist.add(TodayArtistData("열세글자입니다열세글자입니","http://img.vogue.co.kr/vogue/2015/04/style_579bbf94e23cc.jpg"))
        dataListArtist.add(TodayArtistData("열세글자입니다열세글자입니","http://img.vogue.co.kr/vogue/2015/04/style_579d193814eb1.jpg"))
        dataListArtist.add(TodayArtistData("열세글자입니다열세글자입니","https://i.pinimg.com/originals/2f/f2/e2/2ff2e2cf884a51223f26af6a93a546c3.jpg"))
        dataListArtist.add(TodayArtistData("열세글자입니다열세글자입니","https://usercontents-c.styleshare.kr/images/17504647/640x-"))
        dataListArtist.add(TodayArtistData("열세글자입니다열세글자입니","https://i.pinimg.com/originals/98/a5/14/98a5148af83aa0dcbb1ea4ded7392226.png"))

        /*
        else if(position==1){
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2014","https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2015","https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2016","https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2017","https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2018","https://t1.daumcdn.net/cfile/tistory/2376BA3B52AB79E703"))
        }
        else if(position==2){
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2014","http://blogimg.ohmynews.com/attach/1475/1386229890.jpg"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2015","http://www.safetimes.co.kr/news/photo/201704/34641_11284_3957.jpg"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2016","http://dimg.donga.com/wps/NEWS/IMAGE/2018/01/13/88148824.1.jpg"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2017","https://i.pinimg.com/originals/1a/6c/14/1a6c14efd0d4202a8cf2a0d9771cc186.jpg"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2018","http://cfile235.uf.daum.net/image/132F33405166787F01BB3B"))
        }
        else if(position==3){
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2014","http://www.geojenews.com/news/photo/201707/43970_30774_1656.jpg"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2015","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2wrGNnc-79wrlWr_Qz6TjyTH_RhhMGBmMInpwyGCzMf-sw_3b"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2016","http://ph.idomin.com/news/photo/200703/213333_167865_1830.jpg"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2017","http://www.poemlane.com/image-9/jun24.JPG"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2018","http://ph.idomin.com/news/photo/200610/168782-2-138588.jpg"))
        }
        else if(position==4){
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2014","http://img.vogue.co.kr/vogue/2015/04/style_579bbf94e23cc.jpg"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2015","http://img.vogue.co.kr/vogue/2015/04/style_579d193814eb1.jpg"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2016","https://i.pinimg.com/originals/2f/f2/e2/2ff2e2cf884a51223f26af6a93a546c3.jpg"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2017","https://usercontents-c.styleshare.kr/images/17504647/640x-"))
            dataList.add(TodayMainData("열세글자입니다열세글자입니","2018","https://i.pinimg.com/originals/98/a5/14/98a5148af83aa0dcbb1ea4ded7392226.png"))
        }
*/
        homeTodayRecyclerViewAdapter = HomeTodayRecyclerViewAdapter(activity!!,dataListMain,dataListArtist)
        rv_fragment_home_today_artist1_list.adapter = homeTodayRecyclerViewAdapter
        rv_fragment_home_today_artist1_list.layoutManager = LinearLayoutManager(activity,LinearLayout.HORIZONTAL,false)
    }
}