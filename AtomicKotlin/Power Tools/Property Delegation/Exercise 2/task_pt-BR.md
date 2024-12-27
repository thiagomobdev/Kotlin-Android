## Delegação de Propriedade (#2)

Comece com:

```kotlin
class Delegator {
  private var list = List(8) { "$it" }
  var strings by list
}
```

Defina `getValue()` e `setValue()` como funções de extensão para `List<String>`
(Dica: o IntelliJ IDEA gerará esqueletos para você). O código em `main()`
testa sua solução.

BÔNUS: Tente ajustar `getValue()` e `setValue()` para trabalhar com:

```kotlin
class Delegator {
  var strings by List(8) { "$it" }
  ...
```

E explique o que acontece.

<sub> Esta tarefa não contém testes automáticos,
então está sempre marcada como "Correta" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>