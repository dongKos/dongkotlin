package _4_classObjectInterface.property.getset

class User(val name: String) {
    var address: String = "unspecified"
        //추가 로직을 실행하기 위해 만든 커스텀 setter
        set(value: String) {
            println("""
               Address was changed for $name:
                $field -> $value
            """.trimIndent())
            field = value
        }
    var dongko: String = "dongko"
}

fun main(args: Array<String>) {
    val user = User("dongko")
    user.address = "dongko house in gwang myeong"
    user.dongko = "donghwan"

}