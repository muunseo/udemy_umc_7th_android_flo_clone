package com.example.flo

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.flo.databinding.ActivitySongBinding

class SongActivity:AppCompatActivity () {
    lateinit var viewBinding : ActivitySongBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySongBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        //songDownIb버튼을 눌렀을 때 액티비티 종료
        viewBinding.songDownIb.setOnClickListener{
            finish()
        }
        viewBinding.playbtn.setOnClickListener{
            setPlayerStatus(false)
        }
        viewBinding.pausebtn.setOnClickListener{
            setPlayerStatus(true)
        }
    }

    fun  setPlayerStatus(isPlaying : Boolean){
        if(isPlaying){
            viewBinding.playbtn.visibility= View.VISIBLE
            viewBinding.pausebtn.visibility= View.GONE
        }
        else{
            viewBinding.playbtn.visibility= View.GONE
            viewBinding.pausebtn.visibility= View.VISIBLE

        }
    }


}