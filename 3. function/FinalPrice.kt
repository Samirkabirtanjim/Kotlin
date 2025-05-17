package LearningDay3

//2. Write a function that calculates the final price after applying a discount to a product.

fun main(){

    fun discount(price: Float): Float{

        val discount = 0.2f
        val totalPrice = price - (price * discount)
        return totalPrice
    }

    val pay = discount(200.00f)
    println("You have to pay $pay")
}