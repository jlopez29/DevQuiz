package jlapps.games.devquiz.menu.api

import jlapps.games.devquiz.menu.data.Topic
import jlapps.games.devquiz.quiz.model.QuizQuestionRF
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface MenuTopicService {
    @GET("topics")
    fun getTopics(): Call<ArrayList<Topic>>

    @GET("topics/{topic}")
    fun getQuestions(@Path("topic") topic:String): Call<ArrayList<QuizQuestionRF>>
}