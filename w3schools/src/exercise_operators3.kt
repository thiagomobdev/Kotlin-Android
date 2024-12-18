fun main(){
//Crie um programa que calcule o desconto de 10% sobre um preço dado.
    print("Digite o preço do produto: ")
    val preco = readlnOrNull()!!.toDouble()

    val desconto = preco * 0.10
    val precoDesc = preco - desconto
    println("10% de desconto sobre R$ $preco é: $desconto%")
    println("O valor atualizado com desconto fica: R$ $precoDesc")
}