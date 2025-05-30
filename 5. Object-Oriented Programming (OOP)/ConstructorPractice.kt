package LearningDay11OOP

//Create a Book class that takes title, author, and pages as constructor parameters.
// Add a function bookInfo() that prints the book details.
class Book(val title: String, val author: String, val pages: String){

    fun bookInfo(){
        println("Title : $title")
        println("Author : $author")
        println("Pages : $pages")

    }
}

fun main(){
    val book = Book("ICT","JOY","258")
    book.bookInfo()
}


