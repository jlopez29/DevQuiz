package jlapps.games.devquiz.menu.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import jlapps.games.devquiz.R
import jlapps.games.devquiz.quiz.data.QuizState
import jlapps.games.devquiz.util.FragmentUtil

import jlapps.games.devquiz.quiz.data.QuizState.mode


class MenuFragment : Fragment(R.layout.frag_menu_main){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.frag_menu_main, container, false)

        requireActivity().title = "Mode Selection"
        animateViews(v)
        setClickListeners(v)
        return v
    }
    private fun animateViews(v: View){
        val header = v.findViewById<AppCompatImageView>(R.id.iv_menu_header)
        header.visibility = View.INVISIBLE

        val slideDown = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_down)

        slideDown.setAnimationListener(object: Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {
                header.visibility = View.VISIBLE
            }

            override fun onAnimationEnd(p0: Animation?) {
            }

            override fun onAnimationRepeat(p0: Animation?) {
            }

        })

        requireActivity().runOnUiThread {
            Handler(Looper.getMainLooper())
                .postDelayed({
                    header.startAnimation(slideDown)
                }, 250)

        }

    }

    private fun setClickListeners(v: View){
        val twenty = v.findViewById<MaterialButton>(R.id.btn_twenty_questions)
        val survival = v.findViewById<MaterialButton>(R.id.btn_survival)

        twenty.setOnClickListener {
            mode = QuizState.GAME_MODE.TWENTY
            showTopicSelection()
        }
        survival.setOnClickListener {
            mode = QuizState.GAME_MODE.SURVIVAL
            showTopicSelection()
        }

    }

    private fun showTopicSelection(){
        FragmentUtil.showFragment(
            requireActivity().supportFragmentManager,
            FragmentUtil.Fragments.SHOW_TOPIC_SELECTION)
    }
}