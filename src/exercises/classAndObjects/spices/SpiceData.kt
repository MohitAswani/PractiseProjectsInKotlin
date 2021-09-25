package exercises.classAndObjects.spices

import java.awt.Label
fun main(){
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}
data class SpiceContainer(var s:Spice,var label:String=s.name)