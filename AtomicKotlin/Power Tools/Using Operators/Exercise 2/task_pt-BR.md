## Usando operadores (#2)

Defina uma função `create()` que produza uma `MutableList` contendo dez
`Int`s, inicializados com os valores de 0 a 9.

Cada função restante primeiro registra seu nome de função.

- `assignAppendIncrementContains()`: Chame `create()` e capture o resultado em
  `list`. Defina o último elemento de `list` como 99, depois adicione 100 a `list`.
  Incremente este novo último elemento e registre a lista. Finalmente, registre
  se 101 está presente em `list`.

- `minus()`: Chame `create()` e capture o resultado em `val list`. Registre
  `list` com o elemento 5 removido. Registre a lista com os elementos 5, 6, 7
  e 8 removidos. Registre a lista com o elemento 10 removido. Use o
  "decrementar-igual" para remover os elementos 0, 1 e -1 e registre o resultado.

- `plus()`: Crie um `var list` adicionando 11, 12 e 13 ao resultado de
  `create()`. Use o "incrementar-igual" para adicionar 14 e registre o resultado.

O código inicial em `main()` testa seu trabalho.

<sub> Esta tarefa não contém testes automáticos,
portanto, sempre é marcada como "Correta" quando você executa "Check".
Por favor, compare sua solução com a fornecida! </sub>