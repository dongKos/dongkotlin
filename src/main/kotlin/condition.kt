class Main {

}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
fun eval(e: Expr): Int =
    when(e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
        else -> throw java.lang.IllegalArgumentException("u p")
    }
fun main(args: Array<String>) {
    val result = Sum(Sum(Num(1), Num(2)), Num(4))
    println(eval(result))
}
