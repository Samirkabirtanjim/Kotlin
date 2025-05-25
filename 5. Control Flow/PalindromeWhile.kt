package LearningDay8

//Check if a number is a palindrome.
fun palindromeWhile(number: Int){
    var original = number
    var reverse = 0

    while (original != 0){
        val digit = original % 10
        reverse = reverse * 10 + digit
        original /= 10
    }

    if (number == reverse){
        println("Number are palindrome: $number")
    }else{
        println("Number are not palindrome: $number")
    }
}
fun main(){
    palindromeWhile(123)
    palindromeWhile(232)
}
