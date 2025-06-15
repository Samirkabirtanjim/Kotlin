package LearningDay11OOP

open class FoodOrder {

    open fun billing() {
        println("No items ordered")
    }

    open fun billing(prices: List<Double>, names: List<String>, isMember: Boolean) {
        if (prices.isEmpty() || names.isEmpty()) {
            billing()
            return
        }

        val paired = names.zip(prices)
        val grouped = paired.groupBy { it.first }

        println("Order Summary:")
        var subtotal = 0.0

        for ((itemName, itemList) in grouped) {
            val quantity = itemList.size
            val pricePerItem = itemList.first().second
            val itemTotal = quantity * pricePerItem
            subtotal += itemTotal
            println("- $quantity $itemName: ${"%.2f".format(itemTotal)} BDT")
        }

        println("\nSubtotal: ${"%.2f".format(subtotal)} BDT")

        var finalAmount = subtotal

        if (names.size > 3) {
            val discount5 = subtotal * 0.05
            finalAmount -= discount5
            println("5% Discount: -${"%.2f".format(discount5)} BDT")
        }

        if (isMember) {
            val memberDiscount = finalAmount * 0.15
            finalAmount -= memberDiscount
            println("Membership Discount (15%): -${"%.2f".format(memberDiscount)} BDT")
        }

        println("Final Bill: ${"%.2f".format(finalAmount)} BDT")
    }
}

class FastFoodOrder : FoodOrder() {
    override fun billing() {
        super.billing()
    }

    override fun billing(prices: List<Double>, names: List<String>, isMember: Boolean) {
        super.billing(prices, names, isMember)
        println("\nNote: Fast food charges include packaging.")
    }
}

class HealthyFoodOrder : FoodOrder() {
    override fun billing() {
        super.billing()
    }

    override fun billing(prices: List<Double>, names: List<String>, isMember: Boolean) {
        super.billing(prices, names, isMember)
        println("\nNote: Healthy food comes with free detox water.")
    }
}

fun main() {
    val names = listOf("Burger", "Pizza", "Burger", "Coke")
    val prices = listOf(120.0, 250.0, 120.0, 40.0)

    val fastOrder = FastFoodOrder()
    fastOrder.billing(prices, names, isMember = true)

    println("\n---\n")

    val healthyNames = listOf("Salad", "Juice", "Salad", "Juice", "Soup")
    val healthyPrices = listOf(100.0, 80.0, 100.0, 80.0, 120.0)

    val healthyOrder = HealthyFoodOrder()
    healthyOrder.billing(healthyPrices, healthyNames, isMember = false)
}
