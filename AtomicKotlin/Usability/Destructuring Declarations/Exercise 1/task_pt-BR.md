## Declarações de Desestruturação (#1)

Usando `Pairs.kt` como modelo, escreva uma função `calculate(n1: Int, n2: Int)` que retorna um `Triple` contendo um `Boolean` e dois `Int`. Se `n1` ou `n2` forem menores que zero, a função retorna um `Triple` contendo `false` e dois zeros. Caso contrário, retorna um `Triple` contendo:

+ `true`

+ A soma de `n1` e `n2`

+ `n1` multiplicado por `n2`

O código inicial contém um `main()` com testes, mostrando a diferença entre desempacotar o `Triple` usando `first`, `second` e `third` versus uma declaração de desestruturação.