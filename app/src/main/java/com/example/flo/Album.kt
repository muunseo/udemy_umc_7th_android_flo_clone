package com.example.flo

import java.util.ArrayList

data class Album(
    var title: String?="",
    var singer: String?="",
    var coverimg: Int?=null,
    var song:ArrayList<Song>?=null
)
