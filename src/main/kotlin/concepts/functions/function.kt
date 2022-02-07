package concepts.functions

fun mult(x:Int,y:Int):Int = x*y //Single-expression functions


fun asList(vararg ts: Int) {
    for(x in ts){
        println(x)
    }
}

infix fun Int.add(x: Int): Int {  //infix function
    var i = this
    return i+x
}

tailrec fun findFactorial(x:Int,factorial:Int = 1):Int{
    return if(x==1)factorial else findFactorial(x - 1, factorial * x)
}
