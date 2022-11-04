//Null Safety
fun main() {
    val a: String = "ABC"
    val b: String? = null
    var isCorrect: Boolean? = null
    if (b != null) {
        println(b.uppercase())
    }

    println(b?.uppercase())

    b?.let {
        println("line 1")
        println("line 2 $b")
        println("line 3 $it")
    }

    var store: String = b!!
    println(store)
    var print1: String = b ?: "NA"
    println(print1)
}