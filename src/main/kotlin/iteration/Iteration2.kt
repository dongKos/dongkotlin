package iteration

import java.util.TreeMap

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    for(c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for((k, v) in binaryReps) {
        println("$k = $v")
    }

    val list = arrayListOf("10", "11", "1001")
    for((i, e) in list.withIndex())
        println("$i: $e")


}