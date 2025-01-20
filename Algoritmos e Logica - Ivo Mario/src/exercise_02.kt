fun main() {
    // Variáveis Lógicas
    val A = true
    val B = false

    // Variáveis Reais
    val X = 2.5
    val Y = 5.0

    // Variáveis Literais
    val R = "JOSÉ"
    val S = "JOÃO"
    val T = "JOÃOZINHO"

    // Avaliação das Expressões
    println("A OU B: ${A || B}")           // true
    println("A E B: ${A && B}")            // false
    println("NÃO A: ${!A}")                // false
    println("X = Y: ${X == Y}")            // false
    println("X = (Y / 2): ${X == (Y / 2)}") // true
    println("R = S: ${R == S}")            // false
    println("S = T: ${S == T}")            // false
    println("R <> S: ${R != S}")           // true
    println("R > S: ${R > S}")             // false
    println("S > T: ${S > T}")             // false
    println("((A OU B) OU (X = Y) OU (S = T)): ${(A || B) || (X == Y) || (S == T)}") // true
}

/**
 * Explicando os Resultados
 *
 *     A OU B (A .OU. B): Avalia se pelo menos uma das variáveis é verdadeira. Resultado: true
 *     A E B (A .E. B): Avalia se ambas as variáveis são verdadeiras. Resultado: false
 *     NÃO A (.NÃO. A): Inverte o valor de A. Resultado: false
 *     X = Y (X = Y): Avalia se X é igual a Y. Resultado: false
 *     X = (Y / 2) (X = (Y/2)): Avalia se X é igual a Y dividido por 2. Resultado: true
 *     R = S (R = S): Avalia se R é igual a S. Resultado: false
 *     S = T (S = T): Avalia se S é igual a T. Resultado: false
 *     R <> S (R <> S): Avalia se R é diferente de S. Resultado: true
 *     R > S (R > S): Avalia se R é maior que S. Resultado: false
 *     S > T (S > T): Avalia se S é maior que T. Resultado: false
 *     ((A .OU. B) .OU. (X = Y) .OU. (S = T)): Avalia se pelo menos uma das expressões internas é verdadeira. Resultado: true
 **/
