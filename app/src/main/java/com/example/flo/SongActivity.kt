package com.example.flo

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flo.databinding.ActivitySongBinding

class SongActivity:AppCompatActivity () {
    lateinit var viewBinding : ActivitySongBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivitySongBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
    }


}