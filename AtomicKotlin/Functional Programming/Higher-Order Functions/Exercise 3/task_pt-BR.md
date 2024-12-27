## Funções de alta ordem (#3)

Escreva sua própria versão de `mapIndexedNotNull()`. Assim como `mapNotNull()`, ela aplica a transformação dada a cada elemento e filtra `null`s. Como `mapIndexed()`, ela baseia a transformação tanto no elemento quanto no seu índice.

Note os tipos genéricos `R?` (em `(Int, T) -> R?`) e `List<R>`. O `?` em `R?` significa que o tipo de retorno da lambda é anulável. `mapIndexedNotNull()` retorna uma lista de elementos não anuláveis, então o tipo de retorno da função é `List<R>`. Para expressar que `R` é um tipo não anulável, especificamos uma *restrição* no parâmetro de tipo genérico: `R: Any`.