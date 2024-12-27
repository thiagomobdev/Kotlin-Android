## Recursão (#4)

O código inicial fornece uma classe `City`. Implemente uma função de extensão
`City.allReachable()` que constrói um conjunto de todas as cidades alcançáveis a partir da
`City` atual. Implemente-a tanto recursivamente quanto iterativamente.

As conexões diretas para cada `City` são armazenadas em sua propriedade `connections`.
`allReachable()` deve retornar todas as cidades alcançáveis a partir da cidade dada via
outras cidades. A cidade é alcançável a partir de si mesma, então ela também deve estar presente
no conjunto resultante.

Por exemplo, considere o seguinte grafo de conexões:

```text
Cidades: Dublin, Liverpool, Manchester, Leeds
Conexões: Liverpool - Manchester; Manchester - Leeds
```

Tanto Manchester quanto Leeds são alcançáveis a partir de Liverpool, enquanto Dublin não é. O
caminho de Liverpool até Leeds passa por Manchester. Assim, `allReachable()` para
Liverpool deve retornar o conjunto de três cidades: Liverpool, Manchester, Leeds.