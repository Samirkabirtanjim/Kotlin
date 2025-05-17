package LearningDay3

//🔸 3. Create a function that checks if a user can register based on their age (must be 18 or older).

fun main(){
    fun userRegis(age: Int): Int{
        if(age >= 18){
            println("Congratulations! You can register.")
        }else{
            println("Sorry, you are $age years old. You can't register.")
        }
        return age
    }
    val person1 = userRegis(17)
    val person2 = userRegis(18)
}