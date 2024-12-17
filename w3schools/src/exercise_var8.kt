fun main(){
//Crie um programa que receba variáveis do tipo Double e arredonde-as para duas casas decimais.
    print("Digite um numero com casas decimais longas: ")
    val num = readlnOrNull()!!.toDouble()
    print("Qual e o numero de PI completo?: ")
    val num2 = readlnOrNull()!!.toDouble()

    println("Voce digitou: $num - Numero arredondado: %.2f".format(num))
    println("Voce digitou: $num2 - Numero arredondado: %.2f".format(num2))

}