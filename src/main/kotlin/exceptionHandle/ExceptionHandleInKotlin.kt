fun main(args: Array<String>) {
    val number = 1000
    println( isNumberIn0To100(number))
}

private fun isNumberIn0To100(number: Int) : Boolean {
    val precentage =
        if (number in 0..100)
            true
        else
            throw IllegalArgumentException("no way!")
    return precentage
}
