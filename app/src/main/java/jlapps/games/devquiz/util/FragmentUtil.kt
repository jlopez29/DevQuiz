package jlapps.games.devquiz.util

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import jlapps.games.devquiz.R
import jlapps.games.devquiz.menu.view.MenuFragment
import jlapps.games.devquiz.menu.view.TopicSelectionFragment
import jlapps.games.devquiz.quiz.view.QuestionFragment
import jlapps.games.devquiz.quiz.view.QuizEndFragment

object FragmentUtil {
    fun showFragment(fragManager:FragmentManager,v:Fragments,bundle:Bundle = bundleOf()){
        when(v){
            Fragments.SHOW_QUIZ_INITIAL -> {
                val fragment = QuestionFragment()
                fragment.arguments = bundle
                Handler(Looper.getMainLooper())
                    .postDelayed({
                        fragManager.beginTransaction()
                            .replace(R.id.container_main,fragment).commit()
                    }, 500)
            }
            Fragments.SHOW_QUIZ_NEXT_QUESTION -> {
                fragManager.beginTransaction()
                    .setCustomAnimations(
                        R.anim.slide_in,
                        R.anim.slide_out,
                        R.anim.slide_in,
                        R.anim.slide_out
                    )
                    .replace(R.id.container_main, QuestionFragment()).commit()
            }
            Fragments.SHOW_QUIZ_END -> {
                fragManager.beginTransaction()
                    .replace(R.id.container_main, QuizEndFragment()).commit()
            }
            Fragments.SHOW_MENU -> {
                fragManager.beginTransaction()
                    .replace(R.id.container_main, MenuFragment()).commit()
            }
            Fragments.SHOW_TOPIC_SELECTION -> {
                fragManager.beginTransaction()
                    .replace(R.id.container_main, TopicSelectionFragment()).commit()
            }
        }
    }

    enum class Fragments{
        SHOW_MENU,
        SHOW_TOPIC_SELECTION,
        SHOW_QUIZ_INITIAL,
        SHOW_QUIZ_NEXT_QUESTION,
        SHOW_QUIZ_END
    }
}