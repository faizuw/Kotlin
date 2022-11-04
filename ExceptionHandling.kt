fun main() {
    var arr = arrayOf(1, 2, 3, 4)


    try {
        println(arr[6])
    } catch (e: Exception) {
        println("Array out of bound")
    } finally {
        println("This will be executed at any cost ")
    }
    println("Last statement")
    countNumber(7)
    countNumber(-5)
}

fun countNumber(count: Int) {
    if (count < 0) {
        throw IllegalArgumentException("count cannot be negative")
    } else {
        println("The value of count is $count")
    }
}
