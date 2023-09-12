package com.example.mad_practical_7_20012011082

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class youtube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        initYoutubePlayer()
        val switchbtn2=findViewById<FloatingActionButton>(R.id.floatingactionbutton2)

        switchbtn2.setOnClickListener(){
            val intent= Intent(this@youtube,MainActivity::class.java)
            startActivity(intent)

        }
    }

    private val youtubeId = "https://www.youtube.com/watch?v=keg_2PlBnbY"

    fun initYoutubePlayer() {
        val youtubeWebView = findViewById<WebView>(R.id.webview1)
        val webSettings: WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true

        youtubeWebView.loadUrl("$youtubeId")
    }


}