package basic.syntax.idomis

fun learnKotlin(){
    val ints = listOf(1,-1,-8,5,7) //read only list
    val positives = ints.filter{it>0}
    for(x in positives)println(x)
    if(1 !in ints)println("Yes")


    val map = mapOf("a" to 1, "b" to 2, "c" to 3) //read only map
    for((key,value) in map)
        println("$key $value")
    println(map["a"])

    //Iterate for a range
    for (i in 1..100) { print(i) }  // closed range: includes 100
    println()
    for (i in 1 until 100) { print(i) } // half-open range: does not include 100
    println()
    for (x in 2..10 step 2) { print(x) }
    println()
    for (x in 10 downTo 1) { print(x) }
    println()
    (1..10).forEach { print(it) }


    //If-not-null shorthand
    println(map?.size) // size is printed if files is not null

    //If-not-null-else shorthand
    val a:Array<Int>? = null
    println(a?.size ?: "empty") // if files is null, this prints "empty"


   // Execute if not null
    val value:Int? = 5
    value?.let {
        println(it*5)
    }

    //Single-expression functions
    fun theAnswer(x:Int,y:Int) = x+y

    //Swap two variables
    var aa = 1
    var b = 2
    aa = b.also { b = aa }
    println("$b $aa")

}