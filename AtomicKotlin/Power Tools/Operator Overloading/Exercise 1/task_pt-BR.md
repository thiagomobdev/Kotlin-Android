## Sobrecarga de operadores (#1)

Crie uma classe que comece com:

```kotlin
class WrapRange(
  val range: IntRange,
  private var current: Int = range.start
) {
```

Escreva funções membro para que você possa incrementar e decrementar um objeto `WrapRange` mas `current` automaticamente permaneça dentro do `range`.

Faça quaisquer modificações necessárias para que o código inicial em `main()` produza a saída do exercício mostrada.

<sub> Esta tarefa não contém testes automáticos,
então ela é sempre marcada como "Correto" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>