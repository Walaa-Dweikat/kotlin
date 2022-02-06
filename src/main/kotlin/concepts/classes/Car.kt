package concepts.classes

class Car (var brand: String, var model: String, var year: Int):MyInterface
{
    override val prop: Int=8
    override val propertyWithImplementation:String = "Welcome"

    fun drive(){
        println("Beeeeeb")
    }

    fun speed(maxSpeed:Double){
        println("max speed is = $maxSpeed")
    }


}