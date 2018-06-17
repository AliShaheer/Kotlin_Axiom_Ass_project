//# Task 1  .. arithmetic functions using infix functions
infix fun Int.addTwoNumbs(numb:Int):Int = this + numb
infix fun Int.subtractTwoNums(numb:Int) = this - numb
infix fun Int.multiplyTwoNumbs(numb:Int):Int = this*numb
infix fun Int.divideTwoNumbs(numb:Int) = this/numb


//# Task 2 .. take power of the number
infix fun Int.calculatePower(numb:Int) :Int {
    var num = this
    for(i in 1 until numb){
        num *= this
    }
    return num
}

fun main(args: Array<String>) {
    //Task 1 of infix functions
    var num = 5
    num addTwoNumbs 2
    num subtractTwoNums 1
    num multiplyTwoNumbs 2
    num divideTwoNumbs 2

    //Task 2 calculate power
    print(num calculatePower 3)
}