import com.sun.org.apache.xerces.internal.xs.StringList
import com.sun.xml.internal.fastinfoset.util.StringArray
import kotlin.math.absoluteValue

//Task 1
fun String.printString() {  // Extension function to print the string # Task 1
    println(this)
}

//Task 2
fun String.printHalfStringAndReturn() : String { // Extension function to print half string and return the string # Task 2
    var halfString = this.substring(0, this.length / 2)
    println(halfString)
    return halfString
}

//Task 3
fun String.concatString(concatString:String) : String{  //Extension function to concat the string # Task 3
    var concatenatedString = this + concatString
    print("$concatenatedString")
    return concatenatedString
}

//Task 4
fun Int.sumOfTwoNumbs(number:Int)  = this + number // Extension function to perform addition of two nums and return num #Task 4

//Task 5
fun Int.subtractionOfTwoNumbs(number:Int) = this - number // #Task 5

fun Int.divideBy(number:Int) = this/number // #Task 5

fun Int.multiply(number:Int) = this* number //  #Task 5

//Task 6
fun IntArray.addNumToEachElement(number:Int) : IntArray { //Extension function to perform addition on each element of int array # Task 6
    for(i in 0 until this.size)
    {
        this[i] = this[i] + number
    }
    return this
}

fun IntArray.subtractNumFromEachElement(number:Int) : IntArray { //Extension function to perform subtraction on each element of int array # Task 6
    for(i in 0 until this.size)
    {
        this[i] = this[i] - number
    }
    return this
}

fun IntArray.multiplyNumToEachElement(number:Int) : IntArray { //Extension function to perform multiplication on each element of int array # Task 6
    for(i in 0 until this.size)
    {
        this[i] = this[i] * number
    }
    return this
}

fun IntArray.divideNumFromEachElement(number:Int) : IntArray { //Extension function to perform division on each element of int array # Task 6
    for(i in 0 until this.size)
    {
        this[i] = this[i] / number
    }
    return this
}
//Task 7 .. split string into string array on space basis
fun splitStringOnSpaceBasis(sentence:String,splitOn:String) : List<String>
{
    var arrayList: List<String> = sentence.split(splitOn)
    return arrayList
}

//Task 8 .. count number of alphabets in any string
fun String.countNoOfAlphabets():Int
{
    var count = 0
    for (q in 0 until this.length) {
        if(this[q.absoluteValue] in 'A'..'Z' || this[q.absoluteValue] in 'a'..'z')
        {
            count++
        }
    }
    return count
}


fun main(args: Array<String>) {
// #Task 1 .. print any string

    var name = "ali"
    name.printString()  // #Task 1 , print the string

// #Task 2 .. half the length of string

    var halfLengthString: String   // #Task 2 , print and return half length of the string
    halfLengthString = if(name.length!=1){
        name.printHalfStringAndReturn()
    }else{
        name
    }
    println(halfLengthString)           // End Of #Task 2

// #Task 3 .. perform concatenation on any string

    println(name.concatString(" is my name")) // #Task 3  , print and return concat string

// #Task 4 .. perform sum operation on any number

    var num = 10

    var sum = num.sumOfTwoNumbs(45) // #Task 4, take number as parameter and return sum of nums
    println("sum is: $sum")

// #Task 5  .. perform arithmetic operations on any number

    var subtract = num.subtractionOfTwoNumbs(4) // #Task 5 , perform subtraction
    println("subtraction func returns:  is $subtract")

    var divide = num.divideBy(2)   // #Task 5 , perform division
    println("division func returns:  is $divide")

    var multiply = num.multiply(9) // #Task 5 , perform multiplication
    println("multiply func returns:  is $multiply")

// #Task 6   .. perform arithmetic operations on int array

    var array = intArrayOf(1,2,3,4) // #Task 6 , perform addition on each element of array
    array = array.addNumToEachElement(1)
    for (i in array) {
        println("addition at index ${i.absoluteValue} is: $i")
    }

    array = array.subtractNumFromEachElement(1)  // #Task 6 , perform subtraction on each element of array
    for (i in array) {
        println("Subtraction at index ${i.absoluteValue} is: $i")
    }

    array = array.multiplyNumToEachElement(2)  // #Task 6 , perform subtraction on each element of array
    for (i in array) {
        println("multiplication at index ${i.absoluteValue} is: $i")
    }

    array = array.divideNumFromEachElement(1)  // #Task 6 , perform subtraction on each element of array
    for (i in array) {
        println("division at index ${i.absoluteValue} is: $i")
    }

// #Task7 .. split string into string List on the basis of space
    var sentence = "hello world. of. technology"
    var sentenceToSplitOnComma = "hello,world,of,technology"
    var sentenceToSplitOnNextLine = "we are writing a \n sentence on next line"

    var stringArray = splitStringOnSpaceBasis(sentence," ")
    print("on space basis:")
    for (s in stringArray) {
        println(s)
    }
    stringArray = splitStringOnSpaceBasis(sentenceToSplitOnComma,",")
    print("on Comma basis:")
    for (s in stringArray) {
        println(s)
    }
    stringArray = splitStringOnSpaceBasis(sentence,".")
    print("on full stop basis:")
    for (s in stringArray) {
        println(s)
    }
    stringArray = splitStringOnSpaceBasis(sentenceToSplitOnNextLine,"/n")
    print("on next line basis:")
    for (s in stringArray) {
        println(s)
    }


// #Task 8 .. count number of alphabets in string
     var numOfAlphabets = name.countNoOfAlphabets()
     println(numOfAlphabets)
}