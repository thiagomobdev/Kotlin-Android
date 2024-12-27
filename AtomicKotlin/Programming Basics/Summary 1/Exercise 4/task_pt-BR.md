## Resumo 1 (#4)

Este exercício modifica `Overflow.kt` para testar `Long` e `Double`. Implemente `testLong()` para exibir o valor máximo de `Long` incrementado por `1`. Faça `testDouble()` exibir o valor máximo de `Double` incrementado por `1`. Faça `testDouble2()` exibir o resultado de verificar se `Double.MAX_VALUE` e `Double.MAX_VALUE + 1` são iguais.

O tipo `Double` geralmente ocupa 64 bits na memória. Devido a limitações de memória, `Double` representa números com certa precisão. Você pode ler mais sobre sua representação interna na [Wikipedia](https://en.wikipedia.org/wiki/Double-precision_floating-point_format).

A constante `Double.MAX_VALUE` tem um significado especial: ela contém o maior valor finito positivo de `Double`. Você não pode aumentá-lo; se tentar adicionar um número positivo a ele, o resultado será o mesmo valor máximo. Funciona de maneira semelhante a `Double.POSITIVE_INFINITY`: é uma constante com tratamento especial que contém o valor de infinito positivo de `Double`. Você pode usar essas constantes para comparações com valores `Double` regulares.