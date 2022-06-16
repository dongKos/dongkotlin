package _4_classObjectInterface.property

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String): User
class SubscribingUser(val email: String): User {
    //커스텀 getter
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int): User {
    override val nickname = getFacebookName(accountId)
}

fun getFacebookName(accountId: Int): String = "facebookName"

fun main(args: Array<String>) {
    val pUser = PrivateUser("dongko@hpcnt.com")
    println(pUser.nickname)

    val sUser = SubscribingUser("dongko@hpcnt.com")
    println(sUser.nickname)
}
