//Default constructor and LateInit
class Cal {
    lateinit var message: String

    fun add(a: Int, b: Int): Int {

        return a + b
    }

    fun Multiply(a: Int, b: Int): Int {
        return a * b
    }
}

fun main() {
    var calculator = Cal() //default constructor
    var a = calculator.add(7, 4)
    println(a)

}