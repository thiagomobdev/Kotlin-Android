fun main() {
    println("Digite a temperatura em Celsius:")
    val celsius = readLine()?.toDoubleOrNull() // Lê a temperatura em Celsius e converte para Double

    if (celsius != null) {
        val fahrenheit = (celsius * 9 / 5) + 32
        println("$celsius°C é igual a $fahrenheit°F")
    } else {
        println("Entrada inválida. Por favor, insira um número válido.")
    }
}
