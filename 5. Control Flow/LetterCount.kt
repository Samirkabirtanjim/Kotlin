package LearningDay7

//Count how many times a letter appears
fun main(){
    val word = "banana"
    val result = word.groupingBy { it }.eachCount()

    for ((letter, count) in result){
        println("Letter $letter' appears $count")
    }

}
