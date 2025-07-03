package com.shajim.kotlin_programming

fun main(args: Array<String>) {

    println("-------------ArrayOf-------------")
    println("--------Only Update & Read-------")
    var age = arrayOf(1,2,3,4,5,7,8)
    println(age[2])
    age.reverse()
    println(age[2])
    age[2] = 0
    println(age[2])

    println("-------------ListOf-------------")
    println("----------Only Read-------------")

    var id = listOf(1,2,3,4,5,7,8)
    println(id[2])
    var idCheck = id.reversed()
    println(idCheck[2])

    println("----------MutableListOf---------")
    println("---Add ,Remove, Read & Update---")

    var mutable = mutableListOf(1,2,3,4,5,7,8)
    mutable.add(10)
    println(mutable[7])
    mutable.remove(1)
    println(mutable[1])
    mutable[2] = 0
    println(mutable[2])

}