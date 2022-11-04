//Constructors
class Automobile(val name: String, val tyres: Int, val maxSeating: Int, val hasAirBag: Boolean)//primary constructor
{
    fun driveCar() {}
    fun applyBrakes() {}
}

class Person1(nameParam: String, ageParam: Int) {
    val name: String = nameParam
    var age: Int = ageParam
    var canVote: Boolean = ageParam >= 18
}

fun main() {
    var car = Automobile("Car", 4, 8, true)
    println(car.hasAirBag)
    var p1 = Person1("Aquib", 18)
    println(p1.name)
    println(p1.age)
    println(p1.canVote)

}