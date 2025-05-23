package LearningDay7

//Write a function that takes a character grade (A, B, C, D, F) and
// prints a message (e.g., "Excellent", "Good", etc.).

fun grades(grade: Char){
    when(grade.uppercaseChar()){
        'A' -> println("Excellent")
        'B' -> println("Good")
        'C' -> println("Average")
        'D' -> println("Below Average")
        'F' -> println("Failed")
        else -> println("Wrong Input")
    }
}
fun main(){
    grades('a')
    grades('B')
}