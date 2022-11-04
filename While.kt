//While loop
fun main() {
    var count = 5
    while (count >= 1) {
        println("hello")
        count--
    }

    var table = 2
    var index = 1
    while (index <= 10) {

        println("" + table + " * " + index + " = " + (table * index))
        index++
    }

    ////////////Do while
    var dec = 5
    do {
        println("Hello")
        dec--
    } while (dec >= 1)

}
