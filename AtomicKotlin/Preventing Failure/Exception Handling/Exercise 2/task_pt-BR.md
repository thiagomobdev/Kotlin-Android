## Tratamento de Exceções (#2)

O código inicial define uma hierarquia de exceções e três funções:

- `findNumber(s: String)` busca `s` e retorna uma `String` contendo um
  número. Lança `NoNumber` se nenhum número for encontrado.

- `convertNumber(s: String)` converte `s` para um `Int`. Lança `BadNumber` se
  `s` não puder ser convertido para um `Int`.

- `embedNumber(n: Int)` produz uma `String` contendo `n` dentro de algumas letras.

Sua tarefa é definir duas funções:

- `justFail(s: String)` chama as três funções acima, aninhando chamadas dentro de chamadas. Encontra um número dentro de uma `String`, converte-o para um `Int`, embute esse `Int` dentro de uma `String`, e chama `trace()` com o resultado.

- `recover(s: String)` chama cada uma das funções acima, uma de cada vez, recuperando-se de quaisquer falhas para que a próxima chamada possa ser bem-sucedida. Se `findNumber()` falhar, a recuperação produz a `String` `"0"`. Se `convertNumber()` falhar, a recuperação produz `-1`. No final de `recover()`, chame `trace()` com o resultado.

O restante do código inicial testa as duas funções acima.

Observe os efeitos potenciais produzidos por exceções:

1. Se uma função puder gerar uma ou mais exceções, as chamadas para essa função podem ser significativamente mais complicadas.

2. O conceito de recuperação assume que há uma *maneira* de se recuperar de uma chamada de função falhada. Muitas vezes, no entanto, isso simplesmente não é verdade.

<sub> Esta tarefa não contém testes automáticos, então sempre é marcada como "Correta" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>