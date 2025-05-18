package LearningDay3

//🔸 9. Build a function that simulates a basic calculator:
//takes two numbers and an operator (+, -, *, /) and returns the result.

fun calculate(num1: Int, num2: Int, operator: Char): Int {
    return when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> {
            if (num2 != 0) num1 / num2 else {
                println("Cannot divide by zero")
                0
            }
        }

        else -> {
            println("Invalid operator")
            0
        }
    }
}

fun main() {
    val result = calculate(10, 5, '+')
    println("Result: $result")
}
