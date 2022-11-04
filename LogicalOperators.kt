//Logical Operator

fun main() {
    val isAbove50 = true
    val knowsPrograming = true
    //AND
    var calledForInterview = isAbove50 && knowsPrograming
    println(calledForInterview)
    //OR
    calledForInterview = isAbove50 || knowsPrograming
    println(calledForInterview)

    //Short Circuiting
    var i = 10
    var j = 11
    var check =
        i == 10 || j++ == 11 //(short circuit bcz in or condition if checks first condition if that is true then it wont check second condition )
    println(i)//10
    println(j)//11
    check = i == 11 || j++ == 11
    println(i)
    println(j)
}