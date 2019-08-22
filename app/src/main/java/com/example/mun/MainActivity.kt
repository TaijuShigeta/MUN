package com.example.mun

import android.media.MediaPlayer
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.VideoView
import android.net.Uri


class MainActivity : AppCompatActivity() {


    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, HomeFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                textMessage.setText(R.string.title_search)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                textMessage.setText(R.string.title_message)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_bookmark -> {
                textMessage.setText(R.string.title_bookmark)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        textMessage = findViewById(R.id.message)
//        videoView.setOnCompletionListener(MediaPlayer.OnCompletionListener{
//            @Override fun onCompletion(mp: MediaPlayer) {
//                videoView.seekTo(0)
//                videoView.start()
//            }
//        })

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
