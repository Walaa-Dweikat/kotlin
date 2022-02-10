package concepts.functions

import java.lang.module.FindException

fun mult(x:Int,y:Int):Int = x*y //Single-expression functions


fun asList(vararg ts: Int) {
    for(x in ts){
        println(x)
    }
}

infix fun Int.add(x: Int): Int {  //infix function
    return this+x
}

tailrec fun findFactorial(x:Int,factorial:Int = 1):Int{
    return if(x==1)factorial else findFactorial(x - 1, factorial * x)
}

val a = {i:Int -> i*i} //lambda expression

val repeatFunction: (String,Int) -> String = { str,times,->str.repeat(times) }
fun re( f:(String, Int) -> String, a:String, b:Int)
{
    println(f(a,b))
}


val stringPlus:String.(String)->String = String::plus


//operator overloading
data class Point(var x:Int, var y:Int)
operator fun Point.unaryMinus() = Point(-x, -y)
operator fun Point.inc() = Point(x++,y++)

data class Counter(val dayIndex: Int) {
    operator fun plus(increment: Int): Counter {
        return Counter(dayIndex + increment)
    }
}