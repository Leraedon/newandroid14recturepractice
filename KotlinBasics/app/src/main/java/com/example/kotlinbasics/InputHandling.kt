package com.example.kotlinbasics

fun main() {
    println("숫자를 입력해주세요:")
    val inputString = readln()
    val inputNumber = inputString.toInt()
    val multiplier = 5
    println("연산 결과는:${inputNumber*multiplier}")
}