//filter function //map function //for each function

fun main() {
    println(isOdd(9))
    var list = listOf<Int>(1, 2, 3, 4, 5, 6, 7)
    //using for loop to show elements in list
    for (i in list){
        println(i)
    }
    // now using for each loop
    println("Using for each")
    list.forEach{ println(it) }

    var show = list.filter(::isOdd)
    //second way
    var show1 = list.filter(fun(a: Int): Boolean {
        return a % 2 != 0
    })
    //using lambda function
    var show3 = list.filter { it: Int -> it % 2 != 0 } //more simplified is : var show3 =list.filter{it %2!=0}
    var show4=list.map { it*it}

    println("Using simple function method $show")
    println("Using second way $show1")
    println("Using lambda function $show3")
    println("Using map function $show4")
    var userList= listOf(
        User(1,"Adil"),
        User(2,"Basit"),
        User(3,"Burhan")
    )
    var paidList=userList.map {
        Paid(it.id,it.name,"paid")
    }

    println(userList.filter { it.id==2 })
    println(userList.filter { it.name=="Adil" })
    println(paidList)

}
data class User (val id:Int, val name:String)
data class Paid (val id:Int, val name:String, val type:String)

fun isOdd(a: Int): Boolean {
    return a % 2 != 0
}

////extension function
//fun main() {
//    println("Hello i am a mobile app developer".formattedString())
//}
//fun String.formattedString():String{
//    return "------------------\n$this\n------------------"
//}
