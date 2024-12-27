## Upcasting (#2)

Upcasting também ocorre quando você adiciona um objeto de um tipo derivado em um contêiner que mantém o tipo base.

O código inicial contém uma interface `Apple` com uma função membro abstrata `consume()`. A partir de `Apple`, herde `GrannySmith`, `Gala`, `Fuji` e `Braeburn`. Sobrescreva `consume()` para que, respectivamente, retornem `chomp GrannySmith`, `bite Gala`, `press Fuji` e `peel Braeburn`.

`main()` cria uma `List<Apple>` e a popula com os tipos específicos de `Apple`. Use `map()` para aplicar `consume()` em cada objeto.