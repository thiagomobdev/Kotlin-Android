fun main() {
    // Solicita o nome do usuário
    print("Enter your name: ")
    // Lê o nome usando `readlnOrNull()`, que pode retornar nulo.
    // O método `takeIf { it.isNotBlank() }` verifica se o nome não está vazio ou nulo.
    // Se estiver vazio, atribuímos um valor padrão "Anonymous".
    val name = readlnOrNull()?.takeIf { it.isNotBlank() } ?: "Anonymous"

    // Solicita a idade do usuário
    print("Enter your age: ")
    // Lê a idade e tenta convertê-la para um número inteiro com `toIntOrNull()`.
    // Se a conversão falhar ou o valor for nulo, a idade será tratada como inválida.
    val ageUser = readlnOrNull()?.toIntOrNull()

    // Verifica se a idade é nula ou menor/igual a 0. Se for, exibe uma mensagem de erro
    // e define uma idade padrão de 18 anos.
    if (ageUser == null || ageUser <= 0) {
        println("Invalid age. Setting default age to 18.")
    }
    val finalAge = ageUser ?: 18 // Caso a idade seja inválida, usamos o valor padrão 18.

    // Solicita o e-mail do usuário
    print("Enter your e-mail: ")
    // Lê o e-mail e verifica se contém "@" e não está vazio com `contains("@") && it.isNotBlank()`.
    // Se for inválido, atribuímos o valor padrão "No e-mail provided".
    val emailUser = readlnOrNull()?.takeIf { it.contains("@") && it.isNotBlank() } ?: "No e-mail provided"

    // Exibe as informações do usuário formatadas
    println("\n--- User Information ---") // Seção de título para organização
    println("Welcome, $name!") // Exibe o nome do usuário, ou "Anonymous" caso seja vazio.
    println("You are $finalAge years old. Your access is free!") // Exibe a idade final.
    println("E-mail: $emailUser") // Exibe o e-mail ou "No e-mail provided" se inválido.
}
