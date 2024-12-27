## Resumo 2 (#8)

Converta de um número romano para um número natural. Por exemplo: XXIII = 23, XLIV = 44, C = 100.

<div class="hint">

Basta iterar sobre cada dígito no número romano e calcular a resposta. Percorra um número romano em ordem reversa, um dígito de cada vez (por exemplo, `IV` contém dois dígitos) e armazene o valor máximo encontrado até agora. Se o próximo dígito romano for maior ou igual ao valor máximo atual, adicione-o ao resultado. Se for menor que o máximo, subtraia-o. Por exemplo, para converter `XLIV = 44`, itere sobre `VILX`, que é o reverso de `XLIV`. Você adiciona `5`(`V`) e subtrai `1`(`I`) porque é menor que o máximo atual `5`(`V`), então adiciona `50`(`L`) e subtrai `10`(`X`) porque é menor que o máximo atualizado `10`(`X`):

| numeral | máximo atual    | ação   |
| ------- |-----------------|--------|
| V       | 5               | + 5    |
| I       | 5               | - 1    |
| L       | 50              | + 50   |
| X       | 50              | - 10   |

O resultado é `+ 5 - 1 + 50 - 10 = 44`

</div>