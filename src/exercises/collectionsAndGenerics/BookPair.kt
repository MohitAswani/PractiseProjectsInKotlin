package exercises.collectionsAndGenerics

import java.time.Year
fun main(){

}

class Book(var title:String,var author:String,var year:Year)
{
    fun bookandtitle():Pair<String,String>
    {
        return title to author
    }
    fun bookTitleAndYear():Triple<String,String,Year>
    {
        return Triple(title,author,year)
    }
}