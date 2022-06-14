package _4_classObjectInterface.openFinalAbstract

import _4_classObjectInterface.kotlinInterface.Clickable

open class RichButton : Clickable {
    //파이널 - 하위클래스에서 상속불가
    fun disable() {}

    //상속가능
    open fun animate() {}

    //오버라이드한 함수는 기본적으로 열려있음 -final 붙여서 막을 수도 있음
    final override fun click() {}

}
