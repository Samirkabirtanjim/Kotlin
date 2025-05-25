package LearningDay9

//Loading Spinner Simulation
fun loadingSpinnerSimulation(progress: Int){

    var progress = 0
    while (progress <= 100){
        println("Loading....$progress%")
        progress += 20
    }
}

fun main(){
    loadingSpinnerSimulation(55)
}