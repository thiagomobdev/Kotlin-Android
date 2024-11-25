fun main(){
    val lista = mutableListOf(1,2,3,4,5,6,7,8,9,10) // Criando uma lista mutavel
    lista.add(5)  // Adicionando um item amais na lista
     println("Lista completa: $lista")

    //Vamos usar 3 funções básicas e uteis do dia a dia
    // FILTER, FIRST E LAST
    val item = lista.last()
    val item2 = lista.first()
    val item3 = lista.filter { it % 2 == 0 }
    println("Qual o ultimo numero da lista?: $item")
    println("Qual o primeiro item da lista?: $item2")
    println("Na lista existe o numero dois?: $item3")
}