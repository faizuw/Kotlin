//inline function
fun main() {
    calculateTime {
        loop(10000000)
    }
}

fun loop(a: Long) {
    for (i in 1..a) {

    }

}

inline fun calculateTime(fn: () -> Unit) {
    val begin: Long = System.currentTimeMillis()
    fn()
    val finish: Long = System.currentTimeMillis()
    println("Tottal time taken is ${finish - begin} ms")
}