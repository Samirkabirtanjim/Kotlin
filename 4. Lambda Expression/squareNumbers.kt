//Use a lambda with map() to square each number in a list.
fun squareNumbers(){
    val numbers = listOf(2,3,4,5,6,7,8)
    val square: (Int) -> Int = {numbers -> numbers * numbers}
    val squares = numbers.map(square)
    println("The numbers: $squares")
}
fun main() {
    squareNumbers()
}
