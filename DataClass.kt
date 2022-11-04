//Data class
data class Person6(val name: String, val id: Int) {

}

fun main() {
    var p1 = Person6("Amir", 1)
    var p2 = Person6("Amir", 1)
    println(p1)  ///toString
    println(p2)
    println(p1.hashCode())
    println(p2.hashCode())
    println(p1 == p2)

    var p3 = p1.copy()
    println(p3)
    var p4 = p2.copy("Yasir")
    println(p4)

    var (name, id) = p1  //destructuring
    println(name)
    println(id)

    println(p1.component1())
    println(p1.component2())
}