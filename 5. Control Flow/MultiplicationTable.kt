package LearningDay8

//Create multiplication table
fun multiplication(number: Int){

    for (num in 1..10){
        println("$number x $num = ${num*number}")
    }
}
fun main(){
    multiplication(5)
}