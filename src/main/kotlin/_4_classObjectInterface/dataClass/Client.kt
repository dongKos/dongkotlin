package _4_classObjectInterface.dataClass

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"

    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Client)
            return false
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode

    fun copy(name: String = this.name,
            postalCode: Int = this.postalCode) =
        Client(name, postalCode)
}

fun main(args: Array<String>) {
    val client1 = Client("dongko", 163446)
    val client2 = Client("dongko", postalCode = 163446)
//    println(client1)
//    print(client1 == client2)
    val processed = hashSetOf(Client("dongko", 4122))

    //equals가 true인 두 객체는 반드시 같은 hashCode()값을 반환해야한다
    println(processed.contains(Client("dongko", 4122)))

    val client3 = Client("김동환", 12345)
    println(client3.copy())
    println(client3.copy(postalCode = 54321))

    println(client3.copy() == client3.copy("김동환", 12345))



}