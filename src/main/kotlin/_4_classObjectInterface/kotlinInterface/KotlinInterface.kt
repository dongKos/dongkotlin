package _4_classObjectInterface.kotlinInterface

interface Clickable {
    fun click()

    fun showOff() = println("Hey I'm Clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("Hey I'm Focusable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I'm clicked!")
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    val btn = Button()
    btn.click()
    btn.setFocus(true)
    btn.setFocus(false)
    btn.showOff()
}

