package exercises.functions

import java.util.*


fun main() {
//    println(species())
    var rollDice = { sides:Int->if (sides==0) 0 else Random().nextInt(sides) + 1 }
    var rollDice2:(Int)->(Int) = { sides->if (sides==0) 0 else Random().nextInt(sides) + 1 }
    repeat(10)
    {
        gamePlay(6, rollDice)
    }
}
fun gamePlay(dice:Int)
{
    println(dice)
}
fun gamePlay(size:Int,operation:(Int)->(Int))
{
    println(operation(size))
}
fun species():List<String>{
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val newList=(spices.filter { it.contains("curry") }).sortedBy { it.length }
    return newList.filter { it[0]=='c'&&it[it.length-1]=='y'}
}
