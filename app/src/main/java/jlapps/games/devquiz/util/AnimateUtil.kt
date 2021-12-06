package jlapps.games.devquiz.util

import android.view.View
import android.widget.Button
import android.animation.ValueAnimator

import android.animation.ArgbEvaluator
import android.app.Activity
import androidx.core.animation.doOnEnd


object AnimateUtil {
    fun fadeIn(v: View){
        v.apply{
            alpha = 0f
            visibility = View.VISIBLE

            animate()
                .alpha(1f)
                .setDuration(600)
                .setListener(null)
        }
    }
    fun blink(btn: Button, originalColor:Int, blinkColor: Int,blinks:Int = 0,activity: Activity,onEnd:() -> Unit){
        val colorAnimation1 = ValueAnimator.ofObject(ArgbEvaluator(), originalColor, blinkColor)
        val colorAnimation2 = ValueAnimator.ofObject(ArgbEvaluator(), blinkColor, originalColor)
        colorAnimation1.duration = 200
        colorAnimation2.duration = 200// milliseconds
        var blink = 0
        colorAnimation1.addUpdateListener { animator ->
            btn.setBackgroundColor(animator.animatedValue as Int)
        }
        colorAnimation1.doOnEnd {
            if(blink < blinks){
                colorAnimation2.start()
                blink++
            }else
                onEnd()
        }
        colorAnimation2.addUpdateListener { animator ->
            btn.setBackgroundColor(animator.animatedValue as Int)
        }
        colorAnimation2.doOnEnd {
            if(blink < blinks){
                colorAnimation1.start()
                blink++
            }else
                onEnd()
        }


        activity.runOnUiThread {
            colorAnimation1.start()
        }





    }
}