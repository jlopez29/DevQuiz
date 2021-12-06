package jlapps.games.devquiz.quiz.model

import com.google.gson.annotations.SerializedName

data class QuizQuestionRF(
    @SerializedName("value") val value: String,
    @SerializedName("answers") var answers: List<String>,
    @SerializedName("correctAnswer") var correctAnswer: Int,
    @SerializedName("topic") var topic: String
)