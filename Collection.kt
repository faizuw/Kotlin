//list
fun main() {
    var arr = mutableListOf<Int>(1, 2, 3)
    println("before modifying $arr")
    arr[0] = 4
    println("After modifying $arr")
    println(arr.indexOf(3)) //index of element 3 is 2
    println(arr.contains(4))
    arr.remove(2)
    println(arr)

    var arr2 = mutableListOf<Int>(12, 19)
    arr.addAll(arr2)
    println(arr)
}

