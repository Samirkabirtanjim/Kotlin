fun even() {
    val evens: (Int) -> Boolean = { a -> a % 2 == 0 }
    println("The number is even: ${evens(2)}")
}

fun main(){
  even()
}
