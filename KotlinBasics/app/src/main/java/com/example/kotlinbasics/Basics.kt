package com.example.kotlinbasics

fun main(){
    val myChar = '\u00AE'

    println(myChar)

    var name = "Denis"
    name = "FrankBURGER"
    println(name.lowercase())

    var firstName = "Denis"
    var lastName = "Panjuta"
    println(firstName + " " + lastName)

    println("Please enter your age as a whole number")
    val enteredValue = readln()
    val age = enteredValue.toInt()
    if(age >= 18) {
        println("T")
    } else {
        println("F")
    }
}