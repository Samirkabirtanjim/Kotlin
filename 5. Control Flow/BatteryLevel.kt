package LearningDay9

// Create a function that takes battery percentage and returns status:
fun batteryStatus(level: Int): Int {
    // 100 -> "Fully Charged"
    // 50-99 -> "Charging"
    // Below 50 -> "Low Battery"
    if (level == 100){
        println("Fully Charged")
    }else if (level >= 50){
        println("Charging")
    }else if(level < 49){
        println("Low Battery")
    }
    return level
}
fun main(){
    batteryStatus(100)
    batteryStatus(50)
    batteryStatus(10)
}
