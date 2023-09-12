package com.example.mad_practical_7_20012011082

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Video
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initVideoPlayer()
        val switchbtn1=findViewById<FloatingActionButton>(R.id.floatingactionbutton1)

        switchbtn1.setOnClickListener(){
            val intent=Intent(this@MainActivity,youtube::class.java)
            startActivity(intent)

        }
    }

    fun initVideoPlayer() {
        val myVideoView = findViewById<VideoView>(R.id.videoview1)
        val mediaController = MediaController(this)
        val uriString = "android.resource://" + packageName + "/" + R.raw.thestoryoflight
        val uri = Uri.parse(uriString)

        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()
    }

}