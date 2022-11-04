//Object Declaration
object A1 { ////object Declaration
    var a = 10
}

object B1 {
    var b = 20
    fun show() {
        println("This is the show method of object B")
    }
}


fun main() {
    println(A1.a)
    println(B1.b)
    B1.show()

}

