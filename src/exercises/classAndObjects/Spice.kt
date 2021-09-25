package exercises.classAndObjects
fun main(){
    var is1= SimpleSpice()
    println("${is1.name} ${is1.heat}")
    var spices= listOf<Spice>(
        Spice("green chillies","hot"),
    Spice("red chillies","mild")
    )
    var lessSpicy=spices.filter { it.heat==3||it.heat==5 }
    println(lessSpicy.toList())
}
class SimpleSpice{
    var name:String="curry"
    var spiciness:String="mild"
    val heat:Int
    get(){return 5}
}
class Spice(var name:String,var spiciness:String="mild")
{
    init {
        println("${this.name} ${this.spiciness}")
    }
    var heat:Int=0
    get(){
        return when(spiciness){
            "low"->1
            "mild"->5
            "high"->8
            else -> 0
        }
    }
}