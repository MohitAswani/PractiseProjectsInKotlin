package exercises.functions

fun main(args:Array<String>)
{
    println("Good ${if (args[0].toInt()<12) "Morning" else "Afternoon"} ${args[1]}");
}