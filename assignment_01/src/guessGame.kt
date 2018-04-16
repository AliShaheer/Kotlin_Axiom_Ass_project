import java.util.*

//computer generates random number num

//give user three chances to guess that number

//if user guess that number pring you win

//either print you loose

//give option to user do you want to play again

//if yes then starts the game again else exit the game

fun main(args: Array<String>){

    val boundaryNumber = 9
    val totalTurns = 3

    fun generateRandomNumber(): Int {
        val randomNumber = Random()
        val number = randomNumber.nextInt(boundaryNumber)
        return number
    }
    fun userInput(number:Int):Boolean {
        var match:Boolean = false

        val scanner = Scanner(System.`in`)
        val guessNumber = scanner.nextInt()
        if(guessNumber.equals(number))
        {
            match = true
        }
        return match
    }

    println("Guess Game")
    do {

        val number = generateRandomNumber()

        println("Total chances/turns = $totalTurns")

        for (i in 1..totalTurns) {
            println("Turn no $i , Enter Any Number b/w 0-$boundaryNumber")
            val match: Boolean = userInput(number)

            if (match == true) {
                println("Congrats, you win !!!")
                break
            } else {
                println("Wrong guess !!!")
            }
        }
        println("----------------------------------------------------------------------------------")
        println("----------------------------------------------------------------------------------")
        println("----------------------Press 'y' to play again !!! -------------------------------- ")
        val scanner = Scanner(System.`in`)
        val choice = scanner.next()
        println("----------------------------------------------------------------------------------")
        println("----------------------------------------------------------------------------------")

    }while(choice.equals("y") || choice.equals("Y") )
}