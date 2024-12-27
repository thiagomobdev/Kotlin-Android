## Upcasting (#3)

Quando você combina interfaces para criar uma classe, pode fazer um upcast de um objeto dessa classe para cada interface diferente.

O código inicial contém três interfaces: `Fighter` com uma função `fight()`, `Swimmer` com uma função `swim()`, e `Flyer` com uma função `fly()`, e uma classe `ActionCharacter` com uma função `fight()` que retorna `"ActionCharacter fight"`.

Defina uma classe `Hero` que combine `ActionCharacter`, `Fighter`, `Swimmer` e `Flyer`. Note que `fight()` em `ActionCharacter` fornece a implementação de `fight()` necessária pela interface `Fighter`. Defina `swim()` para retornar `"Hero swim"` e `fly()` para retornar `"Hero fly"`.

Em seguida, implemente `tryFight(x: Fighter)`, `trySwim(x: Swimmer)`, `tryFly(x: Flyer)`, e `doAction(x: ActionCharacter)`, de forma que cada função chame a função membro disponível para seu parâmetro e registre seu resultado.

Em `main()`, crie um objeto `Hero` e passe-o para cada uma das funções `tryFight()`, `trySwim()`, `tryFly()`, e `doAction()`. Execute `main()` para verificar a saída. Note que passar um `Hero` para cada função faz um upcast que, dentro da função, `Hero` perde seu tipo específico e se torna o tipo do parâmetro.