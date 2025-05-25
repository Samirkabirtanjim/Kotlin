package LearningDay8

//Check if a number is a palindrome.
fun palindrome(number: Int){
    val first = number.toString()
    val reverse = first.reversed()

    if (first == reverse){
        println("$first and $reverse, number are palindrome")
    }else{
        println("$first and $reverse, number are not palindrome")
    }
}
fun main(){
    palindrome(123)
    palindrome(232)
}