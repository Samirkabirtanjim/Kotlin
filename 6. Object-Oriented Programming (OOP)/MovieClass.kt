package LearningDay11OOP

//Create something that stores information about a movie, including
//its title, director, and release year. You should also be able to display this information.

class Movie(var title: String, var director: String, var releaseYear: Int){
    fun display(){
        println("Movie Title: $title")
        println("Movie Director: $director")
        println("Movie Release Year: $releaseYear")
    }
}
fun main(){
    val movie1 = Movie("COC","Royal",1999)
    movie1.display()

    val movie2 = Movie("PB","IDK",2018)
    movie2.display()
}