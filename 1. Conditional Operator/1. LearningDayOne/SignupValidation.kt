//A user is signing up. Check 3 things:
//Username is not blank.
//Email contains "@".
//Password is at least 6 characters.
//If all are valid, print "Signup successful"
//Else print "Signup failed".

fun main(){

    val username: String = "Tanjim"
    val email: String = "tanjim@github.com"
    val password: Int = 2987654

    if (username.isNotBlank() && email.contains("@") && password >= 6){
        println("Signup successful")
    }else{
        println("Signup failed")
    }
}