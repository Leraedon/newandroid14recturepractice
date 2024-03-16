package com.example.bankaccountprogram

fun main() {

    val denisesBankAccount = BankAccount("Denis Panjuta", 1338.20)

    denisesBankAccount.deposit(200.0)
    denisesBankAccount.withdraw(1200.00)
    denisesBankAccount.deposit(3000.00)
    denisesBankAccount.deposit(2000.00)
    denisesBankAccount.withdraw(3333.15)
    denisesBankAccount.displayTransactionHistory()

    val sarahsBankAccount = BankAccount("Sarah", 0.0)
    sarahsBankAccount.deposit(100.0)
    sarahsBankAccount.withdraw(10.0)
    sarahsBankAccount.deposit(300.0)

    println("${denisesBankAccount.accountHolder}'s " +
        "balance is ${denisesBankAccount.acctBalance()}")

    println("${sarahsBankAccount.acctBalance()}")
}