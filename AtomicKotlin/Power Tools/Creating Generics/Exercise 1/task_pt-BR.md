## criando genéricos (#1)

Crie uma interface genérica chamada `Items` com uma única função `next()` que retorna um objeto do tipo genérico ou `null`. Faça com que `Items` seja utilizável para [conversões SAM].

Crie uma função genérica chamada `itemIter()` que receba um `vararg items` do parâmetro de tipo e retorne um objeto `Items` produzido com uma conversão SAM. O objeto `Items` fecha sobre um `var index` para indicar o elemento atual em `items`. Cada chamada para `next()` produz o elemento atual e incrementa `index`. Quando não houver mais `items`, `next()` retorna `null`.

O código no `main()` testa sua solução.

<sub> Esta tarefa não contém testes automáticos, então é sempre marcada como "Correto" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>