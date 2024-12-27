## Objetos (#3)

Começando com:

```kotlin
interface AdventureGame {
  interface Environment
  interface Character
  val environment: Environment
  val characters: MutableList<Character>
  fun populate()
}
```

Defina uma classe `Jungle` que é um `Environment`, e classes `Monkey` e
`Snake` que são `Character`s. Dentro de cada classe, coloque um `object Factory`
com uma função `create()`. Dê a `Monkey` e `Snake` um `toString()` que retorna
seu nome de classe.

Agora defina um `object MonkeysVsSnakes`, que é um `AdventureGame`, usando
as várias funções `create()` para inicializá-lo. `populate()` só precisa adicionar
um `Monkey` e uma `Snake`. O `main()` predefinido testará seu código.

<sub> Esta tarefa não contém testes automáticos,
portanto, sempre é marcada como "Correta" quando você executa "Check".
Por favor, compare sua solução com a que foi fornecida! </sub>