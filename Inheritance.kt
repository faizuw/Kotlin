///////////Inheritance
open class Parent {
    init {
        println("Parent class constructor")
    }

    val name: String = "parent"
    fun method1() {
        println("I am in parent class")
    }
}

class child : Parent() {
    init {
        println("Child class constructor")
    }

    val name2: String = "child"
    fun method2() {
        println("I am in child class")
    }
}


fun main() {
    var call = child()
    println(call.name2)
    call.method2()
    println(call.name)
    call.method1()
}