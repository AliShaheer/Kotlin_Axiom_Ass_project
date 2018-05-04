import java.util.*

fun main(args: Array<String>) {
    //number to words conversion
    //string array= 1,2,3,4,5,6,7,8,9 .. 11,12,13,14,15,16,17,18,19  ..10,20,30,40,50,60,70,80,90,100 ..
    do{
        val numInWordsOneToNine = arrayOf("one","two","three","four","five","six","seven","eight","nine")
        val numInwWordsElevenToNineteen = arrayOf("eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","nineteen")
        val numInWordsTenToHundred = arrayOf("ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred")
        println("Enter any number b/w 1-100")

        var scanner = Scanner(System.`in`)
        while (!scanner.hasNextInt()){
            println("Invalid input,Enter Again")
            scanner = Scanner(System.`in`)
        }

        var a= scanner.nextInt()
        when {
            a == 0 -> println("zero")
            a in 1..9 -> println(numInWordsOneToNine[a-1])
            a in 11..19 -> println(numInwWordsElevenToNineteen[a-11])
            a%10==0 -> println(numInWordsTenToHundred[(a/10)-1])
            a>20 -> {
                var num1 = (a / 10) - 1
                var num2 = (a % 10) - 1

                print(numInWordsTenToHundred[num1] + "-" + numInWordsOneToNine[num2])
            }
        }
        println()
        println("To continue press 'y'")
        var input = scanner.next()
    }while (input.equals("y"))
}