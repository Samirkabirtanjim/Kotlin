//3 notebooks, each costing ₹100
//2 pens, each costing ₹25
//1 coffee mug for ₹150
//He donated ₹50 to a poor vendor
//He also bought 2 T-shirts. Each T-shirt cost ₹150
//After all the purchases:
//Calculate how much money he has left.
//If he wants to divide the remaining money equally between himself and his brother, how much does each get?
//What is the modulus of the remaining money when divided by 7?
//✅ What You Need to Do:
//Use:
//➕ to calculate total cost of notebooks and pens.
//✖️ for items with quantity and unit price.
//➖ to subtract from total money.
//➗ to divide remaining money.
//% to find modulus with 7.
//Write the solution in Kotlin, and print:
//Total spent
//Money left
//Each person’s share
//Modulus result

fun main() {

    val money: Int = 1000
    val noteBook: Int = 3 * 100
    val pens: Int = 2 * 25
    val coffeeMug: Int = 150
    val donation: Int = 50
    val tShirt: Int = 2 * 150
    val total = noteBook + pens + coffeeMug + donation + tShirt

    println("Total spend $total")

    val left = money - total
    println("He left $left")

    val eachPerson = left / 2
    println("Each person will have $eachPerson")

    val remaining = money + left

    println("Remaining money ${remaining % 7}")
}
