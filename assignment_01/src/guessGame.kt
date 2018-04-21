import java.util.*

//computer generates random number num

//give user three chances to guess that number

//if user guess that number pring you win

//either print you loose

//give option to user do you want to play again

//if yes then starts the game again else exit the game

fun main(args: Array<String>) {

    val boundaryNumber = 9 // Boundary num to take generate numbers
    val totalTurns = 3 // Total turns of user

    fun generateRandomNumber(): Int {   // function to generate number
        val randomNumber = Random()
        val number = randomNumber.nextInt(boundaryNumber)
//        println("Random Number-> $number")
        return number
    }

    fun userInput(number: Int): Boolean {  // function to take user input and if it matched with random number, return true if matched else false
        var match: Boolean = false

        var scanner = Scanner(System.`in`)

        while (!scanner.hasNextInt()) {   // only accept "int" input
            print("Wrong Input, Enter Again: ")
            scanner = Scanner(System.`in`)

        }
        val guessNumber: Int = scanner.nextInt()


        if (guessNumber.equals(number)) {
            match = true
        }
        return match
    }

    println("Guess Game")
    do {

        val number = generateRandomNumber()

        println("Total chances/turns = $totalTurns") //total turns =3

        for (i in 1..totalTurns) {
            println("Turn no $i , Enter Any Number b/w 0-$boundaryNumber") //boundary =9
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

    } while (choice.equals("y") || choice.equals("Y"))
}