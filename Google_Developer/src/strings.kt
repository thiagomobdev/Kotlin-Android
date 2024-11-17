fun main() {
    var discountPercentage: Int = 0
    var offer: String = " "
    val item = "Google ChromeCast"
    discountPercentage = 20
    offer = "Sale - Up $discountPercentage% discount on $item! Hurry up!"

    println(offer)

    //Concatenação de Strings
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfKids + numberOfAdults
    println("The total party size is: $total")
    //Formatar mensagem
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (Aditional Bonus).")
    // OPERAÇÕES MATEMATICAS
    print("Digite um numero: ")
    val firstNumber = readLine()?.toIntOrNull()
    print("Digite outro numero: ")
    val secondNumber = readLine()?.toIntOrNull()
    print("Digite o ultimo numero: ")
    val thirdNumber = readLine()?.toIntOrNull()

    val result = firstNumber?.let { add(it, secondNumber) }
    val anotherResult = firstNumber?.let { add(it, thirdNumber) }
    val resultSubtract = secondNumber?.let { subtract(firstNumber, it) }
    val anotherSubtract = thirdNumber?.let { subtract(firstNumber, it) }

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber - $secondNumber = $resultSubtract")
    println("$firstNumber - $thirdNumber = $anotherSubtract")
}


fun add(firstNumber: Int, secondNumber: Int?): Int {
return firstNumber + secondNumber!!
}
fun subtract(firstNumber: Int?, secondNumber: Int): Int? {
    return firstNumber?.minus(secondNumber)
}
