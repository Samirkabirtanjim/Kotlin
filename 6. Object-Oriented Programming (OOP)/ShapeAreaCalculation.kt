package LearningDay11OOP

import kotlin.math.pow

//Create a Kotlin program for Shape Area Calculation using polymorphism.
//Create an abstract class Shape with an abstract function area().
//Create 2 classes: Rectangle and Circle that inherit from Shape.
//Override area() to return the area of the shape.

abstract class Shape(){
    abstract fun areas(): Double
}

class Rectangles(private val length : Double, private val width: Double): Shape() {
    override fun areas(): Double {
        return length * width
    }
}

class Circle(private val radius: Double): Shape(){
    override fun areas(): Double {
        return Math.PI * radius * radius
    }
}

fun main(){

    val rectangles = Rectangles(10.0, 5.0)
    println("Area of Rectangle: %.2f".format(rectangles.areas()))

    val circle = Circle(10.0)
    println("Area of Circle: %2f".format(circle.areas()))
}