package com.example.kotlinbasics

data class CoffeeDetails(
    val sugarCount: Int,
    var name: String,
    var size: String,
    val creamAmount: Int
)
fun main(){
    var daisy = Dog("Daisy", "Dwarf poodle", 1)

    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")

    var myBook = Book()
    var customBook = Book("Mola", "Someone", "2023")
    println("${myBook.title}, ${myBook.author}, ${myBook.yearPublished}")
    println("${customBook.title}, ${customBook.author}, ${customBook.yearPublished}")

    val coffeeForDenis = CoffeeDetails(0, "denis", "xxl", 0)

    makeCoffee(coffeeForDenis)
}

fun add(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result
}

fun askCoffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()

    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    //makeCoffee(sugarCountInt, name)
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if(coffeeDetails.sugarCount == 1) {
        println("Coffee with 1 spoon of sugar for ${coffeeDetails.name}")
    } else if(coffeeDetails.sugarCount == 0) {
        println("Coffee with no sugar for ${coffeeDetails.name}")
    } else {
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name}")
    }
}