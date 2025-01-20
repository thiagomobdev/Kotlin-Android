
fun main() {
    // Solicita ao usuário que digite os operandos e o operador
    print("Digite o primeiro operando: ")
    val operando1 = readlnOrNull()?.toDoubleOrNull() ?: return println("Operando inválido")

    print("Digite o segundo operando: ")
    val operando2 = readlnOrNull()?.toDoubleOrNull() ?: return println("Operando inválido")

    print("Digite o operador (+, -, *, /): ")
    val operador = readlnOrNull()?.firstOrNull() ?: return println("Operador inválido")

    // Realiza a operação com base no operador fornecido
    when (operador) {
        '+' -> println("= ${operando1 + operando2}")
        '-' -> println("= ${operando1 - operando2}")
        '*' -> println("= ${operando1 * operando2}")
        '/' -> {
            if (operando2 != 0.0) {
                println("= ${operando1 / operando2}")
            } else {
                println("Divisão por zero não é permitida")
            }
        }
        else -> {
            println()
            println("...Operador inválido...")
        }
    }
}

//Abaixo e meu código, acima é o código gerado pelo github copilot.

//fun main(){
//    println("#####  CALCULADORA #####")
//    print("Digite o primeiro numero: ")
//    var numero1 = readlnOrNull()?.toInt()
//    print("Digite o segundo numero: ")
//    var numero2 = readlnOrNull()?.toInt()
//    print("Digite um operador (+ , * , / , - : ")
//    val operador = readlnOrNull()?.firstOrNull()
//
//    when(operador){
//        '+' -> println("Soma = ${numero1!! + numero2!!}")
//        '*' -> println("Multiplicação = ${numero1!! * numero2!!}")
//        '/' -> println("Divisão = ${numero1!! / numero2!!}")
//        '-' -> println("Subtração = ${numero1!! - numero2!!}")
//        else -> println("Operador invalido.")
//    }
//
//}