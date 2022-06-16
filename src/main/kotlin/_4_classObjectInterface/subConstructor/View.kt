package _4_classObjectInterface.subConstructor

import javax.naming.Context
import javax.swing.text.AttributeSet

open class View {

    constructor(cts: Context) {

    }
    constructor(ctx: Context, attr: AttributeSet) {

    }
}

class MyButton: View {
    constructor(ctx: Context) : super(ctx){

    }

    constructor(ctx: Context, attr: AttributeSet): super(ctx, attr) {

    }
}