## Classes abstratas (#3)

O código inicial contém uma classe `abstract` chamada `Instrument` que possui uma função membro `abstract` `play(n: Note)`. `Note` é definido como um `enum` com os valores de `A` a `G`.

As classes `Wind`, `Percussion` e `Stringed` herdam `Instrument`, sobrescrevendo `play()` em cada caso para que retorne uma `String` contendo o nome da classe, seguido de `blow` para `Wind`, `strike` para `Percussion` e `pluck` para `Stringed`, e por último a `Note` sendo tocada.

Adicione dois argumentos de construtor a `Instrument`: `name` e `action`, e passe os valores correspondentes das subclasses. Faça de `name` e `action` propriedades `val` e forneça uma implementação de `play()` na superclasse para que ela retorne o mesmo valor que era produzido anteriormente pelo `play()` em cada subclasse. Remova as implementações de `play()` das subclasses.