package exercises.functionalmanupulation

enum class Direction()
{
    NORTH,SOUTH,EAST,WEST,START,END
}
fun move(where: () -> Boolean ):Boolean
{
    return where()
}
class Game()
{
    fun makeMove(inp:String?):Boolean
    {
        if(inp=="N")
        {
            move(north)
        }
        else if(inp=="S")
        {
            move(south)
        }
        else if(inp=="E")
        {
            move(east)
        }
        else if(inp=="W")
        {
            move(west)
        }
        else
        {
            return move(end)
        }
        return true
    }
    private var path= mutableListOf<Direction>(Direction.START)
    private val north={path.add(Direction.NORTH)}
    private val south={path.add(Direction.SOUTH)}
    private val east={path.add(Direction.EAST)}
    private val west={path.add(Direction.WEST)}
    private val end:()->Boolean={
        path.add(Direction.END)
        println("Game Over")
        println("$path")
        path.clear()
        false
    }
}
fun main(){
    val game=Game()
    var rval=true
    while(rval)
    {
        print("Enter a direction: N/S/E/W:")
        var inp= readLine()
        rval=game.makeMove(inp)
    }
}