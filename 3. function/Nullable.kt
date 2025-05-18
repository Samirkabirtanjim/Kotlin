package LearningDay3

//🔸 10. Create a function that accepts a nullable string and
//prints its length if not null, or prints “No input” otherwise.

fun nullAble(text : String?){

    if (text == null){
        println("No input")
    }else{
        println("$text length: ${text.length}")
    }
}

fun main(){
    nullAble("Tanjim")
    nullAble(null)
}