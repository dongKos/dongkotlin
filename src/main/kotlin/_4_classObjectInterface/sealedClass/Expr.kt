package _4_classObjectInterface.sealedClass

//sealed class 를 사용한 경우 when 절에서 else 처리를 할 필요가 없다
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
//    class ppap(): Expr()
}

fun eval(e: Expr) : Int =
    when(e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
    }