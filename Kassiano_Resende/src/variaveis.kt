//Utilizando as definições de variaveis VAL e VAR.
//Inferencia de tipos
/*
* VAL -> Variavel imutavel, o valor atribuido a ela não poderá sofrer alteração
* VAR -> Variavel mutavel, podendo ser alterado conforme for a necessidade.
* */
fun main() {
    val num1: Double = 12.65489879
    val num2: Float = 12.51F
    val num3: Long = 123456789987654321
    val num4: Int = 1992
    val num5: Short = 9999
    val str: String = "Variavel do tipo String"
    val condicao: Boolean = true
    println("\tTipos básicos de dados do Kotlin")
    println("Variavel do tipo Double = $num1")
    println("Variavel do tipo Float = $num2")
    println("Variavel do tipo Long = $num3")
    println("Variavel do tipo Int = $num4")
    println("Variavel do tipo Short = $num5")
    println("Variavel do tipo String = $str")
    println("Variavel do tipo Boolean = $condicao")
}
