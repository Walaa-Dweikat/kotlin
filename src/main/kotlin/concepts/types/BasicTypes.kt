package concepts.types

fun integers() {
    //Integers
    val one = 1 // Int
    //print(one);
    val threeBillion = 3000000000 // Long
    //print(threeBillion);
    val oneLong = 1L // Long
   // print(oneLong);
    val oneByte: Byte = 1
    //println(oneByte);

    val b: Int = 10000
    val boxedA: Int? = b
    val anotherBoxedA: Int? = b
    //println(boxedA === anotherBoxedA)

    val c: Int = 10000
    val boxedB: Int? = c
    val anotherBoxedB: Int? = c
    //println(boxedB == anotherBoxedB) // Prints 'true'

    val x = 8.2
    val y = 10.9
    val z = 9.8
    println(z !in x..y)
}

fun floatingPoints(){
    //Floating points
    val pi = 3.14 // Double
    // val one: Double = 1 // Error: type mismatch
    val oneDouble = 1.0 // Double
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f// Float, actual value is 2.7182817
    println(eFloat);
}

fun characters(){
    val a :Char='9'
    println(a.digitToInt())
}

fun strings(){
    val s :String = "Kotlin"
    for(c in s){
        print(c)
    }

    println()
    println(s+986+true)

    val ss :String = """
        Welcome 
        to 
        Palestinge
    """.trimIndent()
    val sss = "new\nline"

    println(ss)
    println(sss)

    val i :Int = 8
    println("i=$i")

    val price = """
${'$'}_9.99
"""

    println(price)

}

fun printDouble(d: Double) { print(d) }

















