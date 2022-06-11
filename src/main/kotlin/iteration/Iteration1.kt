package iteration

fun fizzbuzz(num: Int) =
    when {
        num % 15 == 0 -> "Fizz Buzz!"
        num % 3 == 0 -> "Fizz!"
        num % 5 == 0 -> "Buzz!"
        else -> "$num"
    }
//num in 100 downTo 1 step 2
fun main(args: Array<String>) {
    for(num in 100 downTo 1 step 2)
        println( fizzbuzz(num))

    for(x in 0 until 10)
        println(fizzbuzz(x))
}