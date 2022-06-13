package collection

class Override {
}

open class View {
    open fun click() = println("view Clicked")
}

class Button: View() {
    override fun click() = println("Button Cliked")
}

fun View.showOff() = println("I'm a View!")
fun Button.showOff() = println("I'm a Button!")
fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    view.showOff()
}