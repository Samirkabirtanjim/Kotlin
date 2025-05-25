package LearningDay8

//Count how many digits are in a number.
fun main(){

    var number = 123456
    var count = 0
    while (number != 0){
        number = number / 10
        count++
    }
    println("Total digit: $count")
}