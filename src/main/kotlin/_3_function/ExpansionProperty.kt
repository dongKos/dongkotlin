package _3_function

class ExpansionProperty {
}

//확장 프로퍼티
val String.lastChar : Char
    get() = get(length -1)

//변경 가능한 확장 프로퍼티
var StringBuilder.lastChar: Char
    get() = get(length-1)
set(value: Char) {
    this.setCharAt(length -1, value)
}
fun main(args: Array<String>) {
    println("kotlin".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}