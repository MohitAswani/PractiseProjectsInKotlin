package exercises.functionalmanupulation

fun List<Int>.divisibleBy3(block:(Int)->Int):List<Int>{
    val temp= mutableListOf<Int>()
    for(elem in this)
    {
        if(block(elem)==0)
            temp.add(elem)
    }
    return temp
}
fun main(){
    val numbers= listOf<Int>(1,2,3,4,5,6,7,8,9,0)
    println(numbers.divisibleBy3 {it%3})
}