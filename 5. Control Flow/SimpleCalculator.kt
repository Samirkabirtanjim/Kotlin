package LearningDay7

//Write a function that takes two numbers and an operator (+, -, *, /)
// and performs the operation using when.
fun calculator(num1: Int, num2: Int, operator: Char) {
    when (operator) {
        '+' -> println("Sum of $num1 and $num2: ${num1 + num2}")
        '-' -> {
            if (num1 > num2) {
                println("Subtract of $num1 and $num2: ${num1 - num2}")
            } else {
                println("Subtract of $num2 and ${num1}: ${num2 - num1}")
            }
        }
        '*' -> println("Multiple of $num1 and $num2: ${num1 * num2}")
        '/' -> {
            if (num2 != 0) {
                println("Result: ${num1 / num2}")
            } else {
                println("Error: Cannot divide by zero")
            }
        }

        else -> println("Wrong Operator")
    }
}

fun main() {
    calculator(8, 6, '-')
}