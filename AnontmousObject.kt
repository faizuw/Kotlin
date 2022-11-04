//Anonymous Object
open class A2(val name: String) {
    open fun fullName() = println("Person bearing name $name is in class A")

}


fun main() {
    val obj = object : A2("Adil") {
        override fun fullName() {
            super.fullName()
            println("This is anonymous object where name is $name")
        }


    }
    obj.fullName()
}