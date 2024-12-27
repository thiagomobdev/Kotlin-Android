## Usando operadores (#3)

Crie uma `data class N(var n: Int)` e torne-a `Comparable`. Faça com que `N` produza uma
representação `String` de `"N($n)"`. No `main()`, crie uma `key` inicializada com
`N(11)`, e um `map` inicializado com um `MutableMap` contendo uma única entrada,
com `key` mapeada para `47`. Verifique `map[key]`. Agora incremente `n` e verifique
`map[key]` novamente.

Crie uma `List<N>` de tamanho cinco, automaticamente inicializada com `N(it)`, e
embaralhe-a usando o objeto `Random` fornecido. Exiba a `List`, depois converta
para um `SortedSet` e exiba para ver que está realmente ordenada. Encontre o
valor mínimo e adicione dois ao seu `n`. Exiba o conjunto novamente para ver o que
aconteceu.

Adapte seu código até que produza a mesma saída vista na análise de saída.

O cálculo em `compareTo()` impacta inúmeras operações, incluindo aquelas para
usar o objeto como uma chave em um `Map` e um elemento em um `Set`. Como este
exercício demonstra, você deve ser muito relutante em permitir que os valores usados no
cálculo de `compareTo()` variem.

<sub> Esta tarefa não contém testes automáticos,
então sempre é marcada como "Correto" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>