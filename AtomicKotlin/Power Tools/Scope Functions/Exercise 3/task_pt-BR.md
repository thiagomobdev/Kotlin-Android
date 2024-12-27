## Funções de Escopo (#3)

O código inicial inclui uma definição para `class Math`. Crie uma instância de `Math` com um escopo `run`. Dentro desse escopo, defina `val z`, que é inicializado chamando `np(11, 7)` com um escopo `apply`. Dentro desse escopo, chame `add() + subtract()` e, após fechar o escopo, chame `calc()`. Use `eq` para verificar que o resultado é 77. O valor de retorno do escopo `run()` é `z + add()`; use `eq` para verificar que o resultado é 1077.

<sub> Esta tarefa não contém testes automáticos, então ela sempre é marcada como "Correto" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>