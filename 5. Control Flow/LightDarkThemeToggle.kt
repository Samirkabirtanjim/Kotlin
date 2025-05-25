package LearningDay9

//🔹 3. Light/Dark Theme Toggle (when)
fun toggle(theme: String){
    when(theme){
        "Light" -> println("Light Mode Enabled!")
        "Dark" -> println("Dark Mode Enabled!")
        else -> println("Unknown Mode")
    }
}

fun main(){
    toggle("Light")
    toggle("Dark")
    toggle("Blue")
}