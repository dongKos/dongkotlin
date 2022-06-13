package _3_function

class ExpansionCollection {
}

infix fun Any.to(other: Any) = Pair(this, other)
fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)

    val map = mapOf(1.to("one"), 2 to "two")
    println(map)

    val (number, name) = 1 to "one"
    println(number)
    println(name)


}