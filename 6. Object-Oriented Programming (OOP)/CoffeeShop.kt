package LearningDay11OOP

class CoffeeBill(){

    fun billing(){
        println("No items purchased.")
    }

    fun billing(prices: List<Double>, names: List<String>){
        if(prices.isEmpty() || names.isEmpty()){
            billing()
            return
        }

        val totalItem = prices.size
        for (i in 0 until totalItem) {
            println("- 1 ${names[i]}: ${prices[i]} BDT")
        }

        val total = prices.sum()
        if (totalItem > 3){
            val discount = 0.1
            val totalPrice = total - (total * discount)
            println("Total (before discount): ${"%.2f".format(totalPrice)} BDT")
            println("Discount Applied: 10%")
            println("Final Bill: ${"%.2f".format(totalPrice)} BDT")
        }else{
            println("Total Bill: ${"%.2f".format(total)} BDT")
        }
    }
}

fun main(){
    val bill1 = CoffeeBill()
    bill1.billing(listOf(50.00,55.00,55.00),listOf("Latte","Milk Shake","Milk Shake"))
}