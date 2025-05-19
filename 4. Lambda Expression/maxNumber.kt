//Write a lambda to find the maximum of two numbers.
fun maxNumber(){
    val max : (Int, Int) -> Int = {num1, num2 ->
        if (num1 > num2) num1 else num2}
}

fun main() {
    val maxNum = max(5,10)
    println("the maximum from two numbers: $maxNum")

}
