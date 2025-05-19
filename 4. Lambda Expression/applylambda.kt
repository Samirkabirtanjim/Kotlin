//Make a function that takes a lambda and a number, then applies the lambda to that num
fun applyLambda(num1: Int, rule: (Int) -> Int): Int{
    return rule(num1)
}

fun main() {
    val show = applyLambda(5){it * 3}
    println("Results: $show")

}
