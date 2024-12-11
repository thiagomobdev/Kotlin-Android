fun main(){
var contadorDePares = 0
    var numero = 1

    println("Numero\tQuadrado")
    println("----------------")
    while(contadorDePares < 10) {
        if(numero % 2 == 0) {
            val quadrado = numero * numero
            println("$numero\t$quadrado")
            contadorDePares++
        }
        numero++
    }
}