fun main(){
//Implemente um programa que use variáveis para calcular o IMC (Índice de Massa Corporal).
    print("Digite seu peso: ")
    val peso = readlnOrNull()!!.toDouble()
    print("Digite sua altura: ")
    val altura = readlnOrNull()!!.toDouble()

    val imc = peso / (altura * altura)
    println("\tSeu IMC é: %.2f".format(imc))

   println(
       when{
           imc > 18.5 -> "Está abaixo do peso!"
           imc in 18.6 .. 24.9 -> "Seu peso está normal."
           imc in 25.0 .. 29.9 -> "Você está acima do peso."
           else -> "Você está obeso."
       }

   )


}