package com.shajim.kotlin_programming

fun main(args: Array<String>) {

    println("-------------SetOf-------------")
    var Age = setOf(5,4,3,2,1,5)
    for (array in Age){
        println("Elements of set: $array")
    }
    val size = Age.size
    println("Size of set: $size")
    val lastEle = Age.last()
    println("Last Elements of set: $lastEle")

    println("__________ArrayLisToF__________")
    var age = arrayListOf<Int>(5,4,3,2,1,5)
    for (arrays in age){
        println("Elements of set: $arrays")
    }
    val sizes = age.size
    println("Size of set: $sizes")
    val lastElement = age.last()
    println("Last Elements of set: $lastElement")
}