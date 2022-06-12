package collection

class Collection1 {
}

fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 53)
    println(set)
    println(set.javaClass)

    val list = arrayListOf<Int>(1, 7, 53)
    println(list)

    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(map)

    val strings = listOf<String>("first", "second", "third")
    println(strings.last())

    val numbers = setOf<Int>(1, 14, 2)
    println(numbers.javaClass)
    println(numbers.maxOrNull())
}