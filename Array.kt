//Array
fun main() {
    var arr = arrayOf("One", "Two ", "Three")//implicit declaration
    var arr1 = arrayOf(1, 2, 3)
    var arr2 = arrayOf<Int>(4, 5, 6)//explicit declaration
    for (i in arr) {
        println(i)
    }
    for ((i, e) in arr.withIndex()) {
        println("$i - $e")

    }
    println(arr1[0])
    println(arr2.get(1))
    println("The size of array is " + arr.size)
    arr.set(0, "Hi")
    println(arr.get(0))


}