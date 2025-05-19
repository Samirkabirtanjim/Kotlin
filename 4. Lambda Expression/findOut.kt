//Create a lambda that counts the number of vowels in a string.
fun findOut() {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U') // Char list
    val check: (String) -> Int = { text ->
        text.count { it in vowels }
    }
    val word = "Samir"
    val result = check(word)
    println("Vowels in '$word': $result")
}
fun main() {
    findOut()
}
