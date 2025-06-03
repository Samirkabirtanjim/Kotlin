package LearningDay11OOP

class Car(){

    var name: String = "No name"

    fun sayHello(){
        println("Hello, my name is $name")
    }
}

fun main(){

    val person = Car()
    person.name = "Samir"
    person.sayHello()
}