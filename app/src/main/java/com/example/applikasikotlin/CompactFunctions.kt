package com.example.applikasikotlin

fun isTooHot(temperature: Int) = temperature > 22
fun isDirty(dirty: Int) = dirty > 20
fun isSunday(day: String) = day == "Sunday"

fun main(){
    println(isTooHot(22))
    println(isDirty(20))
    println(isSunday("Sunday"))
}