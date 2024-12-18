import java.time.LocalDate
import java.time.temporal.ChronoUnit
fun main(){
    print("Digite a primeira data no formato AAAA-MM-DD: ")
    val data1 = LocalDate.parse(readlnOrNull())
    print("Digite a segunda data no formato AAAA-MM-DD: ")
    val data2 = LocalDate.parse(readlnOrNull())

    val diferenca = ChronoUnit.DAYS.between(data1, data2)
    println("A diferença entre as datas é: $diferenca dias.")
}