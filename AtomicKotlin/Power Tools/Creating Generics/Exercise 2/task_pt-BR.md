## Criando Genéricos (#2)

Crie uma classe genérica `CrateList` que herda de um `ArrayList` de `Crate`. `Crate` não possui `toString()`. Para resolver este problema, crie uma classe `private` aninhada chamada `DecoratedCrate` que recebe um argumento genérico de `conteúdo` e herda de `Crate`. Adicione um `toString()` para `DecoratedCrate` que produz uma `String` consistindo do resultado da chamada de `get()` dentro de colchetes.

Defina uma função membro `add()` que recebe um argumento genérico `item`, cria um `DecoratedCrate` com esse argumento e adiciona o resultado ao `ArrayList`. O código em `main()` testa sua solução.

<sub> Esta tarefa não contém testes automáticos, então é sempre marcada como "Correto" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>