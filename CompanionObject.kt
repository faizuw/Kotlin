//Companion Object
class A3 {

    companion object obj {
        @JvmStatic             //will make it interoperable with java as well
        fun show() {
            println("This is a show method of OBJECT inside class A ")
        }
    }

    object obj1 {
        @JvmStatic
        fun show1() {
            println("This is a show1 method of object class A")
        }
    }
}

fun main() {
    //  A.obj.show()   //calling without companion (when companion keyword is not written inb front of object)
    A3.show()
    A3.obj1.show1()
}
