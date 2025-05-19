fun strLength(){
    val words: (String) -> (Int) = { word -> word.length}
    println("The words length ${words("Hello, World!")}")
}
fun main() {
    strLength()
}
