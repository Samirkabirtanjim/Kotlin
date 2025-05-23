package LearningDay7

import java.time.YearMonth

//Write a function that takes a month name and prints how many days are in it.
fun yearOfDate(month: Int, year: Int){
    val yearMonth = YearMonth.of(year,month)
    val day = yearMonth.lengthOfMonth()
    println("Day in a month $day")
}
fun main(){
    yearOfDate(5,2025)
}