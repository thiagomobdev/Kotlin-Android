## Objetos Companion (#2)

Comece com estas duas interfaces:

```kotlin
interface BoardGame {
  fun move(): Boolean
  companion object {
    fun createBoard() {
      trace("BoardGame.createBoard()")
    }
  }
}

interface GameFactory {
  fun create(): BoardGame
}
```

Crie duas classes, `Checkers` e `Chess`, que herdem de `BoardGame`. Dê a ambas construtores `private` sem argumentos. Cada classe deve conter um `companion object Factory: GameFactory` que chama `createBoard()` em seu construtor. Cada objeto companion contém um `const val max` que é utilizado dentro de `move()`. As definições de `playGame()` e `main()` são fornecidas; complete o código em `Checkers` e `Chess` para que ele satisfaça os testes em `main()`.

<sub> Esta tarefa não contém testes automáticos, então está sempre marcada como "Correta" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>