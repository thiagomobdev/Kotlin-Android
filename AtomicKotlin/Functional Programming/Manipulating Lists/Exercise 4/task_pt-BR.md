## Manipulando listas (#4)

Implemente a função `friendSuggestions(person: Person)` para retornar amigos dos amigos de `person`, excluindo aquelas pessoas que já são seus amigos. Considere as seguintes conexões de amizade:

```text
Alice - Bob
Bob - Charlie
```

`friendSuggestions()` deve retornar Charlie para Alice, porque Charlie é um amigo do amigo de Alice, Bob, e ainda não é amigo de Alice.

O exemplo a seguir não produz sugestões de amigos para Alice, porque Bob e Charlie já são seus amigos:

```text
Alice - Bob
Alice - Charlie
Bob - Charlie
```