package LearningDay3

//🔸 4. Write a function that returns the greater of two numbers.

fun main(){

    fun greaterNum(num1: Int, num2: Int){

        if (num1 > num2){
            println("$num1 is greater than $num2")
        }else{
            println("$num2 is greater than $num1")
        }
    }
    greaterNum(105,50)
}