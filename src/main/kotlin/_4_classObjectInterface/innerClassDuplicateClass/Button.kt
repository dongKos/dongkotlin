package _4_classObjectInterface.innerClassDuplicateClass

class Button: View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

    class ButtonState: State {}
}