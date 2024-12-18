fun main(){
    //Faça um programa que leia um número decimal e exiba apenas a parte inteira.
    var familia = mutableMapOf<String, Int>()
    familia["Carol"] = 27
    familia["Emanuel"] = 1
    familia["Bruce"] = 5
    familia["Thiago"] = 32

    for ((nome, idade) in familia){
        println("Nome: $nome, Idade: $idade")
    }

}