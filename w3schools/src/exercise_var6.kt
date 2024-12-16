fun main(){
//Desenvolva um programa que armazene a distância percorrida (em km)
// e o tempo (em horas), e calcule a velocidade média.
    print("Qual foi a distancia percorrida: ")
    val distancia = readlnOrNull()!!.toDouble()
    print("Qual foi o tempo gasto para percorrer $distancia quilometros: ")
    val tempo = readlnOrNull()!!.toDouble()

    val velMedia = distancia / tempo
    println("A velocidade media durante todo o trajeto é: $velMedia")
}