package LearningDay11OOP

//Exercise 3: Default and Named Parameters
//Create a Product class with default values for price = 0.0 and stock = true.
// Try creating objects with both positional and named arguments.

class Product(
    var name: String,
    var price: Float = 0.0f,
    var stock: Boolean= true)
{
    fun displayInfo(){
        println("Product Name: $name")
        println("Product Price: $price")
        println("Product Stock: $stock")
        println()
    }
}

fun main(){
    println("------Product List------")

    val product1 = Product("Redmi")
    product1.displayInfo()

    val product2 = Product("",300.00f)
    product2.displayInfo()

    val product3 = Product("Samsung",200.00f)
    product3.displayInfo()
}
