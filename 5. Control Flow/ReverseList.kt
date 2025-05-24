package LearningDay8

//Reverse a list using for loop
fun main(){
    val number = listOf(1,2,3,4,5,6,7,8)
    for (num in number.reversed()){
        print("$num ")
    }
}