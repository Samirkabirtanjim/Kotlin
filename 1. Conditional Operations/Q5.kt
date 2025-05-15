//Check if a user entered an empty name (blank string).
//If yes, print "Name required", else print "Welcome, [name]".

fun main(){

    val name: String = "Tanjim"

    if (name == ""){
        println("Name required")
    }else{
        println("Welcome $name")
    }
}
