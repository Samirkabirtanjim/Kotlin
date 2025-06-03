package LearningDay11OOP

//Create a real-world model using a class (like a Vehicle, Account, or Animal).
//Include at least 3 properties and 1 method that performs an action based on those properties.
//Then, create multiple objects and use the method.

class Vehicle(val name: String, val color: String, val price: Int) {
    fun display() {
        println("Vehicle Name: $name")
        println("Color: $color")
        println("Price: $price")
    }
}

class Account(val accountName: String, val accountType: String, val accountAmount: Int) {
    fun display() {
        println("Account Name: $accountName")
        println("Type: $accountType")
        println("Balance: $accountAmount")
    }
}

class Animal(val name: String, val color: String, val age: Int) {
    fun display() {
        println("Animal Name: $name")
        println("Color: $color")
        println("Age: $age")
    }
}

fun main() {
    val vehicle1 = Vehicle("BMW", "Red", 2_000_000)
    vehicle1.display()

    val account1 = Account("Dorbesh", "Personal", 1_000_000_000)
    account1.display()

    val animal1 = Animal("Tiger", "Orange & Black", 12)
    animal1.display()
}
