package LearningDay11OOP

//Create a Rectangle class that has width and height, and
//a function area() that returns the area of the rectangle.

class Rectangle(var width: Double, var height: Double){
    fun area(): Double{
        return width * height
    }
}

fun main(){
    val area1 = Rectangle(10.00,20.00)
    println("The area of the rectangle: ${area1.area()}")
}