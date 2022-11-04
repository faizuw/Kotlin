//class to check whether a person can vote or not
class Person(val name: String, var address: String, var age: Int) {
    fun isEligibleToVote(): String {
        if (age >= 18) {
            return "$name is eligible to cast vote as his/her age is $age"
        } else
            return "$name is Not eligible to cast vote as his/her age is $age"
    }
}

fun main() {
    var p1 = Person("Faisal", "Jamia", 24)
    var p2 = Person("Aqib", "Mala Pora", 16)
    println(p1.isEligibleToVote())
    println(p2.isEligibleToVote())
    var i: Int = 20
    println(i.plus(20))
    println(i.toFloat())
}