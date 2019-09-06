package ChapterOne

fun main() {
    println(max(10, 5))

    println(max(5, 15))

    println(maxShort(25, 20))
    println(maxShort(25, 35))

    println(maxSmall(40, 30))
    println(maxSmall(30, 50))
}

fun max(a: Int, b: Int /*Parametros*/): Int /*Tipo de retorno*/ {
    return if (a > b) a else b /*corpo da função*/
}

fun maxShort(a: Int, b: Int): Int = if (a > b) a else b

fun maxSmall(a: Int, b: Int) = if (a > b) a else b
/*type inference = Inferência de tipo irá retornar o tipo mesmo não sendo explicitado. Somente em funções com
 um corpo de expressão. Funções com corpo de Bloco precisam de return */