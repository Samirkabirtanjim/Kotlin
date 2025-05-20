package LearningDay5


fun doOperation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun main() {
    //Multiply two numbers using doOperation
    val multiply = doOperation(5, 2) { x, y -> x * y }
    println("Multiply two numbers: $multiply")
    //Divide two numbers using doOperation
    val divide = doOperation(10, 2) { x, y -> x / y }
    println("Divide two numbers $divide")
    //Return the maximum of two numbers using doOperation
    val maximum = doOperation(10, 20) { x, y -> if (x > y) x else y }
    println("The maximum of two numbers: $maximum")
    //Raise one number to the power of the other using doOperation
    val power = doOperation(2, 3) { x, y ->  Math.pow(x.toDouble(), y.toDouble()).toInt()  }
    println("Power $power")
    //Find average of two numbers using doOperation
    val average = doOperation(10,20) {x, y -> (x + y) / 2}
    println("Average of two numbers: $average")
}


