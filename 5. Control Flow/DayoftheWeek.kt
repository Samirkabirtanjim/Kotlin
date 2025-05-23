package LearningDay7

//Write a function that takes a number (1 to 7) and prints the name of the day (e.g., 1 = Sunday, 2 = Monday...).
fun days(day: Int){
    when(day){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Wrong Input")
    }
}
fun main(){
    days(1)
    days(2)
    days(3)
    days(4)
    days(5)
    days(6)
    days(7)
    days(10)
}