## Booleanos (#2)

Crie uma "tabela verdade" para `&&` e `||`. Escreva uma função `showAnd(first: Boolean, second: Boolean)` que use um template de `String` para mostrar `first`, o símbolo `&&`, `second`, o símbolo `==` e, em seguida, o resultado de `first && second`. Escreva uma função similar para `showOr()`.

A saída de exemplo para `showAnd(true, true)` deve ser:

```text
true && true == true
```

Agora escreva uma função `showTruthTable()` que exiba a tabela produzida por todas as combinações possíveis de `true` e `false` para ambos `showAnd()` e `showOr()`. Certifique-se de incluir todas as ordenações possíveis.