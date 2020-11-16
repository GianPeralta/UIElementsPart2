package com.example.uielementspart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class QueueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_queue)

        val songs = intent.getStringArrayListExtra( "Song")

        val adapter =
            songs?.let { ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, it) }
        val queued = findViewById<ListView>(R.id.queuedSongsList)
        queued.adapter = adapter
    }
}