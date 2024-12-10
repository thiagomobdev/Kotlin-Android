data class Pais(
    var habitantes: Double,
    val taxaCrescimento: Double
) {
    fun crescerPopulacaoAnual() {
        // Calcula o crescimento populacional com base na taxa de crescimento
        habitantes *= (1 + taxaCrescimento / 100)
    }
}

fun main() {
    val habitantesPaisA = readLine()!!.toDouble()
    val habitantesPaisB = readLine()!!.toDouble()

    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)

    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) {
        // Invoca a função de crescimento anual para cada país
        paisA.crescerPopulacaoAnual()
        paisB.crescerPopulacaoAnual()

        // Incrementa a quantidade de anos
        quantidadeAnos++
    }

    println("$quantidadeAnos anos")
}