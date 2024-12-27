## Restringindo visibilidade (#1)

Crie uma classe `Alien` com um construtor que inicializa as propriedades `public val name` e `public val species`. Adicione uma propriedade `private var planet` inicializada pelo construtor. `planet` pode ser modificada com a função membro `movePlanet()`. `movePlanet()` recebe como parâmetro o planeta para o qual o `Alien` está se movendo. Todas as propriedades e parâmetros são do tipo `String`. Sobrescreva `toString()` para retornar `name`, `species` e `planet` no formato `"Alien $name, $species: $planet"`.

Em `main()`, crie dois `Alien`s e mova-os de um `planet` de origem para um `planet` de destino, testando-os usando `toString()` junto com os dados:

| `name`    | `species`  | Origem       | Destino     |
|-----------|------------|--------------|-------------|
| Arthricia | Cat Person | PurgePlanet  | Earth C-137 |
| Dale      | Giant      | Gearworld    | Parblesnops |

Note que uma propriedade `val` é segura para acessar diretamente como uma propriedade `public` em vez de torná-la `private`.