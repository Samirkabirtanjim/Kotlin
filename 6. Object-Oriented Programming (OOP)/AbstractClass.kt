package LearningDay11OOP

import LearningDay6.welcome

//Can have both implemented and abstract methods

abstract class Welcome(){

    //state
    val run = true

    abstract fun greet()
    open fun bye(num1: Int, num2: Int): Int{
        val sum = num1 + num2
        return sum
    }
}

class One(): Welcome(){
    override fun greet() {
        println("Hello, Programmer")
    }

    override fun bye(num1: Int, num2: Int): Int {
        val sumAgain = super.bye(num1, num2)
        println("The sum of two numbers: $sumAgain")
        val mul = num1 * num2
        return mul
    }
}

fun main(){
    val welcome1= One()
    welcome1.greet()
    println("Is the code running? ${welcome1.run}")
    println("The mul of two numbers: ${welcome1.bye(10,11)}")
}