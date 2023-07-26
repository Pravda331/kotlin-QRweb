package com.example.webqr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView = findViewById<WebView>(R.id.webView)
        webView.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }

        webView.loadUrl("http://hongikqr.kro.kr/home/")
    }
}