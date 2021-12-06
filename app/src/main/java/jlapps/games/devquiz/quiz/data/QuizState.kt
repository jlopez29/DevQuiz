package jlapps.games.devquiz.quiz.data

import android.util.Log
import jlapps.games.devquiz.menu.data.Topic
import jlapps.games.devquiz.quiz.view.QuestionFragment
import jlapps.games.devquiz.quiz.model.QuizAnswer
import jlapps.games.devquiz.quiz.model.QuizQuestion

object QuizState {
    var currQuestion = 1
    var score = 0
    var gameOver = false
    private val allQuestions = QuizDB.questions
    var totalQuestions = allQuestions.size
    var mode = GAME_MODE.SURVIVAL

    var questionTopics = listOf<Topic>()

    var availableQuestions = allQuestions.toMutableList()

    lateinit var gameStatusListener: GameStatus

    fun setGameStatusListener(fragment: QuestionFragment){
        gameStatusListener = fragment
    }

    fun filterQuestions(){

        val filteredList = arrayListOf<QuizQuestion>()

        questionTopics.forEach { topic -> filteredList.addAll(availableQuestions.filter { it.topic == topic.title }) }

        availableQuestions = filteredList
    }

    fun initQuiz(){
        Log.e("QuizState","Init")
        availableQuestions = allQuestions.toMutableList()
        filterQuestions()
        availableQuestions.shuffle()
        availableQuestions.forEach{
            it.answers = it.answers.shuffled()
        }
        if(mode == GAME_MODE.TWENTY)
            availableQuestions = availableQuestions.subList(0,20)

        totalQuestions = availableQuestions.size
        currQuestion = 1
        score = 0
        gameOver = false
    }

    fun removeQuestion(correct:Boolean = true){
        availableQuestions.removeAt(0)
        currQuestion++
        if(availableQuestions.isEmpty() || (!correct && mode == GAME_MODE.SURVIVAL)) {
            gameStatusListener.gameOver()
            gameOver = true
            return
        }

    }

    fun getQuestion(): QuizQuestion {
        return availableQuestions[0]
    }
    fun getAnswers(): List<QuizAnswer>{
        return availableQuestions[0].answers
    }

    interface GameStatus{
        fun gameOver()
    }

    enum class GAME_MODE{
        SURVIVAL,
        TWENTY
    }
}