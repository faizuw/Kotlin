//assigning function to  variable
//higher order function
fun sum (a:Double,b:Double):Double{
    return a+b
}
fun calculator(a:Double,b:Double,fn:(Double,Double)->Double){
val result= fn(a,b)
    println(result)
}
fun main() {
    val call: (a: Double, b: Double) -> Double =::sum
    println(call(2.0,3.0))
    calculator(2.0,2.0,::sum)
}