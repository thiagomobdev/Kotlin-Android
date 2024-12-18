import java.time.LocalDate
import java.time.Period
import java.time.temporal.ChronoUnit

class CalculadoraDatas {
    fun calcularDiferencaEntreDatas(dataInicial: LocalDate, dataFinal: LocalDate): DadosDiferenca {
        // Calcula a diferença usando Period
        val periodo = Period.between(dataInicial, dataFinal)

        // Calcula a diferença total em dias
        val diasTotais = ChronoUnit.DAYS.between(dataInicial, dataFinal)

        return DadosDiferenca(
            anos = periodo.years,
            meses = periodo.months,
            dias = periodo.days,
            diasTotais = diasTotais
        )
    }
}

// Classe de dados para armazenar os resultados
data class DadosDiferenca(
    val anos: Int,
    val meses: Int,
    val dias: Int,
    val diasTotais: Long
)

fun main() {
    val calculadora = CalculadoraDatas()

    // Exemplos de uso
    val exemplos = listOf(
        Pair(LocalDate.of(2020, 1, 1), LocalDate.of(2023, 12, 25)),
        Pair(LocalDate.of(1990, 5, 15), LocalDate.of(2024, 1, 10)),
        Pair(LocalDate.of(2024, 2, 15), LocalDate.of(2024, 3, 20))
    )

    exemplos.forEach { (dataInicial, dataFinal) ->
        val resultado = calculadora.calcularDiferencaEntreDatas(dataInicial, dataFinal)

        println("Período entre $dataInicial e $dataFinal:")
        println("Anos: ${resultado.anos}")
        println("Meses: ${resultado.meses}")
        println("Dias: ${resultado.dias}")
        println("Total de Dias: ${resultado.diasTotais}")
        println("---")
    }

    // Função interativa para calcular diferença entre datas inseridas pelo usuário
    fun calcularDiferencaInterativa() {
        println("\nCalculadora de Diferença Entre Datas")
        print("Digite a data inicial (AAAA-MM-DD): ")
        val dataInicialStr = readLine() ?: return
        print("Digite a data final (AAAA-MM-DD): ")
        val dataFinalStr = readLine() ?: return

        try {
            val dataInicial = LocalDate.parse(dataInicialStr)
            val dataFinal = LocalDate.parse(dataFinalStr)

            val resultado = calculadora.calcularDiferencaEntreDatas(dataInicial, dataFinal)

            println("\nResultado:")
            println("Diferença: ${resultado.anos} anos, ${resultado.meses} meses e ${resultado.dias} dias")
            println("Total de dias: ${resultado.diasTotais}")
        } catch (e: Exception) {
            println("Erro: Data inválida. Use o formato AAAA-MM-DD")
        }
    }

    // Descomentar a linha abaixo para modo interativo
    calcularDiferencaInterativa()
}