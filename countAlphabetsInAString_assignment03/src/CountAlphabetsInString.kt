import java.util.*
import kotlin.math.absoluteValue

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
    print("Enter any alphabet to know the occurence: ")
    println()
    var userInput = scanner.next()
    var findFrom = "hello world"
    var toFind = userInput.codePointAt(0).toString()
//    print(toFind)
    var count=0
    var length = findFrom.length-1
    for(i in 0..length){
//    println(toFind==findFrom.codePointAt(i.absoluteValue).toString())
        if(toFind==findFrom.codePointAt(i.absoluteValue).toString())
        {
            count++
        }
    }
    print("Total occurence: $count")


//    if(a=="104")
//    {
//        print("yes")
//    }

}