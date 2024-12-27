## Instruções de verificação (#3)

Este exercício explora mais a fundo os intervalos, introduzidos em [Laços &
Intervalos], e mostra como eles podem ser usados com instruções de verificação.

Crie uma classe `Level` com dois argumentos de construtor: `val range: IntRange`,
e `private var level: Int`. `level` tem um argumento padrão que é o valor mais
baixo de `range`. O construtor deve garantir que `level` é um dos valores em
`range`.

Adicione uma propriedade somente leitura `value` que produz o valor de `level`.

Adicione uma função `up()` que incrementa `level` apenas se o resultado estiver dentro
de `range`, e uma função `down()` que decrementa `level` apenas se o resultado estiver
dentro de `range`. Finalmente, adicione uma função `set(new: Int)` que primeiro garante que
`new` está dentro de `range` e depois atribui `new` a `level`.

`Level` é testado pelo código inicial em `main()`.

<sub> Esta tarefa não contém testes automáticos,
por isso está sempre marcada como "Correto" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>