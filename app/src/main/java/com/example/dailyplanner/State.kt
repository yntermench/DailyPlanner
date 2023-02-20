package com.example.dailyplanner

data class State(val imageId:Int, val title:String)
class StateList{val list = arrayListOf(
    State(R.drawable.state1, "Спокойным"),
    State(R.drawable.state2, "Расслабленным"),
    State(R.drawable.state3, "Задумчивым"),
    State(R.drawable.state1, "Взволнованным"),)}
