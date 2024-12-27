## Mapas (#2)

Objetos `Cage` armazenam `Hamster`s. `Cage` tem um tamanho fixo, então você não pode colocar outro `Hamster` em um `Cage` se ele já estiver cheio.

Para este exercício, os `Hamster`s são armazenados em uma `List`. No próximo exercício, `Map` será usado em vez de `List`.

Implemente `get(name: String)` como uma função membro para `Cage` de modo que ela retorne o `Hamster` com o `name`. Se não houver um `Hamster` com esse `name`, lançar `NoSuchElementException`.