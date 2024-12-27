## Funções de ordem superior (#4)

Implemente `andThen()` para combinar as ações de duas funções. `f.andThen(g)` retorna uma nova função que primeiro aplica `f` e depois aplica `g` ao resultado: `{arg -> g(f(arg))}`. Defina `andThen()` como uma função de extensão em um tipo de função.