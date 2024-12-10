fun main() {
//    print("Digite o primeiro numero: ")
//    val num1 = readLine()?.toIntOrNull()
//    print("Digite o segundo numero: ")
//    val num2 = readLine()?.toIntOrNull()
//    val resultado = if(num1 != null && num2 != null){
//        somar(num1, num2)
//    }else {
//        null
//    }
//    print("A soma $num1 e $num2 é: $resultado")
//}
    print("Digite um numero: ")
    val num1 = readlnOrNull()?.toIntOrNull()
    print("Digite outro numero: ")
    val num2 = readlnOrNull()?.toIntOrNull()
    val resultado = if(num1 != null && num2 != null){
        somar(num1, num2)
    } else {
        print("Desculpa, voce digitou algo errado.")
    }
    imprimirTexto("A soma de $num1 e $num2 é: $resultado")
}

    fun imprimirTexto(texto: String): Unit {
        println(texto)
    }

    fun somar(n1: Int, n2: Int): Int {
        return n1 + n2
    }
