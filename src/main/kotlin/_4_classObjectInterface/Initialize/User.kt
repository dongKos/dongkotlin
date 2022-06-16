package _4_classObjectInterface.Initialize

//주 생성자
class User(val nickname: String)

class User2 constructor(_nickname: String) {
    val nickname: String

    //초기화 블록
    init {
        nickname = _nickname
    }
}

class User3 (_nickname: String) {
    val nickname = _nickname
}

class User4(val nickname: String)

//생성자 파라미터에 대한 디폴트값을 제공한다.
class User5(val nickname: String, val isSubscribed: Boolean = true)
fun main(args: Array<String>) {
    val me = User5("dongko")
    println(me.isSubscribed)

    val u = User5("donghwan", false)
    println(u.isSubscribed)

    val h = User5("boo", isSubscribed = false)
    println(h.isSubscribed)
}

