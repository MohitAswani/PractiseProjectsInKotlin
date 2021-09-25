package exercises.collectionsAndGenerics.buildings
fun main(){
    var b1=Building(Wood())
    b1.build()
}
open class BaseBuildingMaterial(var numberNeeded:Int=1)

class Wood():BaseBuildingMaterial(4)

class Brick():BaseBuildingMaterial(8)

class Building<out T: BaseBuildingMaterial>(private val buildingMaterial: T)
{
    private var baseMaterialNeeded:Int=100
    private var actualMaterialsNeeded=buildingMaterial.numberNeeded*baseMaterialNeeded
    fun build()
    {
        println("${buildingMaterial::class.simpleName} $actualMaterialsNeeded")
    }
}