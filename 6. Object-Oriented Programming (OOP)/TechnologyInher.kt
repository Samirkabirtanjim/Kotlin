package LearningDay11OOP

//Create something related to technology.
//Start with a general category (like Device, Machine, or Gadget).
//Then, make 2 specific types that inherit from it (like Phone, Laptop, Smartwatch, etc.).
//Add 1 function in the base class, and 1 unique function in each subclass.

open class Device(var brandName: String, var brandModel: String){
    fun deviceDisplay(){
        println("Brand Name is $brandName and Model $brandModel.")
    }
}

class Phone(brandName: String, brandModel: String, var displayType: String, var ramSize: Int): Device(brandName, brandModel){
    fun phoneDisplay(){
        deviceDisplay()
        println("Display type $displayType, Ram Size ${ramSize}GB")
    }
}

class Gadget(brandName: String, brandModel: String, var screenSize: String): Device(brandName,brandModel ) {
    fun gadgetDisplay() {
        deviceDisplay()
        println("Screen size $screenSize")
    }
}

fun main(){

    val phone1 = Phone("Samsung","A32","IPS", 16)
    phone1.phoneDisplay()

    println()

    val smartwatch = Gadget("Apple","I7","1.6 Inch")
    smartwatch.gadgetDisplay()
}