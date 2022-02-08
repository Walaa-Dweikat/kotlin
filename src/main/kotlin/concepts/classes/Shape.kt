package concepts.classes

open abstract class Shape(_type:Int) {
    private val type = _type
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

open class Rectangle(_width:Double,_height:Double): Shape(1) {
    init{
        println("Rectangle")
    }

    var width = _width
    var height = _height


    override fun calculateArea():Double{
        return width*height
    }
}



