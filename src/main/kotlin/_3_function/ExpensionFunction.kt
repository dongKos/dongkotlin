package _3_function

class ExpensionFunction {
}

//확장함수
fun String.lastChar(): Char = this.get(this.length-1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}