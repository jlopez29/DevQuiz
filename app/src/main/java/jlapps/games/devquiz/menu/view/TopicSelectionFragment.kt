package jlapps.games.devquiz.menu.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.CheckBox
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.cardview.widget.CardView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar
import jlapps.games.devquiz.R
import jlapps.games.devquiz.menu.data.AdapterTopicSelector
import jlapps.games.devquiz.menu.data.Topic
import jlapps.games.devquiz.quiz.data.QuizDB
import jlapps.games.devquiz.quiz.data.QuizState
import jlapps.games.devquiz.util.AnimateUtil
import jlapps.games.devquiz.util.FragmentUtil


class TopicSelectionFragment : Fragment(R.layout.frag_topic_selection){
    lateinit var topics:RecyclerView
    lateinit var checkAll:AppCompatCheckBox
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.frag_topic_selection, container, false)

        requireActivity().title = "Topic Selection"
        animateViews(v)
        setClickListeners(v)
        setData(v)
        return v
    }
    private fun animateViews(v: View){
        val header = v.findViewById<CardView>(R.id.cv_topic_header)
        header.visibility = View.INVISIBLE
        val topics = v.findViewById<RecyclerView>(R.id.rv_topic_selection)
        topics.visibility = View.INVISIBLE
        val btnStart = v.findViewById<MaterialButton>(R.id.btn_start_quiz)
        btnStart.visibility = View.INVISIBLE

        val slideUp = AnimationUtils.loadAnimation(requireContext(), R.anim.slide_up)
        slideUp.setAnimationListener(object: Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {
                btnStart.visibility = View.VISIBLE
            }

            override fun onAnimationEnd(p0: Animation?) {
            }

            override fun onAnimationRepeat(p0: Animation?) {
            }

        })

        requireActivity().runOnUiThread {

            AnimateUtil.fadeIn(header)

            Handler(Looper.getMainLooper())
                .postDelayed({
                    btnStart.startAnimation(slideUp)
                }, 500)

            Handler(Looper.getMainLooper())
                .postDelayed({
                    AnimateUtil.fadeIn(topics)
                }, 750)
        }
    }

    private fun setClickListeners(v: View){
        val start = v.findViewById<MaterialButton>(R.id.btn_start_quiz)
        val coordinatorLayout = v.findViewById<CoordinatorLayout>(R.id.cl)
        checkAll = v.findViewById<AppCompatCheckBox>(R.id.cb_topic_header)
        checkAll.setOnCheckedChangeListener { _, b ->
            (topics.adapter as AdapterTopicSelector).selectAll = b
            (topics.adapter as AdapterTopicSelector).notifyDataSetChanged()
        }
        start.setOnClickListener {
            val list = (topics.adapter as AdapterTopicSelector).getSelectedItems()
            if(list.isEmpty()) {
                Snackbar.make(coordinatorLayout,"You need to select at least one topic",Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }
//            list.forEach { Log.e("Adapter" , " q: " + it.title) }
//            var topicQuery = ""
//            for(i in 0 until list.size){
//                topicQuery += list[i].title
//                if(i != list.size-1)
//                    topicQuery += "&"
//            }

//            menuViewModel.getQuestions(topicQuery)
//
//            menuViewModel.getQuestions().observe(requireActivity(), {
//                // blank observe here
//                Log.e("DATA"," = " + it.toString())
//            })

            QuizState.questionTopics = list

            FragmentUtil.showFragment(
                requireActivity().supportFragmentManager,
                FragmentUtil.Fragments.SHOW_QUIZ_INITIAL,
                bundleOf(Pair("fade", true))
            )

        }

    }

    private fun setData(v:View){
        topics = v.findViewById(R.id.rv_topic_selection)
        topics.layoutManager = LinearLayoutManager(requireContext())
        topics.adapter = AdapterTopicSelector(QuizDB.questions.distinctBy { it.topic }.map { Topic(it.topic) } as ArrayList<Topic>)
        topics.itemAnimator = DefaultItemAnimator()
        checkAll.performClick()
//        menuViewModel.getData().observe(requireActivity(), {
//            // blank observe here
//            Log.e("DATA"," = " + it.toString())
//
//            topics.adapter = AdapterTopicSelector(menuViewModel.getData().value!!)
//        })
    }
}