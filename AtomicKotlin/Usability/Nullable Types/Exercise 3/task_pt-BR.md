## Tipos Nulos (#3)

Crie uma função chamada `countHexadecimalNumbers(codes: List<String>)` que conta números hexadecimais contidos em `codes`. Ela retorna um `Map<Int, Int>` onde a chave é um número hexadecimal e o valor é o número de vezes que esse número aparece em `codes`. Se uma `String` em `codes` não contiver um número hexadecimal, a função a ignora.

<div class="hint">

Converta uma `String` contendo um código hexadecimal em um `Int` usando `toIntOrNull(radix: Int)`, uma função de extensão para `String`. Passe `16` como a base.

</div>