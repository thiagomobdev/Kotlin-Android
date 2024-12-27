## Funções locais (#2)

A função `createCounter()` cria um par de funções para gerenciar um `contador`. Em vez de criar uma classe, manipulamos o `contador` usando apenas funções.

Na `createCounter()` defina uma variável local `counter`. Em seguida, defina duas funções locais:

+ `inc()`: aumenta o valor do `counter` em um

+ `value()`: retorna o valor de `counter`

Por fim, retorne um par de referências de função para essas funções locais:

`return Pair(::inc, ::value)`

As duas funções locais capturam a mesma variável local `counter`. Este estilo de gerenciamento de estado é comumente usado em linguagens de programação funcional pura que não possuem classes.