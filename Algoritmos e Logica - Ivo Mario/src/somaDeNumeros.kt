fun main(){
    println("Programa que soma dois numeros.")
    print("Digite um numero: ")
    val numero1 = readlnOrNull()?.toInt()
    print("Digite um segundo numero: ")
    val numero2 = readlnOrNull()?.toInt()
    val soma = numero1!! + numero2!!
    println("A soma do numero $numero1 e $numero2 é: $soma")

}

//página 106 do livro.