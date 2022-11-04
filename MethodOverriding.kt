//Method Overriding
open class Mobile() {
    open val name: String = "Mobile"
    open val size: Int = 5
    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple mobile Display")


}

class OnePlus() : Mobile() {
    override val name: String = "One Plus"
    override val size: Int = 8
    override fun display() {
        super.display()    //will call parent class function
        println("One Plus mobile display")
    }

    override fun toString(): String {
        return "OnePlus(name='$name', size=$size)"
    }
}

//data class Person(
//    val name : String
//)

fun main() {
    var one = OnePlus()
    one.display()
    println(one.name)
    var mob = Mobile()
    mob.display()
    println(mob.name)

//    val person = Person("Hello")
//    println(person.toString())

}
