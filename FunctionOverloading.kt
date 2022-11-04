//Function Overloading
//variable storing function
import kotlin.math.pow

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun addition(a: Double, b: Double): Double {
    return a + b
}

//fun add(a: Double, b: Double): Double {
//    return a + b
//}

fun power(a: Double, b: Double): Double {
    return a.pow(b)
}

fun add1(number1: Double, number2: Double) = number1 + number2

fun main() {
    println(addition(y = 2, x = 3)) //Named arguments
    println(addition(2.7, 5.3))
    var fn = ::add1
    println(fn(8.0, 4.0))
    fn = ::power
    println(fn(2.0, 2.0))

}



