data class Person(private var name: String, private var age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))

}

fun comparePeople(): Boolean {
    val p2 = Person("Alice", 29)
    val p1 = Person("Alice", 29)
    println(p1)
    println(p2)

    return p1 == p2  // should be true
}

fun main() {
    comparePeople()
}