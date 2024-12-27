## Tipos Numéricos (#4)

Escreva uma função que produza o tempo em milissegundos dado um período de tempo em horas, minutos e segundos. (Um segundo equivale a mil milissegundos). Por exemplo, uma hora e meia são `5_400_000` milissegundos.

<div class="hint">

Certifique-se de armazenar todos os cálculos intermediários em um `Long`, caso contrário, você pode produzir resultados incorretos. Por exemplo, se você converter um bilhão de horas para milissegundos, mas não armazenar esses milissegundos em um `Long`, você terá um overflow:

```kotlin
// Cálculo com Int causa transbordamento de inteiro:
1_000_000_000 * 60 = -129542144
// Cálculo com Long é bem-sucedido:
1_000_000_000 * 60L = 60000000000L
```

</div>