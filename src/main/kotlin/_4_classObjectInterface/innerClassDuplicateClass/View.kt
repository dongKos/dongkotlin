package _4_classObjectInterface.innerClassDuplicateClass

interface State: java.io.Serializable

interface View {
    fun getCurrentState() : State
    fun restoreState(state: State) {}
}