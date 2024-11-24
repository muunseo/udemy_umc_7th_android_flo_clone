package com.example.flo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.flo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    private var albumDatas : ArrayList<Album>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

      //  binding.imgAlbumExp2.setOnClickListener{
       //     (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm,AlbumFragment()).commitAllowingStateLoss()
            //Activity 전환은 StartActivity를 이용했지만 Fragment는 (context as 해당프래그먼트가 들어가는 액티비티)로 전환함
            //replace( )의 인자값은 메인 프레임레이아웃을 해당 프래그먼트에서 바꿀 프래그먼트입력
            //mainActivity에서 볼 수 있는 것처럼 bottomnavigationview에서도 많이 사용함
    //    }

        albumDatas.apply{
            add(Album("Butter","방탄소년단", R.drawable.img_album_exp))
        }

        val bannerAdapter = BannerAdapter(this)
        bannerAdapter.addFragment(BannerFragment(R.drawable.img_home_viewpager_exp))
        bannerAdapter.addFragment(BannerFragment(R.drawable.img_home_viewpager_exp2))
        binding.homeBannerVp.adapter=bannerAdapter
        binding.homeBannerVp.orientation= ViewPager2.ORIENTATION_HORIZONTAL

        return binding.root
    }
}