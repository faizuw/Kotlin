//Abstract Class
abstract class Shape3 {
    abstract fun area(): Double
    fun display(): String {
        return "Abstract class function"
    }

    abstract fun show(): String

}

class Circle3(var radius: Double) : Shape3() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun show(): String {
        return "Overridden Show Function"
    }
}

fun main() {
    var cir = Circle3(2.0)
    println(cir.area())
    println(cir.display())
    println(cir.show())
}
