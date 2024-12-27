## Resumo 2 (#7)

Converta um número natural para um número no sistema de numeração romano.

Números romanos:
1000 = M, 900 = CM, 500 = D, 400 = CD, 100 = C, 90 = XC,
50 = L, 40 = XL, 10 = X, 9 = IX, 5 = V, 4 = IV, 1 = I.

Por exemplo: 23 = XXIII, 44 = XLIV, 100 = C.

<div class="hint">

Realize a conversão em etapas. Use uma variável auxiliar `remainder`
para armazenar a parte restante do inteiro convertido e a variável `result`
para armazenar a representação resultante em numeral romano. Para cada etapa,
o `number` inicial é igual à soma do `remainder` e `result`.

Armazene os numerais romanos em um mapeamento de `Int` para a representação `String` associada. Para cada par `int = roman` começando de `1000 = M`:

- Divida `remainder` por `int` para descobrir quantas vezes você precisa repetir
  `roman` no `result`.

- Subtraia o resultado de `remainder` para atualizá-lo:
  `remainder -= remainder / int`.

</div>