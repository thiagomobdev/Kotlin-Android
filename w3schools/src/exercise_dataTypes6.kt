fun main(){
//Faça um programa que leia um número decimal e exiba apenas a parte inteira.
    print("Digite um numero decimal: ")
    val numInput = readlnOrNull()!!.toDouble()

    if (numInput != null) {
        println("O numero[$numInput] convertido para Inteiro é: [${numInput.toInt()}]")
    }
}