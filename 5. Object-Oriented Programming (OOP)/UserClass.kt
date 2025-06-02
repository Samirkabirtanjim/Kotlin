package LearningDay11OOP

//Create a User class with an init block that
//prints a welcome message when an object is created.
class User(){
    init {
        println("Welcome! A new user has been created.")
    }
}
fun main(){
    val user1 = User()
    val user2 = User()
}