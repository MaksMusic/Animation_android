package com.music.animation_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.music.animation_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),Animation.AnimationListener {
    lateinit var binding:ActivityMainBinding
    lateinit var inAnimation: Animation
    lateinit var outAnimation: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        inAnimation = AnimationUtils.loadAnimation(this,R.anim.alpha_in)
        outAnimation = AnimationUtils.loadAnimation(this,R.anim.alpha_out)
        inAnimation.setAnimationListener(this)
        outAnimation.setAnimationListener(this)
        startAnimation()


    }

    fun startAnimation(){
        Log.e("CITY:", "startAnimation")
        binding.btn.setOnClickListener(){
            binding.text.startAnimation(inAnimation)


        }
    }


    override fun onAnimationStart(p0: Animation?) {


    }

    override fun onAnimationEnd(p0: Animation?) {
        startAnimation()


    }

    override fun onAnimationRepeat(p0: Animation?) {

    }

}