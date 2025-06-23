package LearningDay11OOP

import javax.lang.model.element.ModuleElement

class BankAccount(private var balance: Double){

    fun deposit(amount: Double){
        if (amount > 0){
            balance = balance + amount
        }
        println("Deposit Balance $balance")
    }
    fun withdraw(amount: Double){
        if (amount > 0 && amount <= balance){
            balance = balance - amount
        }
        println("Withdraw amount $balance")
    }
    fun checkBalance(): Double{
        return balance
    }
}

fun main(){
    val person1 = BankAccount(1000.0)
    person1.deposit(1000.00)
    person1.withdraw(1000.00)
    val personBalance = person1.checkBalance()
    println("Current Balance: $personBalance")
}