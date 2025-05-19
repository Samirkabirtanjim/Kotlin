//Create a lambda that filters out even numbers from a list.
fun filterEven(){
    val numb = listOf(1,2,3,4,5,6,7,8,9,10)
    val allEvens: (Int) -> Boolean = {numb -> numb % 2 == 0}
    val evenNumbers = numb.filter(allEvens)
    println("Even Numbers: $evenNumbers" )
}


fun main() {
    filterEven()
}
