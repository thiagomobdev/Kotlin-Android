## Delegação de Propriedade (#3)

Crie uma classe genérica que comece com:

```kotlin
class Holder<E> {
  private var list = listOf<E>()
```

Defina `getValue()` e `setValue()` para `Holder`, de forma que você possa
escrever com sucesso:

```kotlin
class Holders {
  var strings by Holder<String>()
  var ints by Holder<Int>()
  var bools by Holder<Boolean>()
}
```

O código inicial em `main()` testa sua solução.

<sub> Esta tarefa não contém testes automáticos,
portanto, ela é sempre marcada como "Correta" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>