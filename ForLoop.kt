//for loop

fun main() {
    for (i in 1..5 step 2) {
        println(i)
    }
    println("Until")
    for (i in 1 until 5) {
        println(i)
    }
    println("DownWards")
    for (i in 10 downTo 1 step 3) {
        println(i)
    }

    //Table using for loop
    println("Table of 2")
    var table1 = 2
    for (i in 1..10) {
        //println(table1.toString()+" * "+ i +" = "+table1*i)
        println("$table1 * $i = ${table1 * i}")   //String Templating
    }
}