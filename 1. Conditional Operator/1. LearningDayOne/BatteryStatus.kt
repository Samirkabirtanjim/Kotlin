//You have a variable batteryLevel.
//If it’s less than 20, print "Battery low".
//If it's between 20 and 80, print "Battery okay".
//If it's more than 80, print "Battery full".

fun main() {

    val batteryLevel: Int = 20

    if (batteryLevel <= 20) {
        println("Battery low")
    } else if (batteryLevel <= 80) {
        println("Battery okay")
    } else {
        println("Battery full")
    }
}