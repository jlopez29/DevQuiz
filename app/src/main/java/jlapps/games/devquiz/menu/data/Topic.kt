package jlapps.games.devquiz.menu.data

import com.google.gson.annotations.SerializedName


data class Topic(@SerializedName("topic") var title: String = "",var selected:Boolean = false)