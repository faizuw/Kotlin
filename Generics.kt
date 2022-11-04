//generic classes
data class Employee(var name:String="", var id:Int=18)
class Container<t>(var data: t) {
    fun setValue(value: t) {
        data = value
    }

    fun getValue(): t {
        return data
    }
}

//vararg can take multiple parameters
fun add(vararg values: Int) {
    var sum = 0
    for (i in values) {
        sum += i
    }
    println(sum)
}

fun main() {
    var intCont = Container<Int>(4)
    println(intCont.getValue())
    add(1, 2, 3, 4, 5, 6, 7)
    add(10, 20, 11, 12, 17, 19, 18, 5, 4)

}