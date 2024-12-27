## Downcasting (#3)

Crie uma interface vazia `Animal1`. Herde uma classe `Worm1` com uma função
membro `wriggle()` que chama `trace("Wriggle")`. Herde uma classe `Snail1`
com uma função membro `slide()` que chama `trace("Slide")`. Herde uma classe
`Beetle1` com uma função membro `walk()` que chama `trace("Walk")`.

Escreva uma função `move(a1: Animal1)` que use um `when` para detectar cada tipo e
chamar a função desse tipo. No `main()`, crie uma `List` de objetos `Animal1` e
chame `move()` para cada um.

Crie uma hierarquia duplicada a partir de uma interface `Animal2`, mas neste caso faça
`move()` um membro de `Animal2` e implemente-o em `Worm2`, `Snail2` e
`Beetle2`. No `main()`, crie uma `List` de objetos `Animal2` e chame `move()`
para cada um.

Compare a hierarquia verificada por tipo com a hierarquia polimórfica.

<sub> Esta tarefa não contém testes automáticos,
portanto, sempre é marcada como "Correto" quando você executa "Checar".
Por favor, compare sua solução com a fornecida! </sub>