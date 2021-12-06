package jlapps.games.devquiz.quiz.model

data class QuizQuestion(val value: String, var answers: List<QuizAnswer>, var topic:String)