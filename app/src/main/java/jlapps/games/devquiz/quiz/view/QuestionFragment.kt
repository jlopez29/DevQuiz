package jlapps.games.devquiz.quiz.view

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.INVISIBLE
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import jlapps.games.devquiz.R
import jlapps.games.devquiz.util.AnimateUtil.blink
import jlapps.games.devquiz.util.AnimateUtil.fadeIn
import jlapps.games.devquiz.util.FragmentUtil
import jlapps.games.devquiz.util.FragmentUtil.showFragment
import jlapps.games.devquiz.quiz.data.QuizState
import jlapps.games.devquiz.quiz.data.QuizState.GameStatus
import jlapps.games.devquiz.quiz.data.QuizState.gameOver
import jlapps.games.devquiz.quiz.data.QuizState.initQuiz
import jlapps.games.devquiz.quiz.data.QuizState.removeQuestion
import jlapps.games.devquiz.quiz.data.QuizState.score
import java.lang.ClassCastException


class QuestionFragment : Fragment(R.layout.frag_quiz_screen),GameStatus{
    private val answerIds = listOf(R.id.btn_answer_1,R.id.btn_answer_2,R.id.btn_answer_3,R.id.btn_answer_4)

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            QuizState.setGameStatusListener(this)
        } catch (e: ClassCastException) {
            throw ClassCastException("$context must implement setGameStatusListener")
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean("inQuestion",true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.frag_quiz_screen, container, false)
        val init = arguments?.containsKey("fade") == true
        if(init)
            initQuiz()

        setHeader(v)
        setQuestion(v)
        setAnswers(v)

        if(init)
            animateViews(v)
        return v
    }
    private fun setHeader(v:View){
        requireActivity().title = "Score: $score - (${QuizState.getQuestion().topic})"
        val headerText = v.findViewById<TextView>(R.id.tv_question_header)
        headerText.text = getString(R.string.quiz_question, QuizState.currQuestion, QuizState.totalQuestions)
    }
    private fun setQuestion(v:View){
        val questionText = v.findViewById<TextView>(R.id.tv_question_text)
        questionText.text = QuizState.getQuestion().value
    }
    private fun setAnswers(v:View){

        answerIds.forEachIndexed{i,element ->
            val answer = v.findViewById<Button>(element)
            if(i >= QuizState.getAnswers().size) {
                answer.visibility = GONE
                return@forEachIndexed
            }
            answer.text = QuizState.getAnswers()[i].value
            answer.setOnClickListener {

                answerIds.forEachIndexed { _, element ->
                    val btn = v.findViewById<Button>(element)
                    btn.setOnClickListener(null)
                    btn.isEnabled = false
                }
                animateAnswer(answer, QuizState.getAnswers()[i].correct)
            }
        }
    }

    private fun animateViews(v:View){
        val header = v.findViewById<ConstraintLayout>(R.id.layout_header)
        header.visibility = INVISIBLE
        val question = v.findViewById<ConstraintLayout>(R.id.layout_question)
        question.visibility = INVISIBLE
        val answers = v.findViewById<ConstraintLayout>(R.id.layout_answers)
        answers.visibility = INVISIBLE

        fadeIn(header)

        Handler(Looper.getMainLooper())
            .postDelayed({
                fadeIn(question)
            }, 500)

        Handler(Looper.getMainLooper())
            .postDelayed({
                fadeIn(answers)
            }, 750)
    }
    private fun animateAnswer(btn: Button, correct:Boolean){

        if(correct)
            blink(btn,
                resources.getColor(R.color.teal_800,null),
                resources.getColor(R.color.green_400,null),4,requireActivity()
            ) {
                score++
                removeQuestion()
                if(!gameOver)
                    showFragment(requireActivity().supportFragmentManager,FragmentUtil.Fragments.SHOW_QUIZ_NEXT_QUESTION)
            }
        else
            blink(btn,
                resources.getColor(R.color.teal_800,null),
                resources.getColor(R.color.red_400,null),4,requireActivity()){
                removeQuestion(false)
                if(!gameOver)
                    showFragment(requireActivity().supportFragmentManager,FragmentUtil.Fragments.SHOW_QUIZ_NEXT_QUESTION)
            }
    }

    override fun gameOver() {
        Log.e("QFrag","Game over")
        showFragment(requireActivity().supportFragmentManager,FragmentUtil.Fragments.SHOW_QUIZ_END)
    }

}