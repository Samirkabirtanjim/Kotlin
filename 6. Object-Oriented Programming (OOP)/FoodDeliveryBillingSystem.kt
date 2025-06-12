package LearningDay11OOP

open class FoodOrder(){

    open fun billing(){
        println("No items ordered")
    }

    open fun billing(prices: List<Double>, names: List<String>){

        if (prices.isEmpty() || names.isEmpty()){
            billing()
            return
        }

        val paired = names.zip(prices)
        val grouped = paired.groupBy { it.first }

        println("Order Summary:")
        var total = 0.0

        // {burger, 2}
        for ((itemName, itemList) in grouped){
            val quantity = itemList.size
            val pricePerItem = itemList.first().second
            val itemTotal = quantity * pricePerItem
            total += itemTotal

            println("- $quantity $itemName: ${"%.2f".format(itemTotal)} BDT")
        }

        println("Total (Before discount): ${"%.2f".format(total)} BDT")

        if(names.size > 3){
            val discount = total * 0.15
            val totalFinal = total - discount
            println("Discount Applied: 15%")
            println("Final Bill: ${"%.2f".format(totalFinal)} BDT")
        }else{
            println("Final Bill ${"%.2f".format(total)} BDT")
        }
    }
}

class FastFoodOrder: FoodOrder(){
    override fun billing(){
        super.billing()
    }

    override fun billing(prices: List<Double>, names: List<String>) {
        super.billing(prices, names)
        println("Note: Fast food charges include packaging.")
    }
}

class HealthyFoodOrder: FoodOrder(){
    override fun billing() {
        super.billing()
    }

    override fun billing(prices: List<Double>, names: List<String>) {
        super.billing(prices, names)
        println("Note: Healthy food comes with free detox water.")
    }
}

fun main(){

    val names = listOf("Burger", "Pizza", "Burger", "Coke")
    val prices = listOf(120.0, 250.0, 120.0, 40.0)

    val firstOrder = FastFoodOrder()
    firstOrder.billing(prices,names)

    println("\n--\n")

    val healthyNames = listOf("Salad", "Juice", "Salad", "Juice", "Soup")
    val healthyPrices = listOf(100.0, 80.0, 100.0, 80.0, 120.0)

    val secondOrder = HealthyFoodOrder()
    secondOrder.billing(healthyPrices, healthyNames)
}