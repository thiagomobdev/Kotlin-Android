fun main() {
    //Declare uma lista de números inteiros e exiba a soma de seus elementos.
 val lista = listOf(1,2,3,4)
    var soma = 0
    println(lista)
    for (numero in lista){
        soma += numero
        println("A soma de todos os elementos é: $soma")
    }
}
