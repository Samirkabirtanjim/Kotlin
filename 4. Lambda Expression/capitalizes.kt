//Write a lambda that capitalizes each word in a list of strings.
fun capitalizes(){
    val names = listOf("samir","kabir","tanjim")
    val cap: (String) -> String = {names -> names.replaceFirstChar { it.uppercase() }}
    val capitalizeNames = names.map(cap)
    println(capitalizeNames)
}

fun main() {
    capitalizes()
}
