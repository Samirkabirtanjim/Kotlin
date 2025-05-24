package LearningDay8
//val numbers = listOf(10, 5, 20, 8, 15)
//// Use a for loop to find the largest number
fun main(){
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    var largest = numbers[0]

    for (num in numbers){
        if (num > largest){
            largest = num
        }
    }
    println("Largest Number: $largest")
}