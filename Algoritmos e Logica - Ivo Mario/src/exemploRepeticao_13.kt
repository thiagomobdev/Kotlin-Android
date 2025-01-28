fun main() {
    print("Digite um numero inicial: ")
    var num = readlnOrNull()?.toInt()
    print("Digite um numero maior que o anterior: ")
    var num2 = readlnOrNull()?.toInt()

    if (num != null && num2 != null) {
        do {
            println(num)
            num++
        } while (num <= num2)
    }
}