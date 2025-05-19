//Define a lambda that reverses a string.
fun reversesStr(){
    val revStr: (String) -> String = {a -> a.reversed()}
    println("You write: ${revStr("tanjim")} ")
}
fun main() {
    reversesStr()
}
