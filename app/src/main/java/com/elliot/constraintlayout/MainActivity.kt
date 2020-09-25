package com.elliot.constraintlayout

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mercurio=findViewById<ImageView>(R.id.Mercurio)
        val venus=findViewById<ImageView>(R.id.Venus)
        val tierra=findViewById<ImageView>(R.id.Tierra)
        val mars=findViewById<ImageView>(R.id.Marte)
        val jupiter=findViewById<ImageView>(R.id.Jupiter)
        val saturno=findViewById<ImageView>(R.id.Saturno)
        val urano=findViewById<ImageView>(R.id.Urano)
        val neptuno=findViewById<ImageView>(R.id.Neptuno)
        val ani=AnimatorSet()

        //Animacion de Mercurio(Da vuelta al sol cada 88 dias)
        val animatorMercurio = ValueAnimator.ofInt(0, 359)
        animatorMercurio.addUpdateListener { value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = mercurio.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            mercurio.layoutParams = layoutParams
        }
        animatorMercurio.repeatMode = ValueAnimator.RESTART
        animatorMercurio.repeatCount = ValueAnimator.INFINITE
        animatorMercurio.interpolator = LinearInterpolator()
        animatorMercurio.duration = 1500
        //Animacion de Venus(Da vuelta al sol cada 224 dias)
        val animatorVenus = ValueAnimator.ofInt(0, 359)
        animatorVenus.addUpdateListener { value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = venus.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            venus.layoutParams = layoutParams
        }
        animatorVenus.repeatMode = ValueAnimator.RESTART
        animatorVenus.repeatCount = ValueAnimator.INFINITE
        animatorVenus.interpolator = LinearInterpolator()
        animatorVenus.duration = 2500
        //Animacion de Tierra(Da vuelta al sol cada 365 dias)
        val animatorTierra = ValueAnimator.ofInt(0, 359)
        animatorTierra.addUpdateListener { value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = tierra.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            tierra.layoutParams = layoutParams
        }
        animatorTierra.repeatMode = ValueAnimator.RESTART
        animatorTierra.repeatCount = ValueAnimator.INFINITE
        animatorTierra.interpolator = LinearInterpolator()
        animatorTierra.duration = 3000
        //Animacion de Marte(Da vuelta al sol cada 687 dias)
        val animatorMarte = ValueAnimator.ofInt(0, 359)
        animatorMarte.addUpdateListener { value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = mars.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            mars.layoutParams = layoutParams
        }
        animatorMarte.repeatMode = ValueAnimator.RESTART
        animatorMarte.repeatCount = ValueAnimator.INFINITE
        animatorMarte.interpolator = LinearInterpolator()
        animatorMarte.duration = 4000
        //Animacion de Jupiter(Da vuelta al sol cada 12 años)
        val animatorJupiter = ValueAnimator.ofInt(0, 359)
        animatorJupiter.addUpdateListener { value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = jupiter.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            jupiter.layoutParams = layoutParams
        }
        animatorJupiter.repeatMode = ValueAnimator.RESTART
        animatorJupiter.repeatCount = ValueAnimator.INFINITE
        animatorJupiter.interpolator = LinearInterpolator()
        animatorJupiter.duration = 5000
        //Animacion de Saturno(Da vuelta al sol cada 29 años)
        val animatorSaturno = ValueAnimator.ofInt(0, 359)
        animatorSaturno.addUpdateListener { value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = saturno.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            saturno.layoutParams = layoutParams
        }
        animatorSaturno.repeatMode = ValueAnimator.RESTART
        animatorSaturno.repeatCount = ValueAnimator.INFINITE
        animatorSaturno.interpolator = LinearInterpolator()
        animatorSaturno.duration = 6000
        //Animacion de Urano(Da vuelta al sol cada 84 años)
        val animatorUrano = ValueAnimator.ofInt(0, 359)
        animatorUrano.addUpdateListener { value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = urano.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            urano.layoutParams = layoutParams
        }
        animatorUrano.repeatMode = ValueAnimator.RESTART
        animatorUrano.repeatCount = ValueAnimator.INFINITE
        animatorUrano.interpolator = LinearInterpolator()
        animatorUrano.duration = 7000
        //Animacion de Neptuno(Da vuelta al sol cada 164 años)
        val animatorNeptuno = ValueAnimator.ofInt(0, 359)
        animatorNeptuno.addUpdateListener { value ->
            val animatedValue = value.animatedValue as Int
            val layoutParams = neptuno.layoutParams as ConstraintLayout.LayoutParams
            layoutParams.circleAngle = animatedValue.toFloat()
            neptuno.layoutParams = layoutParams
        }
        animatorNeptuno.repeatMode = ValueAnimator.RESTART
        animatorNeptuno.repeatCount = ValueAnimator.INFINITE
        animatorNeptuno.interpolator = LinearInterpolator()
        animatorNeptuno.duration = 8000

        ani.playTogether(animatorMercurio,animatorVenus,animatorTierra,animatorMarte,animatorJupiter,animatorSaturno,animatorUrano,animatorNeptuno)
        ani.start()
    }
}