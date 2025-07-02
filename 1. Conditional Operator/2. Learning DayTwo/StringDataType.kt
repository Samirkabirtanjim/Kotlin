package com.shajim.kotlin_programming

fun main(args: Array<String>) {

    var a : String = "Hello Kotlin"
    var b : String = "Language"
    println(a + " " + b)

    var c : Int = a.length
    println("Length of Hello Kotlin is $c")
    println("Uppercase of Language is " + b.uppercase())
    println("Lowercase of Language is " + b.lowercase())

    var d : String = a.plus(" ,Start Today!")
    println("Concatenates two strings: " +d)

    var name : String = "      Tanjim   "
    var e : String = name.trim()
    println("Without Triming: " +name)
    println("With Triming: " +e)

    var check = name.isEmpty()
    println("Is name empty? " +check)

    var equalOrNot = name.equals(b)
    println("Is name equal to b? " +equalOrNot)
}