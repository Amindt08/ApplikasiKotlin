package com.example.applikasikotlin.example.myapp

interface FishAction {
    fun eat()
}
interface FishColor {
    val color: String
}
class Plecostomus: FishAction, FishColor {
    override val color = "gold"
    override fun eat() {
        println("eat algae")
    }
}
class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}


