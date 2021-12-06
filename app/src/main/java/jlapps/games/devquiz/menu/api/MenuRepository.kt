package jlapps.games.devquiz.menu.api

import android.util.Log
import androidx.lifecycle.MutableLiveData
import jlapps.games.devquiz.menu.data.Topic
import jlapps.games.devquiz.quiz.model.QuizQuestionRF
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


object MenuRepository{

    fun getTopics() : MutableLiveData<ArrayList<Topic>> {

        val mutableLiveData = MutableLiveData<ArrayList<Topic>>()

        ApiClient.apiService.getTopics().enqueue(object : Callback<ArrayList<Topic>> {
            override fun onFailure(call: Call<ArrayList<Topic>>, t: Throwable) {
                Log.e("error", "is " + t.localizedMessage)
            }

            override fun onResponse(
                call: Call<ArrayList<Topic>>,
                response: Response<ArrayList<Topic>>
            ) {
                Log.e("data", response.body().toString())
                val usersResponse = response.body()
                usersResponse?.let { mutableLiveData.value = it}
            }

        })

        return mutableLiveData
    }

    fun getQuestions(topic:String) : MutableLiveData<ArrayList<QuizQuestionRF>> {

        val mutableLiveData = MutableLiveData<ArrayList<QuizQuestionRF>>()

        ApiClient.apiService.getQuestions(topic).enqueue(object : Callback<ArrayList<QuizQuestionRF>> {
            override fun onFailure(call: Call<ArrayList<QuizQuestionRF>>, t: Throwable) {
                Log.e("error", "is " + t.localizedMessage)
            }

            override fun onResponse(
                call: Call<ArrayList<QuizQuestionRF>>,
                response: Response<ArrayList<QuizQuestionRF>>
            ) {
                Log.e("data", response.body().toString())
                val usersResponse = response.body()
                usersResponse?.let { mutableLiveData.value = it}
            }

        })

        return mutableLiveData
    }

}