fun main(){
    val lista = listOf(1,2,3,4,5,6,7,8,9,10)
    val nomes = listOf("Thiago", "Carol","Emanuel","Bruce")
//    for (i in lista){
//        println("Item: $i")
//    }
    for((indice, valor) in nomes.withIndex()){
        println("Indice: $indice    valor: $valor")
    }
}