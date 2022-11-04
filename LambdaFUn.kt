//lambda function

fun main() {
    var lamb = { a: Int, b: Int -> a + b }

    println(lamb(1, 2))

    var multiLamb = {
        println("Hello")
        val a = 1 + 2
        println(a)
        "how are you"
    }
    println(multiLamb())

    val singleLambda = { x: Int -> x * x }
    val single1: (Int) -> Int = { x -> x * x }
    println(singleLambda(2))
    println(single1(2))
    val msg = { x: String -> x }
    println(msg("hello how are you"))
    val msg1: (String) -> String = { x -> x.uppercase() }
    println(msg1("kotlin programming is very easy and fun to learn "))

    var sh: (Int) -> Int = { it * it }
    println(sh(2))

}
