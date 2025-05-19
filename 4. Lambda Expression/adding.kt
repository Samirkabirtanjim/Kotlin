
//Write a lambda that adds two numbers and returns the result.
fun adding() {
    val add: (Int, Int) -> Int = { a, b -> a + b }
    println("Sum of two number ${add(5, 10)}")
}

fun main() {
    adding()
}
