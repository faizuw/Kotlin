///polymorphism and Inheritance.kt

open class Shape1 {
    open fun area(): Double {
        return 0.0
    }
}

class Circle1(var radius: Double) : Shape1() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square1(var side: Double) : Shape1() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle1(var base: Double, var height: Double) : Shape1() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

fun printArea(shape: Shape1) {
    println(shape.area())
}

fun main() {
    var shape = Shape1()
    printArea(shape)
    var square = Square1(2.0)
    printArea(square)
}
