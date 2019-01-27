open class Book(val Title : String, val Author : String) {
    private var currentPage = 1
    open fun readPage() {
        currentPage++
        println("You have now read $currentPage page(s).")
    }
}

class EBook(Title : String, Author : String, val Format : String = "text") : Book(Title, Author) {
    private var words = 0
    override fun readPage() {
        words += 250
        println("You have now read $words words.")
    }
}

fun main() {
    println("Enter the book type, book or ebook: ")
    val type = readLine()
    println("Enter the title and author name")
    val title :String = readLine().toString()
    val author : String = readLine().toString()
    if (type == "ebook") {
        println("Enter the ebook format: ")
        val format = readLine().toString()
        val book = EBook(title, author, format)
        println("The book titled, ${book.Title} by ${book.Author} is an eBook of ${book.Format} format.")
    }
    val book = Book(title, author)
    println("The book is titled, ${book.Title} by ${book.Author}.")

    var x = "yes"
    while (x == "yes") {
        println("Have you finished reading a page? (yes|no) ")
        var finished = readLine().toString()
        if (finished == "yes") book.readPage()
        println("Do you want to continue reading? (yes|no) ")
        x = readLine().toString()
    }
}