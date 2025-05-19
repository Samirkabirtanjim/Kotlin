package LearningDay4

import kotlin.math.max

//Write a lambda that adds two numbers and returns the result.
fun adding() {
    val add: (Int, Int) -> Int = { a, b -> a + b }
    println("Sum of two number ${add(5, 10)}")
}
//Create a lambda that checks if a number is even.
fun even() {
    val evens: (Int) -> Boolean = { a -> a % 2 == 0 }
    println("The number is even: ${evens(2)}")
}
//Write a lambda that takes a string and returns its length.
fun strLength(){
    val words: (String) -> (Int) = { word -> word.length}
    println("The words length ${words("Hello, World!")}")
}
//Define a lambda that reverses a string.
fun reversesStr(){
    val revStr: (String) -> String = {a -> a.reversed()}
    println("You write: ${revStr("tanjim")} ")
}
//Create a lambda that filters out even numbers from a list.
fun filterEven(){
    val numb = listOf(1,2,3,4,5,6,7,8,9,10)
    val allEvens: (Int) -> Boolean = {numb -> numb % 2 == 0}
    val evenNumbers = numb.filter(allEvens)
    println("Even Numbers: $evenNumbers" )
}
//Write a lambda that capitalizes each word in a list of strings.
fun capitalizes(){
    val names = listOf("samir","kabir","tanjim")
    val cap: (String) -> String = {names -> names.replaceFirstChar { it.uppercase() }}
    val capitalizeNames = names.map(cap)
    println(capitalizeNames)
}
//Make a function that takes a lambda and a number, then applies the lambda to that num
fun applyLambda(num1: Int, rule: (Int) -> Int): Int{
    return rule(num1)
}
//Write a lambda to find the maximum of two numbers.
fun maxNumber(){
    val max : (Int, Int) -> Int = {num1, num2 ->
        if (num1 > num2) num1 else num2}
}
//Use a lambda with map() to square each number in a list.
fun squareNumbers(){
    val numbers = listOf(2,3,4,5,6,7,8)
    val square: (Int) -> Int = {numbers -> numbers * numbers}
    val squares = numbers.map(square)
    println("The numbers: $squares")
}
//Create a lambda that counts the number of vowels in a string.
fun findOut() {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U') // Char list
    val check: (String) -> Int = { text ->
        text.count { it in vowels }
    }
    val word = "Samir"
    val result = check(word)
    println("Vowels in '$word': $result")
}

fun main() {
    adding()
    even()
    strLength()
    reversesStr()
    filterEven()
    capitalizes()
    val show = applyLambda(5){it * 3}
    println("Results: $show")
    val maxNum = max(5,10)
    println("the maximum from two numbers: $maxNum")
    squareNumbers()
    findOut()
}
