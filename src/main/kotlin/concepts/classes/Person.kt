package basic.syntax.concepts.classes

data class Person(val name:String, val age:Int)

fun getPerosn(name: String,age: Int):Person{
    return Person(name,age)
}