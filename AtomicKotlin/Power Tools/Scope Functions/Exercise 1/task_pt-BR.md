## Funções de escopo (#1)

O código inicial define `class NumPair`. No `main()`, crie `val np1` e
inicialize-o com `NumPair(10, 20)` com um escopo `apply` que adiciona 5 a `x`
e 6 a `y`. Use `eq` para verificar o resultado de `np1`. Agora crie `val np2` e
inicialize-o com `NumPair(30, 40)` que possui um escopo `also` que adiciona 7 a
`x` e 8 a `y`. Use `eq` para verificar o resultado de `np2`.

Defina `val result1` inicializado com `np1.run` onde a lambda soma os
resultados de `add()`, `subtract()`, e `multiply()`. Use `eq` para verificar o
resultado. Duplique essa funcionalidade criando `result2` usando `let` e
`result3` usando `with`.

<sub> Esta tarefa não contém testes automáticos,
portanto está sempre marcada como "Correta" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>