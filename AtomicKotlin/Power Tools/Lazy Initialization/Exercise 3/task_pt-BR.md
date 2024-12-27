## Inicialização Preguiçosa (#3)

Não use tipagem explícita neste exercício, para demonstrar que o tipo é inferido a partir do resultado do inicializador `lazy`.

Crie duas classes, `A` e `B`, cada uma com um `init` que utiliza `trace()` para anunciar "construtor de <nome da classe>". Adicione as seguintes propriedades `lazy` `val`:

- `b` em `A`, que inicializa preguiçosamente um objeto `B`.
- `i` em `A`, que inicializa preguiçosamente um `Int` com `1`.
- `j` em `B`, que inicializa preguiçosamente um `Int` com `2`.

Cada inicializador lazy deve traçar "Inicializando <nome da classe>.<nome da propriedade>".

Em `B`, adicione `fun g()` que produz `j`. Em `A`, adicione `fun f()` que produz `i + b.g()`.

Em `main()`, adicione uma `val a` inicializada de forma preguiçosa que traça sua inicialização como acima e então produz um objeto `A`. O restante de `main()` é o código inicial que testa sua solução.

<sub> Esta tarefa não contém testes automáticos, então ela sempre é marcada como "Correta" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>