fun main() {
    var email: String? = "samir@example.com"

    // 1. Print the length if not null using safe call
    println(email?.length)

    // 2. Set email to null and use Elvis operator to print 0 if null
    email = null
    println(email?.length ?: 0)

    // 3. Use let to print the email in uppercase if it's not null
    email?.let {
        println(it.uppercase())
    }
}
