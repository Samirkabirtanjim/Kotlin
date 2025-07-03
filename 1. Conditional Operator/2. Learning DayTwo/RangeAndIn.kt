package com.shajim.kotlin_programming

fun main(args: Array<String>) {

    println("------------------Range------------------")
    var names = arrayOf("Nokia","Samsung","Iphone","Mi")
    if ("Oppo" in names){
        println("Oppo found!")
    }else{
        println("Oppo not found!")
    }

    if ("Nokia" in names){
        println("Nokia found!")
    }else{
        println("Nokia not found!")
    }

    println("-------------------In-------------------")
    var numbers = 8
    if(numbers in 1..10){
        println("$numbers is in range Number")
    }
}