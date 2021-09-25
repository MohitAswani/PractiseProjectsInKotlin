package exercises.functions

import java.awt.GraphicsConfigTemplate

fun main(){
    println(whatShouldIDoToday())
}
fun whatShouldIDoToday(weather:String="Sunny",temperature:Int=24):String{
        val mood= readLine()
    return when{
            (mood!!.equals("happy")&& weather.equals("Sunny"))->"go for a walk"
            mood!!.equals("sad") && weather == "rainy" && temperature == 0 -> "stay in bed"
            temperature > 35 -> "go swimming"
            else -> "Stay home and read."
        }
}