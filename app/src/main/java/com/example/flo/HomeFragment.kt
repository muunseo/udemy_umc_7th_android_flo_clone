package com.example.flo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.flo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.imgAlbumExp2.setOnClickListener{
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm,AlbumFragment()).commitAllowingStateLoss()
            //Activity 전환은 StartActivity를 이용했지만 Fragment는 (context as 해당프래그먼트가 들어가는 액티비티)로 전환함
            //replace( )의 인자값은 메인 프레임레이아웃을 해당 프래그먼트에서 바꿀 프래그먼트입력
            //mainActivity에서 볼 수 있는 것처럼 bottomnavigationview에서도 많이 사용함
        }

        return binding.root
    }
}