fun main() {
    print("Tecle a consoante da palavra \"aula\" -> ")
    val letra = readlnOrNull()?.firstOrNull()

    if (letra == 'l' || letra == 'L') {
        println("Você ACERTOU - letra L")
    } else {
        println("Você ERROU")
    }
}