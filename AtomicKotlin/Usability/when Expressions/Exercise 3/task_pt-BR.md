## Expressões `when` (#3)

Implemente a função `balanced()` que recebe um parâmetro do tipo `String`. O argumento deve consistir em parênteses e espaços opcionais; por exemplo: `"()(())"`. Quando você passa esse argumento para `balanced()`, ele verifica se cada parêntese de abertura tem um parêntese de fechamento correspondente e se todos os parênteses estão devidamente aninhados.

Ignore os espaços em branco na `String` de entrada. Se a `String` contiver caracteres além de parênteses e espaços em branco, lance uma `IllegalArgumentException`.

Alguns exemplos:

- `"()"` é equilibrado

- `"(()"` é desequilibrado

- `")("` é desequilibrado

- `"( ()() )"` é equilibrado

- `"*()"` produz uma `IllegalArgumentException`

<div class="hint">

Itere sobre a `String` e conte o número de parênteses à esquerda que estão sem par durante cada etapa. No final, esse número deve ser 0. Se em algum momento o número for menor que zero, a `String` está desequilibrada.

</div>