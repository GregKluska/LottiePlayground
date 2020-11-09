package com.gregkluska.lottieandroid

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animationView = findViewById<LottieAnimationView>(R.id.LottieView)
        animationView.setAnimation("drinks.json")
        animationView.repeatCount = Animation.INFINITE
        animationView.repeatMode = LottieDrawable.RESTART

        animationView.setOnClickListener {
            animationView.playAnimation()
        }
    }

}