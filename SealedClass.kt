//Sealed class

sealed class Tile
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int) : Tile()

fun main() {
    val tile: Tile = Red("Mushroom", 2)
    val point = when (tile) {
        is Blue -> tile.points * 2
        is Red -> tile.points * 4
    }
    println(point)
}
