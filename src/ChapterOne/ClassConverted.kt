package ChapterOne

class Person(val name: String, var isMarried: Boolean)

class Rectangle(val height: Int, val with: Int) {
    val isSquare: Boolean
    get() { // getter
        return height == with
    }
}

fun main() {
    val person = Person("bubba", true)
    println(person.name) //getter
    println(person.isMarried) //getter

    person.isMarried = false //setter
    println(person.isMarried)

    val rectangle = Rectangle(10, 10)
    println(rectangle.isSquare)
}
