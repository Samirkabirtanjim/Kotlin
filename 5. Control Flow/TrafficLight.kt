package LearningDay7

//Write a function that takes a color string ("red", "yellow", "green")
//and prints what to do ("Stop", "Wait", "Go").

fun traffic(color: String){
    when(color.lowercase()){
        "red" -> println("Stop")
        "yellow" -> println("Wait")
        "green" -> println("Go")
        else -> println("Wrong Color")
    }
}
fun main(){
    traffic("red")
    traffic("Red")
}