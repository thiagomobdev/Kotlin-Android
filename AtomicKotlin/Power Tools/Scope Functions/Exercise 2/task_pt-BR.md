## Funções de Escopo (#2)

O código inicial usa a classe `SpaceShipControls` de
`ClassDelegation/SpaceShipControls.kt`. Ele contém um `main()` que começa com:

```kotlin
fun main() {
  var velocity = 1
  with(SpaceShipControls()) {
    trace(forward(velocity))
```

Adicione as chamadas `right(velocity)` e `down(velocity)`, rastreando os resultados de cada uma. No fechamento `}` da função de escopo, encadeie o resultado a um bloco `let`, que incrementa `velocity`, e então realiza as mesmas operações. No final desse bloco, encadeie para um bloco `run`, depois um bloco `apply` e um bloco `also`, realizando as mesmas operações em cada bloco. Use `trace` para verificar a saída.

<sub> Esta tarefa não contém testes automáticos, então está sempre marcada como "Correta" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>