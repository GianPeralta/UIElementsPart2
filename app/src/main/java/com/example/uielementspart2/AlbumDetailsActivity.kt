package com.example.uielementspart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import org.w3c.dom.Text

class AlbumDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_details)

        val bundle: Bundle = intent.extras!!
        val icon: Int = bundle.getInt("icons")
        val albumName = intent.getStringExtra("albums")
        val songs = intent.getStringArrayExtra( "songs")

        val adapter =
            songs?.let { ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, it) }
        val songList = findViewById<ListView>(R.id.songList)
        songList.adapter = adapter


        val albumCover = findViewById<ImageView>(R.id.imageView)
        albumCover.setImageResource(icon)
        findViewById<TextView>(R.id.albumName).text = albumName
    }
}