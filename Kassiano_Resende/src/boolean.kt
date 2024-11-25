fun main() {
    val b1 = true
    val b2 = false
    val idade = verificarIdade()
    val acesso = verificarAcessoClube()
    val aluno = verificarStatusAluno()

    val c1 = b1.and(b2) // Retorna false
    val c2 = b1.or(b2) // Retorna true
    val c3 = b1.not() // Retorna false


    print("$c1 / $c2 / $c3")
//    println(idade)
//    println(acesso)
//    println(aluno)

}
// O CÓDIGO ABAIXO SÃO EXEMPLOS GERADOS PELO CLAUDE.

// Exemplo 1: Declaração simples e operadores de comparação
fun verificarIdade() {
    val idade = 18
    val maiorDeIdade = idade >= 18
    println("É maior de idade? $maiorDeIdade") // Imprime: true
}

// Exemplo 2: Operadores lógicos (AND, OR, NOT)
fun verificarAcessoClube() {
    val idade = 20
    val temCarteirinha = true
    val acessoPermitido = idade >= 18 && temCarteirinha
    println("Pode entrar no clube? $acessoPermitido") // Imprime: true

    // Usando operador NOT (!)
    val acessoNegado = !acessoPermitido
    println("Acesso negado? $acessoNegado") // Imprime: false
}

// Exemplo 3: Uso em estruturas condicionais
fun verificarStatusAluno() {
    val nota = 7.5
    val frequencia = 0.8

    val aprovadoPorNota = nota >= 7.0
    val aprovadoPorFrequencia = frequencia >= 0.75

    if (aprovadoPorNota && aprovadoPorFrequencia) {
        println("Aluno aprovado!")
    } else if (!aprovadoPorNota && aprovadoPorFrequencia) {
        println("Aluno em recuperação")
    } else {
        println("Aluno reprovado")
    }
}

