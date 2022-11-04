//PolyMorphism
open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(var radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(var side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(var base: Double, var height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

fun calculateArea(shape: Array<Shape>) {
    for (shape: Shape in shape) {
        println(shape.area())

    }
}

fun main() {
    var cir: Shape = Circle(2.0)
    var squ: Shape = Square(2.0)
    println(cir.area())
    println(squ.area())
    var shape = arrayOf(Circle(2.0), Square(2.0), Triangle(2.0, 2.0))
    calculateArea(shape)
}