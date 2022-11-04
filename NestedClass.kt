///Nested and inner class
fun main() {
    var out = Outer()
    println(out.i)
//    var inn=Outer.Inner()         ///used without inner keyword
//    inn.show()
    var inn = Outer().Inner()
    inn.show()
}

class Outer() {
    var i = 2

    inner class Inner() {
        fun show() {
            println("hello i am in  Inner class ")
        }
    }
}