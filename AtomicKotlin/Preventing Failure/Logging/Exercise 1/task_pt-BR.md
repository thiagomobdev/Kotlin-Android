## Registro (#1)

O código inicial inclui `class Level`, que é a solução do Exercício 3 de [Check Instructions].

Crie uma classe chamada `Pipe` que recebe `val level: Level` como um parâmetro do construtor. Dê a esse parâmetro um argumento padrão com um intervalo `0..10`.

Dentro de `Pipe`, defina um `val logger` usando `atomiclog` com um arquivo associado `"PipeLog.txt"`. Crie uma função membro `checkLevel()` que usa uma expressão `when`. Quando `value` for:

- 2: chame `trace()`
- 4: chame `debug()`
- 6: chame `info()`
- 8: chame `warn()`
- 10: chame `error()`

A mensagem de registro para cada chamada é apenas "Level " seguido pelo valor correspondente. O código inicial em `main()` testa sua solução.

<sub> Esta tarefa não contém testes automáticos, então ela é sempre marcada como "Correto" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>