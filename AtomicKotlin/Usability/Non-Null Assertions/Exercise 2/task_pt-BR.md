## Assertivas Não Nulas (#2)

Defina uma função de extensão `List<Int>.headPlusTail()` que retorna um `Triple`
contendo (1) o primeiro elemento na `List<Int>`, (2) o último elemento na
`List<Int>`, (3) a soma dos primeiros e últimos elementos. Se a `List<Int>` for
vazia, retorne `null` para todas as três entradas do `Triple`. Se a `List<Int>`
consistir em um único elemento, retorne esse elemento como a primeira entrada,
seguido por `null`, seguido por esse elemento como resultado.

Em `main()`, crie um `mutableListOf<Int>` chamado `ints`. Chame
`trace(ints.headPlusTail())`. Em seguida, crie um loop `for` que passa `n` pelo
intervalo `-2..10`, pulando a cada outro elemento. O loop chama `ints.add(n)`,
depois `trace(ints.headPlusTail())`, e finalmente seleciona o resultado da chamada
para `ints.headPlusTail()` usando uma assertiva não nula.

<sub> Esta tarefa não contém testes automáticos,
então ela está sempre marcada como "Correta" quando você executa "Check".
Por favor, compare sua solução com a fornecida! </sub>