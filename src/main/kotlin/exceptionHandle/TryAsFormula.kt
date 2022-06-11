package exceptionHandle

import java.io.BufferedReader
import java.io.StringReader

fun readNumber2(reader: BufferedReader)  {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch(e: NumberFormatException) {
        null
    }
    println(number)
}
fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("Not a Number"))
    readNumber2(reader)
}