package LearningDay11OOP

class CoffeeBill(){

    fun billing(){
        println("No items purchased.")
    }

    fun billing(prices: List<Double>, names: List<String>){

        when(prices.size){
            0 -> billing()
            1 -> println("1 ${names[0]}, Price: ${prices[0]}")
            2 -> println("1 ${names[0]},1 ${names[1]}, Price: ${prices[0]+prices[1]}")
            3 -> println("1 ${names[0]},1 ${names[1]},1 ${names[2]}, Price: ${prices[0]+prices[1]+prices[2]}")
            else -> {
                val totalBill = prices.sum()
                val discount = 0.1
                val finalPrice = totalBill - (totalBill * discount)
                println("${names}, total price: $finalPrice")
            }
        }
    }
}

fun main(){
    val bill1 = CoffeeBill()
    bill1.billing(listOf(40.00,50.00,55.00,55.00),listOf("Cappuccino","Latte","Milk Shake","Milk Shake"))
}