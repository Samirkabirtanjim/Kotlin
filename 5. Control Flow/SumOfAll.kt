package LearningDay7

// Sum of numbers from 1 to n
fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    var total = 0

    for (num in number) {
        total += num  // Add each number to total
    }
    println("Total sum: $total")
}
