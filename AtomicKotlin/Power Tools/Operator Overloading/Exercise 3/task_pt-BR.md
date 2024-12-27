## Sobrecarga de operadores (#3)

Crie uma `class Repository<T>(val initSize: Int = 10)` semelhante a uma coleção. Ela contém uma `MutableList` privada chamada `list` com tamanho inicial `initSize`, com todos os elementos inicializados para `null`. Forneça suporte para as seguintes operações para um `Repository` chamado `r`:

- `r += rv` Coloca `rv` na primeira posição disponível `null` em `list`. Se não houver locais `null` restantes, acrescenta `rv` ao final de `list`.

- `r[n] = rv` Coloca `rv` na localização `n` em `list`. Requer que `n` seja maior ou igual a zero e menor que `list.size`. Requer que `list[n]` não seja `null`.

- `r[n]` Recupera o valor `list[n]`. Requer que `n` seja maior ou igual a zero e menor que `list.size`. Requer que `list[n]` não seja `null`.

Adicione um `toString()` que produza `list` separada por vírgulas.

O código inicial em `main()` testa `Repository` e mostra como as mensagens de erro devem aparecer.

<sub> Esta tarefa não contém testes automáticos, portanto, está sempre marcada como "Correto" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>