fun main() {
    var soma = 0 // Inicializa a variável soma com 0
    var num: Int // Declara a variável num

    println("Entre com um número par inteiro: ")
    num = readLine()?.toIntOrNull() ?: 0 // Lê o primeiro número

    while (num % 2 == 0) { // Enquanto o número for par
        soma += num // Adiciona o número à soma
        println("Entre com um número par inteiro: ")
        num = readLine()?.toIntOrNull() ?: 0 // Lê o próximo número
    }

    println(" --> A soma dos números digitados é: $soma")
}