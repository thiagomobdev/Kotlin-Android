## Verifique Instruções (#4)

Crie uma `class Tank(val capacity: Double)`, onde `capacity` é o valor máximo que o `Tank` pode conter. Adicione uma propriedade `safetyGap` que calcula uma folga de 2% de espaço vazio que deve ser preservada no topo do `Tank`. A quantidade atual no `Tank` é mantida em uma propriedade somente leitura chamada `level`. A quantidade real permitida que o tanque pode conter é `maxLevel`.

Defina duas funções membro para `Tank`:

- `add(quantity: Double): Double`, onde `quantity` deve ser positiva. Apenas adicione o suficiente da `quantity` para encher o tanque até `maxLevel` e coloque o restante em `remainder`. No final da função, verifique se `level` é maior que zero, que `level` é menor ou igual a `maxLevel`, e que `remainder` é maior ou igual a zero. Depois, retorne `remainder`.

- `drain(quantity: Double)`, onde `quantity` deve ser positiva e não pode exceder o `level` no `Tank`. Após remover `quantity` do tanque, verifique se o `level` é maior ou igual a zero.

O código inicial em `main()` testa sua classe `Tank` e mostra quais mensagens de erro usar em suas chamadas `require()` e `check()`.

Observe que as chamadas para `check()` não falham contanto que a lógica interna da função esteja correta. Ou seja, se um `check()` lançar uma exceção, isso indica um erro de programação. Por essa razão, as chamadas para `check()` podem ser removidas uma vez que o código é verificado, para melhorar o desempenho. É melhor deixá-las para manter a verificação do código, mas se isso não for possível, você pode converter os testes `check()` em testes unitários (veja [Testes Unitários]).

<sub> Esta tarefa não contém testes automáticos, então ela é sempre marcada como "Correta" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>