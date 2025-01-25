fun main() {
    print("Digite o numero da pagina atual: ")
    var paginaAtual = readlnOrNull()?.toInt()
    print("Digite o numero da quantidade de paginas total do livro: ")
    var paginasTotal = readlnOrNull()?.toInt()

    var subtracao = paginasTotal!! - paginaAtual!!
    println("Ainda resta $subtracao paginas para concluir o livro.")
}