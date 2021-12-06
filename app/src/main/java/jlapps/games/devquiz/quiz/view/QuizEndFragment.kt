package jlapps.games.devquiz.quiz.view

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import com.google.android.material.card.MaterialCardView
import jlapps.games.devquiz.R
import jlapps.games.devquiz.util.AnimateUtil.fadeIn
import jlapps.games.devquiz.util.FragmentUtil
import jlapps.games.devquiz.quiz.data.QuizState
import jlapps.games.devquiz.quiz.data.QuizState.mode

class QuizEndFragment : Fragment(R.layout.frag_quiz_end){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.frag_quiz_end, container, false)

        checkHighScore()
        animateViews(v)
        setClickListeners(v)
        return v
    }
    private fun checkHighScore(){
        val sharedPreferences: SharedPreferences = requireContext().getSharedPreferences("scores", Context.MODE_PRIVATE)

        val highScore:Int

        if(mode == QuizState.GAME_MODE.SURVIVAL){
            highScore = sharedPreferences.getInt("survival",0)
            if(QuizState.score > highScore) {
                requireActivity().title = "Survival high score!!(${QuizState.score})"
                sharedPreferences.edit().putInt("survival",QuizState.score).apply()
            }else
                requireActivity().title = "Survival high score: $highScore"
        }
        else {
            highScore  = sharedPreferences.getInt("twentyQs", 0)

            if(QuizState.score > highScore) {
                requireActivity().title = "Twenty Questions high score!!(${QuizState.score})"
                sharedPreferences.edit().putInt("twentyQs",QuizState.score).apply()
            }else
                requireActivity().title = "Twenty Questions high score: $highScore"
        }
    }

    private fun animateViews(v:View){
        val header = v.findViewById<AppCompatImageView>(R.id.iv_game_over)
        val score = v.findViewById<MaterialCardView>(R.id.cv_game_score)
        score.visibility = INVISIBLE
        val btnBar = v.findViewById<LinearLayoutCompat>(R.id.ll_game_status_btn)
        btnBar.visibility = INVISIBLE
        val menu = v.findViewById<MaterialButton>(R.id.btn_main_menu)
        menu.visibility = INVISIBLE

        val slideDown = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_down)
        val slideUp = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_up)
        slideUp.setAnimationListener(object: Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {
                btnBar.visibility = VISIBLE
            }

            override fun onAnimationEnd(p0: Animation?) {
            }

            override fun onAnimationRepeat(p0: Animation?) {
            }

        })
        header.startAnimation(slideDown)

        Handler(Looper.getMainLooper())
            .postDelayed({
             btnBar.startAnimation(slideUp)
            }, 500)

        Handler(Looper.getMainLooper())
            .postDelayed({
                fadeIn(score)
                fadeIn(menu)
            }, 750)
    }

    private fun setClickListeners(v:View){

        val score = v.findViewById<TextView>(R.id.tv_game_score)
        score.text = getString(R.string.quiz_score, QuizState.score)

        val restart = v.findViewById<MaterialButton>(R.id.btn_quiz_restart)
        restart.setOnClickListener {
            FragmentUtil.showFragment(
                requireActivity().supportFragmentManager,
                FragmentUtil.Fragments.SHOW_QUIZ_INITIAL,
                bundleOf(Pair("fade", true)))

        }

        val menu = v.findViewById<MaterialButton>(R.id.btn_main_menu)
        menu.setOnClickListener {
            FragmentUtil.showFragment(
                requireActivity().supportFragmentManager,
                FragmentUtil.Fragments.SHOW_MENU)

        }

        val end = v.findViewById<TextView>(R.id.btn_quiz_end)
        end.setOnClickListener{requireActivity().finish()}

    }


}