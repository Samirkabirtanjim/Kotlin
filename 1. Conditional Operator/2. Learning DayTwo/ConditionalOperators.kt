package com.shajim.kotlin_programming

fun main(args: Array<String>) {

    var number1 = 10
    var number2 = 20
    var number3 = 30

    println("--------------Conditional OR--------------")
    if ((number1 < number2) || (number1 < number3)){
        println("Number1: $number1 is less than number2: $number2 or number3: $$number3")
    }
    else{
        println("Number1: $number1 is not less than number2: $number2 or number3: $$number3")
    }

    println("--------------Conditional AND--------------")
    if ((number1 < number2) && (number1 < number3)){
        println("Number1: $number1 is less than number2: $number2 and number3: $$number3")
    }
    else{
        println("Number1: $number1 is not less than number2: $number2 and number3: $$number3")
    }
}