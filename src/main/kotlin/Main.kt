fun main(args: Array<String>) {
    val likes = 11
    likesLocalization(likes)
}

fun likesLocalization(likes: Int){
    if (likes.mod(100) == 11)
        println("Понравилось $likes людям")
    else if (likes.mod(10) == 1)
        println("Понравилось $likes человеку")
    else if (likes.mod(1000) == 0)
        println("Понравилось $likes человек")
    else
        println("Понравилось $likes людям")
}
