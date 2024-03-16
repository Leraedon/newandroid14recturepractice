package com.example.kotlinbasics

fun main() {
    val fruitsList = mutableListOf<String>()
    fruitsList.add("gwail")
    fruitsList.add("gwail2")
    fruitsList.add("gwail3")
    fruitsList.remove("gwail2")
    println(fruitsList)

    println(fruitsList.contains("gwail3"))
}