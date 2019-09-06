package ChapterOne

fun main() {
    val question = "The Ultimate question of  life, the universe, and everything"
    val answer = 42
    val answerTwo: Int = 41

    val yearsToCompute= 7.5e6

    val init: Int /*Deve-se passar o tipo quando a variavel não tem um valor inicial*/

    init = 12

    message("nemo")
}

fun message(canPerformOperation: String) {
    val message: String

    if (canPerformOperation == "nemo") {
        println(message = "Success")
    } else {
        message = "Failed"
    }
}
