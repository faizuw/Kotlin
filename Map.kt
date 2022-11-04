//map
fun main() {
    var students = mutableMapOf<Int, String>()
    students.put(1, "Adil")
    students.put(2, "Aquib")
    students.put(3, "Raqib")

    println(students.get(2))
    println(students.get(5)) //null
    for ((key, value) in students) {
        println("$key = $value")
    }


    students[4] = "Uzair"//set or put
    println(students[4])//get

    for ((key, value) in students) {
        println("$key = $value")
    }

    //immutable map
    var person = mapOf<Int, String>(1 to "hello", 2 to "welcome")
    println(person)
}
