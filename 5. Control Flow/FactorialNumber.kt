package LearningDay8

//Find the factorial of a number using while loop.
fun factorial(number: Int){

    var i = 1
    var fact = 1

    while (i <= number){
        fact = fact * i
        i++
    }
    println("$number factorial: $fact")
}

fun main(){
    factorial(5)
}
