///////////////Functions
//fun add(number1: Int, number2: Int) = number1 + number2    //explicit declaration

//fun EvenOdd(number2:Int):String{
//    if (number2%2==0){
//        return "Even"
//    }else return "Odd"
//}
fun EvenOdd(number2: Int): Unit {              //when no return type it is there by default is  Unit
    var result = if (number2 % 2 == 0) "Even" else "Odd"
    println(result)
}


//default arg
fun printMessage(count: Int = 2) {
    for (i in 1..count) { //parameter

        println("Hello $i")
    }
}

fun main() {
    var call = add(4, 6)
    println("The sum of two numbers is $call")
    EvenOdd(9)
    EvenOdd(4)
    printMessage(4)
    printMessage()//will take default argument
}