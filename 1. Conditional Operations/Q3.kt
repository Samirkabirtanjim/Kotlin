// Check if a username is "admin" and password is "1234". If both are correct, print "Login success", else print "Login failed".

fun main(){
    val username: String = "admin"
    val password: Int = 1234

    if(username == "admin" && password == 1234){
        println("Login success")
    }else{
        println("Login failed")
    }
}
