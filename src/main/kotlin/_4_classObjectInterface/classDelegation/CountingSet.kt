package _4_classObjectInterface.classDelegation

//by 키워드로 MutableCollection의 구현 책임을 innerSet에게 위임한다.
class CountingSet<T> (
    val innerSet: MutableCollection<T> = HashSet<T> ()
) : MutableCollection<T> by innerSet {
    var objectAdded = 0;
    override fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectAdded++
        return innerSet.addAll(c)
    }
}

fun main(args: Array<String>) {
    val cset = CountingSet<Int> ()
    cset.addAll(listOf(1,1,3))
    println("${cset.objectAdded} objects are added, ${cset.size} remain")
}