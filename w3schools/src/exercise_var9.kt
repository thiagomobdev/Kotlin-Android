fun main() {
    // Informações do usuário
    val nome = "Thiago dos Santos"
    val cpf = "005.418.402-90"
    val senha = 230301
    var saldo = 151.87

    // Tela de boas-vindas
    println("\t#### Seja bem-vindo ao SYSBANK \uD83C\uDFE6 - System Bank ####")

    // Autenticação
    print("Digite o CPF: ")
    val cpfInput = readlnOrNull()
    print("Digite a senha: ")
    val senhaInput = readlnOrNull()?.toIntOrNull()

    if (cpfInput == cpf && senhaInput == senha) {
        println("\nLogin realizado com sucesso!")
        println("Olá, $nome. Seu saldo é de: R$ %.2f".format(saldo))

        // Menu de operações
        while (true) { // Loop para repetir operações até o usuário sair
            println("\nEscolha uma operação:")
            println("[1] - Depósito\n[2] - Saque\n[3] - Sair")
            print("Digite o número da operação: ")
            val escolha = readlnOrNull()?.toIntOrNull()

            when (escolha) {
                1 -> {
                    print("Qual valor você deseja depositar: ")
                    val valorDeposito = readlnOrNull()?.toDoubleOrNull()
                    if (valorDeposito != null && valorDeposito > 0) {
                        saldo += valorDeposito
                        println("Depósito realizado com sucesso! Novo saldo: R$ %.2f".format(saldo))
                    } else {
                        println("Valor inválido! O depósito deve ser maior que zero.")
                    }
                }

                2 -> {
                    print("Qual valor você deseja sacar: ")
                    val valorSaque = readlnOrNull()?.toDoubleOrNull()
                    if (valorSaque != null && valorSaque > 0 && valorSaque <= saldo) {
                        saldo -= valorSaque
                        println("Saque realizado com sucesso! Novo saldo: R$ %.2f".format(saldo))
                    } else if (valorSaque != null && valorSaque > saldo) {
                        println("Saldo insuficiente! Seu saldo atual é R$ %.2f".format(saldo))
                    } else {
                        println("Valor inválido! O saque deve ser maior que zero.")
                    }
                }

                3 -> {
                    println("Obrigado por usar o SYSBANK! Até logo, $nome.")
                    break // Encerra o loop
                }

                else -> println("Opção inválida. Por favor, escolha uma operação válida.")
            }
        }
    } else {
        println("CPF ou senha incorretos. Tente novamente.")
    }
}
