## Construtores complexos (#3)

Demonstre que múltiplas seções de inicialização são executadas na ordem de declaração. O código inicial contém uma classe `MultipleInit` com uma propriedade `val initOrder = mutableListOf<String>()`. Adicione as `String`s `"one"`, `"two"` e `"three"` à propriedade `initOrder` em três blocos de `init` diferentes.