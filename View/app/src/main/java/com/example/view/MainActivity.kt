package com.example.view

import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        // 이름 문자열 출력 TextView 생성
//        val name = TextView(this).apply {
//            typeface = Typeface.DEFAULT_BOLD
//            text = "Lake Louise"
//        }
//        // 이미지 출력 ImageView 생성
//        val image = ImageView(this).also {
//            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.lake_1))
//        }
//        // 주소 문자열 출력 TextView 생성
//        val address = TextView(this).apply {
//            typeface = Typeface.DEFAULT_BOLD
//            text = "Lake Louise, AB, 캐나다"
//        }
//        val layout = LinearLayout(this).apply {
//            orientation = LinearLayout.VERTICAL
//            gravity = Gravity.CENTER
//            // LinearLayout 객체에 TextView, IImageView, TextView 객체 추가
//            addView(name, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
//            addView(image, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
//            addView(
//                address,
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT
//            )
//        }
//        // LinearLayout 객체를 화면에 출력
//        setContentView(layout)
        setContentView(R.layout.activity_main)
    }
}