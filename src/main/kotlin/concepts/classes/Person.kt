package basic.syntax.concepts.classes

data class Person(val name:String, val age:Int){
    var gender :String = ""
}

fun getPerosn(obj:Person):Person{
    return Person(obj.name,obj.age)
}