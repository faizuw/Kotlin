//Method Calling
open class Shape2 {
    open fun area(): Double = 0.0
//    override fun toString(): String {
//        return "Overridden toString Method"
//    }
}

class Circle2(var radius: Double) : Shape2() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

fun main() {
    var cir = Circle2(2.0)
    println(cir.toString())
    println(cir.hashCode())
}