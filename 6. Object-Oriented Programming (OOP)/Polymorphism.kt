package LearningDay11OOP

//Compile-Time Polymorphism

open class Person (val name: String){
    open fun greet(){
        println("Hello, I'm $name. How are you?")
    }
}

class Student(name: String): Person(name){
    override fun greet() {
        println("Hello, I'm $name. I'm a student and I love learning Kotlin!")
    }
}

class Teacher(name: String): Person(name){
    override fun greet() {
        println("Hello, I'm $name. I'm a teacher and I enjoy teaching Android development.")
    }
}

fun main(){

    val Student1 = Student("Samir")
    Student1.greet()
}

