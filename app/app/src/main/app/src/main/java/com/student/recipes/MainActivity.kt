package com.student.recipes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this)
        textView.text = "Uygulama Başarıyla Çalışıyor! Tarifler yüklenmeye hazır."
        textView.textSize = 24f
        textView.setPadding(32, 32, 32, 32)
        
        setContentView(textView)
    }
}
