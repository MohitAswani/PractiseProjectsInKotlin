package exercises.classAndObjects.spices

fun main(){
    var c1=Curry("Red curry","hot",RedSpiceColor)
    var c2=Curry("Yellow curry","mild",YellowSpiceColor)
    println(c1.spiciness)
    println(c2.spiciness)
}
sealed class Spice:SpiceColor
{
    abstract val name:String
    abstract var spiciness:String
    abstract fun prepareSpice()
}
interface Grinder{
    fun grind()
}
enum class Color(val rgb:Int)
{
    RED(0xFF0000),GREEN(0x00FF00),YELLOW(0x0000FF)
}
interface SpiceColor{
    val color:Color
}
object YellowSpiceColor:SpiceColor{
    override val color: Color
        get() = Color.YELLOW
}
object RedSpiceColor:SpiceColor{
    override val color: Color
        get() = Color.RED
}
class Curry(override var name:String,override var spiciness:String="mild",color:SpiceColor=YellowSpiceColor):Spice(),Grinder,
    SpiceColor by color
{
    override fun prepareSpice() {
        println("Preparing spices")
    }

    override fun grind() {
        println("Grrrrrrrinding")
    }
}