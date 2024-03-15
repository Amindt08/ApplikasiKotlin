package com.example.applikasikotlin.example.myapp

interface FishAction {
    fun eat()
}
interface FishColor {
    val color: String
}
object GoldColor : FishColor {
    override val color = "gold"
}
class Plecostomus(fishColor: FishColor = GoldColor):  FishAction,
    FishColor by fishColor {
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
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}



