package LearningDay3

//  5. Build a function that accepts a temperature in Celsius and returns its Fahrenheit equivalent.

fun main(){

    fun ctf(temp: Int): Int{

        val Fah = (temp*9/5)+32
        println("$temp Celsius in Fahrenheit $Fah")
        return Fah
    }
    ctf(0)
    ctf(32)
}