package _4_classObjectInterface.classDelegation

class DelegatingCollection<T> (
    innerList: Collection<T> = ArrayList<T> ()
): Collection<T> by innerList {}