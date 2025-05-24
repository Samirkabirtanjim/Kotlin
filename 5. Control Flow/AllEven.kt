package LearningDay7

fun main(){
    val number = listOf(1,2,4,5,6,8)
    for (num in number){
        if (num % 2 == 0){
            println("Number even: $num")
        }
    }
}