package LearningDay11OOP

abstract class Accounts(val accountHolderName: String){

    val accountTypes = "Savings" //state
    abstract fun calculateInterest(balance: Double): Double //abstract
    fun showAccountInfo(){ //implement
        println("This account holder name is $accountHolderName and this is an $accountTypes account.")
    }
}

class UserAccount(accountHolderName: String): Accounts(accountHolderName){
    override fun calculateInterest(balance: Double): Double {
        return balance * 0.05
    }
}

fun main(){

    val person1 = UserAccount("Tanjim")
    person1.showAccountInfo()

    val interest1 = person1.calculateInterest(10000.0)
    println("Interest earned on balance: $interest1")
}