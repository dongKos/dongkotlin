package _4_classObjectInterface.innerClassDuplicateClass

class Outer {

    inner class Inner {
        fun getOuterReference() : Outer = this@Outer
    }
}