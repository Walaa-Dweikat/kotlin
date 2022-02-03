package concepts.controlFlow

fun function(){
    val a = 10;
    val b = 69
// With else
    val max1: Int
    if (a > b) {
        println("Choose a")
        max1 = a
    } else {
        println("Choose b")
        max1 = b
    }

// As expression
    val max = if (a > b) a else b

    println(max)

    when(max){
        1->println("max = 1")
        2->println("max = 2")
        else ->println("max = $max")
    }
//
//    for (i in 1..3) {
//        println(i)
//    }
//    for (i in 6 downTo 0 step 2) {
//        println(i)
//    }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            println(j)
            if (j == 5) break
        }
        if(i==5)break;
    }
}