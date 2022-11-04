//Getters and Setters
class Person2(nameParam: String, ageParam: Int) {
    var name: String = nameParam
        get() {
            println("Name get method is called")
            return field.uppercase()
        }
    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            } else println("Age cannot be negative")
        }


}

fun main() {
    val p1 = Person2("Adil", -19)
    p1.age = -2
    println(p1.name)

}
