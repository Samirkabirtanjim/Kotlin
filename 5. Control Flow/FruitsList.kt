package LearningDay10Array

//Create a mutable list of 4 fruits. Add one fruit, remove one fruit, and change one fruit.

fun main(){
    var fruits = mutableListOf("Apple","Banana","Mango","Licchi")

    fruits.add("Grave")
    fruits.remove("Banana")
    println(fruits)
}