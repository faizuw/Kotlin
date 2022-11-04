//when

fun main() {
    var animal = "Horse"
    when (animal) {
        "Dog" -> println("Animal is Dog")
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Aniamal is Cat")
        else -> println("No Animal Found")
    }
    var number = 1
    var result = when (number) {
        1 -> ("One")
        2 -> ("Two")
        3 -> ("Three")
        4 -> ("Four")
        5 -> ("Five")
        else -> ("No number found")

    }
    println(result)
}