package LearningDay10Array

//Create a list of 3 colors using an immutable list. Try to add a new color to it.
fun main(){

    val color = listOf("Red","Blue","White")
    //color.add("Black")
    println(color)


    val colors = mutableListOf("Red","Blue","White")
    colors.add("Black")
    println(colors)
}