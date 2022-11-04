//////////functions

fun comparision() { //function for comparison
    var i = 6
    var j = 6
    var result = if (i > j) {
        "I is greater"
    } else if (j > i) {
        "J is greater"
    } else {
        "I is equal to J"
    }
    println(result)
}

fun evenOdd() {    //function for even odd
    var x = 2
    if (x % 2 == 0) {
        println("Number is Even")
    } else println("Number is odd")

}

fun main() {
    var raining = false
    if (raining == true) {
        println("Take umberalla with you its raining outside ")

    } else {
        println("Its sunny day Enjoy")
    }
    comparision()   //calling function
    evenOdd()       //calling function
}
