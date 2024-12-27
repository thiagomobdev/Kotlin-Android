## Ferramentas de delegação de propriedades (#2)

O código inicial define uma `data class` chamada `Flag` contendo um `Boolean` chamado `b` com um valor padrão de `false`. Em `main()`, crie três `var`s: `d` do tipo `Double`, `s` do tipo `String` e `f` do tipo `Flag`, todos delegados para `notNull()`. Para `d` e `f`, use declarações de tipo explícitas, mas para `s` use um parâmetro de tipo para `notNull()`.

Usando `capture` de `atomictest`, tente ler de `d`, `s` e `f` antes de serem inicializados e valide a saída usando `atomictest.eq`. Em seguida, defina `d` para `1.1`, `s` para `"yes"` e `f` para `Flag(true)` e use `eq` para verificar se eles assumem os novos valores.

<sub> Esta tarefa não contém testes automáticos, portanto, está sempre marcada como "Correto" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>