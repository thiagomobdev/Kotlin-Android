fun main(){
    //Declare uma variável de cada tipo primitivo do Kotlin (Int, Double, Float, Char, String, Boolean).
    val numInt = 1
    val numDouble = 12.85
    val numFloat = 12.75F
    val varChar = 'D'
    val varString = "Thiago"
    val booleanVar = true

    println("Variavel do tipo: ${numInt::class.java.simpleName}")
    println("Variavel do tipo: ${numDouble::class.java.simpleName}")
    println("Variavel do tipo: ${numFloat::class.java.simpleName}")
    println("Variavel do tipo: ${varChar::class.java.simpleName}")
    println("Variavel do tipo: ${varString::class.java.simpleName}")
    println("Variavel do tipo: ${booleanVar::class.java.simpleName}")
 //Esta extensão do código ::CLASS.JAVA.SIMPLENAME é para mostrar a saida de qual é o tipo da variavel.
}