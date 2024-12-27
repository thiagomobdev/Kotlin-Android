## Registro (#3)

Adicione níveis de registro a `AtomicLog.kt`. Crie uma enumeração `Level` com os valores `Trace`, `Debug`, `Info`, `Warn` e `Error`. Adicione uma instância desse `enum` chamada `debugLevel` no escopo do arquivo, inicializada como `Error`. Dentro da sua nova classe `Logger`, modifique a função `log()` para que sua assinatura seja `private fun log(thisLevel: Level, msg: String)`. Isso exigirá pequenas modificações em algumas outras funções. O código em `main()` testa sua solução.

<sub> Esta tarefa não contém testes automáticos, então sempre é marcada como "Correto" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>