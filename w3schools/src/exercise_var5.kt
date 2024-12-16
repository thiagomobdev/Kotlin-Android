fun main(){
//Crie um programa que calcule a média de três notas usando variáveis.
    print("Digite a primeira nota: ")
    var nota1 = readlnOrNull()?.toDouble() ?: 0.0 // Se não foi digitado nada a variavel atribui o valor 0
    print("Digite a segunda nota: ")
    var nota2 = readlnOrNull()?.toDouble() ?: 0.0
    print("Digite a terceira nota: ")
    var nota3 = readlnOrNull()?.toDouble() ?: 0.0

    val media = (nota1 + nota2 + nota3) / 3
    println("Sua média é: %.2f".format(media))

}