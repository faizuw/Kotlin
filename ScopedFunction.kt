//Scoped functions
fun main() {
    var emp = Employee()
    emp.id = 1
    emp.name = "Adil"
    println(emp)
//apply function
    var show = emp.apply {
        id = 2
        name = "kamil"
    }
    println(emp)
///for displaying

    println(emp.id)
    println(emp.name)
    //let function
    emp.let {
        it.name = "Burhan"
        it.id = 3
        println(it.name)
        println(it.id)

    }
    //with function
    with(emp) {
        name = "MAJID"
        id = 4
        println(name)
        println(id)
    }
    //run function
    emp.run {
        name = "Basit"
        id = 5
        println(name)
        println(id)
    }

}
