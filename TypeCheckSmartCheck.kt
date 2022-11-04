//Type checking and Smart Casting

interface Draggable1 {
    fun drag()

}

abstract class Shape5 : Draggable1 {
    abstract fun area(): Double
}

class Circle5(var radius: Double) : Shape5() {
    override fun area(): Double {
        return Math.PI * radius * radius

    }

    override fun drag() {
        println("Circle is Dragging")
    }

}

class Person5(val name: String) : Draggable1 {
    override fun drag() {
        println("$name is Dragging ")
    }

    fun name() {
        println("My name is $name")
    }
}

fun main() {
    var cir = Circle5(2.0)
//    if(cir is Circle)//Type checking
//         {
//        println("This is the object of Circle")
//    }

    var per = Person5("Amir")
//    if (per is Person)//Type checking
//    {
//        println("This is the object of Person")
//    }
    var arr = arrayOf(cir, per)
    for (obj in arr) {
        if (obj is Circle5) {
            println(obj.area())
        } else (obj as Person5).name() //smart casting bcz .name() function is not defined in Draggable interface
    }

}
