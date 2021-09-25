package exercises.collectionsAndGenerics

import java.util.*

fun main()
{
//    val allBooks= setOf("As you like it","Merchant of Venice","Hamlet")
//    val library= mapOf("Shakespeare" to allBooks)
//    println(library.any{it.value.contains("Hamlet")})
//    val moreBook= mutableMapOf("Shakespeare" to "Romeo and Juliet")
//    moreBook.getOrPut("Shakespeare"){"As you like it"}
//    println(moreBook)

    var b1=Books("Merchant Of Venice",5,10)

    var p1=Puppy()

    while(b1.Pages!=0) {
        println(b1.Pages)
        p1.playWithBook(b1)
    }
}
object Constants {
    const val maxBooks: Int = 5
}
class Books(var title:String,var booksBorrowed:Int,var Pages:Int)
{
    companion object
    {

        const val BASE_URL="www.ebooks.com"
    }
    fun canBorrow():Boolean
    {
        if(booksBorrowed<Constants.maxBooks) {
            return true
        }
        return false
    }
    fun printURL()=println("$BASE_URL$title.html")
}
class Puppy
{
    fun playWithBook(BookToPlay: Books)
    {
        BookToPlay.tornPages(Random().nextInt(BookToPlay.Pages)+1)
    }
}
fun Books.weight()=Pages*1.5

fun Books.tornPages(torn:Int) = if (Pages >= torn) Pages -= torn else Pages = 0



