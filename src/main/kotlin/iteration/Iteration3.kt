fun isLetter(c: Char) : Boolean = c in 'a' .. 'z' || c in 'A' .. 'Z'
fun isNotDigit(c: Char) = c !in '0' .. '9'

fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a' .. 'z', in 'A' .. 'Z' -> "It's a letter!"
    else -> "wtf!?"
}
fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isNotDigit('X'))

    println(recognize('8'))
    println(recognize('ㅁ'))
}
