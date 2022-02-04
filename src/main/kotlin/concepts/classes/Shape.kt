package basic.syntax.concepts.classes

open abstract class Shape(type:Int) {
    init{
        when(type){
            1-> println("The shape is a Rectangle")
            2->println("The shape is a Circle")
            3-> println("The shape is a square")
            else ->println("unknown shape")
        }
    }
    abstract fun calculateArea():Double


}

class Rectangle(w:Double,h:Double): Shape(1) {
    var width = w
    var height = h
    override fun calculateArea():Double{
        return width*height
    }
}