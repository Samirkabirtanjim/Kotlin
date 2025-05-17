package LearningDay3

//7. Create a function that takes a password and checks if it meets these rules:
//🔸 At least 6 characters
//🔸 Contains a number

fun main(){

    fun passCheck(pass: String){

        val hasMinLength = pass.length >= 6
        val hasNumber = pass.any {it.isDigit()}

        if (hasMinLength && hasNumber) {
            println("Password Created!")
        }else{
            println("Requirement does not match.")
        }
    }

    passCheck("SamirKabir08")
}
