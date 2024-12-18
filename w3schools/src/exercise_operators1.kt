fun main(){
//Faça um programa que calcule a área de um quadrado dado o comprimento do lado.
    print("Digite o comprimento do lado do quadrado: ")
    val lado = readlnOrNull()!!.toDouble()

    val area = lado * lado
    println("A area do quadrado é: $area")
}