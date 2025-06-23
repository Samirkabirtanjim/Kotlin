package LearningDay11OOP

interface Animals{
    fun sound()
}
interface Swimming{
    fun swim()
}

class Cat: Animals, Swimming {
    override fun sound() {
        println("Cat is very nice animal.")
    }
    override fun swim(){
        println("Cat can swim")
    }
}

fun main(){
    val animal1 = Cat()
    animal1.sound()
    animal1.swim()
}