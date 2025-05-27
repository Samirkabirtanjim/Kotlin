package LearningDay10Array

fun main() {

    val fruits = arrayOf("Apple", "Banana", "Cherry")
    fruits[0] = "Mango" // ✅ You can change value
    println(fruits[0])  // Output: Mango

    val fruit1 = listOf("Apple", "Banana", "Cherry")
    // fruits[0] = "Mango" // ❌ Not allowed!
    println(fruit1[0])     // Output: Apple

    val fruit2 = mutableListOf("Apple", "Banana")
    fruit2[0] = "Mango"  // ✅ Can change
    fruit2.add("Orange") // ✅ Can add
    println(fruit2)      // Output: [Mango, Banana, Orange]

}