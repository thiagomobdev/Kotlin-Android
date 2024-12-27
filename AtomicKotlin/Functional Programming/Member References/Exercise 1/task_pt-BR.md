## Referências de Membros (#1)

O código inicial inclui uma classe `data` chamada `Pet` que contém uma propriedade `var String` chamada `name` e uma propriedade `enum` chamada `habitat`. A enumeração `Habitat` pode ser `LAND`, `WATER` ou `AMPHIBIOUS`, e também contém uma função membro `livesIn(pet: Pet)` que verifica se `pet` vive em um determinado `Habitat`.

O código inicial `main()` cria uma `List<Pet>`. Usando `filter()` junto com referências de membros, implemente três funções `liveOnLand()`, `liveInWater()` e `areAmphibious()` que identificam quais pets na lista vivem em terra, na água ou são anfíbios. Por fim, use `partition()` para implementar a função `partitionAmphibious()` que divide os pets entre aqueles que são anfíbios e os que não são.