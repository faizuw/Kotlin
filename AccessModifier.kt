//Access Modifiers

open class A {
    public var a = 10
    internal var b = 20
    private var c = 30
    protected var d = 40
}

class B : A() {
    fun display() {
        println(a)
        println(b)
        // println(c) // as it is declared private it will be not accessible in this class
        println(d)
    }
}

fun main() {
    var call = B()
    println(call.a)
    println(call.b)
    //println(call.d)// declared protected so only can be accessed in its sub class
}
