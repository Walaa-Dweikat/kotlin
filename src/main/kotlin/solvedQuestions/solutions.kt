package basic.syntax.solvedQuestions

//add two integers
fun addIntegers(x:Int,y:Int):Int = x+y

//multiply two floatings
fun multFloats(x:Float,y:Float):Float = x*y

//compute the Quotient  and Reminder
data class Div(val quotient:Int, val reminder:Int)
fun  calculateQandR(x:Int,y:Int):Div = Div(x/y,x-(y*(x/y)))

//find the frequency of a character in a string
fun findFreq(str:String,char:Char):Int{
    if(!str.contains(char.toLowerCase()) && !str.contains(char.toUpperCase()))return 0
    var freq = 0
    for(element in str){
        if(element == char.toUpperCase() || element==char.toLowerCase())freq++;
    }
    return freq
}

//even or odd number
fun evenOrOdd(x:Int):String = when(x%2){
    1 ->  "Odd"
    0 -> "Even"
    else -> "unknown"
}

//The largest number
fun findMax(list:List<Int>):Int{
    var max:Int = list[0]
    for(element in list){
        if(element > max)max=element
    }
    return max
}

//leap year
fun isLeapyear(year:Int):Boolean = when(year%4){
    0 -> true
    else -> false
}

//Positive or negative
fun positiveOrNegative(x:Int) = when(x>0){
    true ->"positive"
    else -> "negative"

}


//is Alphabet
fun isAlphabet(x:Char)= when(x){
    in 'a'..'z' ->true
    in 'A' .. 'Z' -> true
    else ->false
}

//the sum of natural numbers
 fun sumOfNaturalNumbers(upper:Int):Int {
     var sum=0
     for(i in 0..upper)
       sum+=i
     return sum
}

//factorial
tailrec fun findFactorial(x:Int,factorial:Int = 1):Int{
    return if(x==1)factorial else findFactorial(x - 1, factorial * x)
}

//vowel or constant
fun vowelOrConstant(c:Char)=when(c){
    'o' -> "vowel"
    'O' -> "vowel"
    'a' -> "vowel"
    'A' -> "vowel"
    'E' -> "vowel"
    'e' -> "vowel"
    'i' -> "vowel"
    'I' -> "vowel"
    'u' -> "vowel"
    'U' -> "vowel"
    else->"constant"
}

//Fibonacci  series
tailrec fun fibonacciSeries(i:Int=1,i2:Int=1,limit:Int){
    print("$i,")
    if(limit==1){
        print("$i2")
        return
    }
    var x = i2
    var y = i+i2
    fibonacciSeries(x,y,limit-1)

}

//convert from birary to decimal
fun convertBinaryToDecimal(x:Int): Double {
    var i = 0.0
    var decimal = 0.0
    var binary = x
    while(binary>0){
        var y = binary%10
        decimal+=Math.pow(2.0,i)*y
        binary/=10
        i++;
    }
    return decimal
}

//convert decimal to binary
fun convertDecimalToBinary(x:Int):String{
    var binary:String = ""
    var decimal = x
    var reminder = 0
    while(decimal>0){
        reminder = decimal%2
        decimal/=2
        binary+=reminder
    }
    return binary.reversed()
}

//find a specific element in an array
fun <T> finaElement(arr:Array<T>,element:T):Boolean{
   for(arrElement in arr){
       if(arrElement == element )return true
   }
    return false
}

//join two lists together
//fun <T> joinTwoLists(list1:List<T>,list2:List<T>):List<T>{
//    val list:List<T>
//    list.
//
//
//}