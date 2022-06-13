package _3_function

class LocalFunction {
}

class User(val id: Int, val name: String, val address: String)

//fun saveUser(user: User) {
//    if(user.name.isEmpty()) {
//        throw IllegalArgumentException("Can't save user ${user.id}: empty Name!")
//    }
//    if(user.address.isEmpty()) {
//        throw IllegalArgumentException("Can't save user ${user.id}: empty Address!")
//    }
//}

//로컬 함수를 사용해서 코드 중복 줄이기
fun saveUser(user: User) {
    fun validate(user: User,
                    value: String,
                    fieldName: String) {
        if(value.isEmpty()) throw IllegalArgumentException("Can't save user ${user.id} : empty $fieldName!")
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

//검증 로직을 확장 함수로 추출하기
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()) throw IllegalArgumentException("Can't save user $id: empty $fieldName")
    }

    validate(name, "Name")
    validate(address, "Address")
    println("user : $id saved!")
}
fun main(args: Array<String>) {
    try {
        saveUser(User(1, "", "street"))
    } catch(e: Exception) {
        e.printStackTrace()
    }
    val user: User = User(2, "dongko", "Address")
    user.validateBeforeSave()
}