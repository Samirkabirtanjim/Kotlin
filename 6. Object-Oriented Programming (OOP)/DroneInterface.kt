package LearningDay11OOP

interface Flyable{
    fun fly()
}
interface SoundMaker{
    fun makeSound(){
        println("Making some sound")
    }
}

class Drone(): Flyable, SoundMaker{

    override fun fly() {
        println("Drone is flying high")
    }
    override fun makeSound() {
        super.makeSound()
    }
}

fun main(){

    val check1 = Drone()
    check1.fly()
    check1.makeSound()
}