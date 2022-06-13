package _3_function

class Split {
}

fun parsePath(path : String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir : $directory, name : $fileName, ext : $extension")
}

fun main(args: Array<String>) {
    val strToSplit = "12.345-6.A"
    println(strToSplit.split(".", "-"))
    println(strToSplit.split("."))


    parsePath("/users/dongko/dongkotlin/dongKotlin.kt")

    val kotlinLogo =
        """| //
          .| //
          .|/\"""
    println(kotlinLogo)
    println(kotlinLogo.trimMargin("."))
}