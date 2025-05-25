package LearningDay9

// 2. Login Validation
//// Simulate a login check:
//val correctUsername = "admin"
//val correctPassword = "1234"
//// Ask user input and check if both match
fun loginValidation(correctUsername: String,correctPassword: Int){
    if (correctUsername == "admin" && correctPassword == 1234){
        println("Both Match")
    }else{
        println("Wrong Username and Password")
    }
}
fun main(){
    loginValidation("samir", 1234)
    loginValidation("admin", 1234)

}