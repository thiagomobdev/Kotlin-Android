## Inicialização da Classe Base (#2)

O código inicial define classes que descrevem uma configuração de mesa para jantar:

- `Plate`, e `DinnerPlate` herdam de `Plate`
- `Utensil`, e então `Spoon`, `Fork` e `Knife` que todos herdam de `Utensil`
- `Custom` (como em "uma tradição cultural")

Herdar `PlaceSetting` de `Custom`. Dentro de `PlaceSetting`, criar propriedades
do tipo `Spoon`, `Fork`, `Knife` e `DinnerPlate`, nessa ordem. `main()`
cria uma instância de `PlaceSetting` para mostrar a ordem de inicialização.