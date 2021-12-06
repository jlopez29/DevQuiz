package jlapps.games.devquiz.menu

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import jlapps.games.devquiz.menu.api.MenuRepository
import jlapps.games.devquiz.menu.data.Topic
import jlapps.games.devquiz.quiz.model.QuizQuestionRF


class MenuViewModel : ViewModel() {

    private var listData = MutableLiveData<ArrayList<Topic>>()

    private var questionData = MutableLiveData<ArrayList<QuizQuestionRF>>()
    private val menuRepository : MenuRepository by lazy {
        MenuRepository
    }
    init{
        listData = menuRepository.getTopics()
    }

    fun getQuestions(topics:String){
        questionData = menuRepository.getQuestions(topics)
    }
    fun getQuestions() : MutableLiveData<ArrayList<QuizQuestionRF>>{
        return questionData
    }
    fun getData() : MutableLiveData<ArrayList<Topic>>{
        return listData
    }
}