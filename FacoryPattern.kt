// Factory pattern
class Pizza(val type: String, val topping: String) {
    companion object Factory {
        fun create(pizzaType: String): Pizza {
            return when (pizzaType) {
                "Tamato" -> Pizza("Tamato Chilly", "Chilly,Cheez")
                "Peppy Paneer" -> Pizza("Paneer Burst", "Paneer, Cheez,Tamato")
                else -> Pizza("Chicken Blast", "Chicken , Cheez")
            }

        }
    }

    override fun toString(): String {
        return "pizza(type: $type, topping: $topping)"
    }

}

fun main() {
    val piz = Pizza.Factory.create("Tamatto")
    println(piz)

    val pizz = Pizza.create("Peppy Paneer")
    println(pizz)
}
