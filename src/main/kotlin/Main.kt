package basic.syntax
fun main() {
    println("Walaa")
    println(sum(7,8));
    println(mult());
}
fun sum(a:Int, b:Int):Int{
    return a+b;
}

fun mult(a:Int =10, b:Int=5):Int{
    return a*b;
}