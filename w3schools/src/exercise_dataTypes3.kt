fun main(){
//Faça um programa que leia o peso de uma pessoa como string e o converta para Double.
print("Digite seu peso: ")
    var pesoKg = readlnOrNull()
    println("Tipo da variavel recebida: ${pesoKg!!::class.java.simpleName}")

    println("Tipo da variavel convertida: ${pesoKg.toDouble()::class.java.simpleName}")
}