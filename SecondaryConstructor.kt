//Secondary constructor
class Automobile1(val name: String, val tyres: Int, val maxSeating: Int, val type: String)//primary constructor
{
    init {
        println("$name car has $tyres tyres")

    }

    init {
        println("MaxSeating of car $name is $maxSeating")
    }

    constructor(nameParam: String, typeParam: String) : this(nameParam, 4, 8, typeParam)//secondary param
    constructor() : this("a", 4, 8, "pr")

    fun driveCar() {}
    fun applyBrakes() {}
}

fun main() {
    var car = Automobile1("Alto", "Petrol")
    var car1 = Automobile1("Sentro", "Diesel")
    var car2 = Automobile1()

}