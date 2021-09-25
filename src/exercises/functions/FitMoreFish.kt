package exercises.functions

fun canAddFish(tankSize:Double,currentFish:List<Int>,fishSize:Int=2,hasDecoration:Boolean=true):Boolean
{
    var realTankSize:Double=if(hasDecoration) 0.8*tankSize else tankSize
    val initialFishes=currentFish.sum()
    if((initialFishes+fishSize)<=realTankSize)
        return true;
    return false;
}
fun main(){
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2)))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}