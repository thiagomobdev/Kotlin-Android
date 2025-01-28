fun main() {
    var num = 1
    var soma = 0
    val input: Int
    print("Digite um numero inteiro: ")
    input = readlnOrNull()?.toInt()!!
    do {
        println(num)
        soma += num
        num++
    } while (num <= input)
        println("-->> A soma total dos numeros = $soma")

}