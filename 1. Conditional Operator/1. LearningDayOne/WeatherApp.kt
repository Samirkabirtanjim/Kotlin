//✅ Question 6 (Hard):
//You're building a weather app. Based on the temperature:
//If temp is below 10, print "Too cold".
//If temp is between 10 and 25, print "Comfortable".
//If temp is above 25, print "Hot day".


fun main() {

    val temp: Int = 14

    if (temp < 10) {
        println("Too cold")
    } else if (temp < 25) {
        println("Comfortable")
    } else {
        println("Hot day")
    }
}
