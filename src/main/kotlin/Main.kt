package basic.syntax
import basic.syntax.concepts.classes.Person
import basic.syntax.concepts.classes.getPerosn
import concepts.classes.*
fun main() {
//    println("Walaa")
//
//    integers();
//    floatingPoints()
//    val i = 1
//    val d = 1.0
//    val f = 1.0f
//    printDouble(d)
    //printDouble(i) // Error: Type mismatch
    //printDouble(f) // Error: Type mismatch
    // strings()
    //func()
    //function()
//  val result = re(repeatFunction,"walaa ",5)
//
//
//  println("Walaa ".plus("Dweikat"))
 // val (name, age) = getPerosn("Jack",30)

  val jack = Person("Jack",1)
  jack.gender="male"
  val olderJack = jack.copy(age=2)
  //val (name, age) = getPerosn(olderJack)
  val (name,age) = olderJack

  println(olderJack.gender) //empty string




}


