package exercises.classAndObjects

open class Book(open var title:String="None",open var author:String="None") {
    private var currentPage = 0;
    open fun readPage()=currentPage+1
}
class eBook(var format:String="text"): Book(){
    private var wordCount:Int=0
    override fun readPage()=wordCount+250
}