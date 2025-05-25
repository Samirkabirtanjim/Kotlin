package LearningDay8

fun main(){

    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    var index = 0

    while (index < numbers.size){
        val number = numbers[index]
        if (number % 2 == 0){
            println("Even: $number")
        }
        index++
    }
}