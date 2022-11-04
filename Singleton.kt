//Singleton Object
object sharingWidget {
    private var twitterLikes = 0
    private var facebookLikes = 0
    fun twitterInc() = twitterLikes++
    fun facebookInc() = facebookLikes++
    fun display() = println("Twitter has $twitterLikes likes and Facebook has $facebookLikes likes")
}

fun main() {
    sharingWidget.twitterInc()
    sharingWidget.twitterInc()
    sharingWidget.twitterInc()
    sharingWidget.facebookInc()
    sharingWidget.facebookInc()
    sharingWidget.display()
}
