## Sobrecarga de operadores (#2)

Começando com:

```kotlin
enum class Count {
  Eeny, Meeny, Miney, Moe;
  companion object {
    val max = Moe
  }
}
```

Crie funções de extensão para realizar as operações `++` e `--` em um `Count` de forma que, se `++` tentar passar de `Moe`, ele volte para `Eeny`, e se `--` tentar ir abaixo de `Eeny`, ele volte para `Moe`. O código inicial em `main()` verificará seu trabalho.

<sub> Esta tarefa não contém testes automáticos, então sempre é marcada como "Correto" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>