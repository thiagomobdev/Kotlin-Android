import kotlin.time.times

fun main(){
    // 1. Escreva um programa que exiba a frase "Kotlin é divertido!" três vezes seguidas.
    // 1. Write a program that displays the setence "kotlin is fun!" three times in a row.
    print("Enter numbers for display text: ")
    val numberText = readlnOrNull()?.toInt()
    if (numberText != null) for (i in 1..numberText) {
        if (numberText <= 3) {
            println("Kotlin is fun!")
        }
    }
    //2. Crie um programa que exiba uma tabela de multiplicação de 2 a 4.
    //2. Create a program that displays a table of multiplication of 2 at 4.
    print("Enter your number for multiplication: ")
    val numUser = readlnOrNull()?.toInt()

    fun multiplcation(number: Int) {
        val mult1 = number * 2
        val mult2 = number * 3
        val mult3 = number * 4
        println("$number * 2 = $mult1")
        println("$number * 3 = $mult2")
        println("$number * 4 = $mult3")
    }
    if (numUser != null) {
        multiplcation(numUser)
    }
    //3.Mostre os números de 1 a 10, um por linha.
    //3.Show the numbers 1 to 10 one per line
    var counterNum = 1
        for(i in 1 .. 10){
            println(counterNum++)
        }
    //4. Faça um programa que exiba os números de 1 a 100, mas pule múltiplos de 5.
    //4. Create a program that displays the numbers from 1 to 100, but skips multiples of 5.
    print("Enter the number start counter: ")
    var num1 = readlnOrNull()?.toInt()
    print("Enter the last number: ")
    val numLast = readlnOrNull()?.toInt()
    if (num1 != null) {
        while (num1 <= numLast!!) {
            if (num1 % 5 != 0) {
                println(num1)
            }
            num1++
        }
    }
    //5. Crie uma saída formatada para exibir informações de uma tabela fictícia (ex.: produtos e preços).
    //5. Create formatted output to display information from a fictional table( e.g products and prices )
    fun tableFake(product: String, values: Double){
        println("PRODUCT \t PRICES")
        println("$product \t R$ $values")

        tableFake("Rice", 7.99)

    }



    var contadorDePares = 0
    var numero = 1

    println("Numero\tQuadrado")
    println("----------------")
    while(contadorDePares < 10) {
        if(numero % 2 == 0) {
            val quadrado = numero * numero
            println("$numero \t   |      $quadrado")
            contadorDePares++
        }
        numero++
    }
    }
