package LearningDay11OOP

class Billing(){

    fun generateBill(){
        println("No items purchased.")
    }
    fun generateBill(prices: List<Double>){
        when(prices.size){
            0 -> generateBill()
            1 -> println("Total price: ${prices[0]}")
            else -> {
                val totalBills = prices.sum()
                val discount = 0.1
                val finalBill = totalBills - (totalBills * discount)
                println("Total price after 10% discount: ${finalBill}")
            }
        }
    }
}

fun main(){
    println()
    println("Billing System")

    val bill1 = Billing()
    bill1.generateBill(listOf(100.00,50.00))
}