interface Draggable {
    fun drag()

}

fun dragObjects(x: Array<Draggable>) {
    for (obj: Draggable in x) {
        obj.drag()
    }
}

abstract class Shape4 : Draggable {
    abstract fun area(): Double
}

class Circle4(var radius: Double) : Shape4() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun drag() {
        println("Circle is Dragging")
    }

}

class Square4(var side: Double) : Shape4() {
    override fun area(): Double {
        return side * side
    }

    override fun drag() {
        println("Square is Dragging")
    }

}

class Triangle4(var base: Double, var height: Double) : Shape4() {
    override fun area(): Double {
        return 0.5 * base * height
    }

    override fun drag() {
        println("Triangle is Dragging")
    }

}

class Person4(val name: String) : Draggable {
    override fun drag() {
        println("$name is Dragging ")
    }
}


fun main() {
    dragObjects(arrayOf(Circle4(2.0), Square4(2.0), Triangle4(2.0, 2.0), Person4("Adil")))
}