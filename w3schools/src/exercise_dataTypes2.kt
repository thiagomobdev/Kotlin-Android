fun main(){
//Converta um número inteiro para um Double e exiba o resultado.
   val numInt = 32
    println("Variavel original: $numInt  - ${numInt::class.java.simpleName}")

    println("Variavel convertida: $numInt - ${numInt.toDouble()::class.java.simpleName}")

}