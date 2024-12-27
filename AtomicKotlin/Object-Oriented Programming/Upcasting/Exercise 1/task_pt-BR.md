## Upcasting (#1)

O código inicial contém uma interface `Rodent` e suas duas implementações: `Mouse` e `KangarooRat`. `Rodent` declara as funções `eat()` e `speak()`, que devem ser implementadas nas subclasses. `KangarooRat` adiciona uma função `jump()`.

Crie uma função `upcast(rodent: Rodent)` que exiba o resultado de `eat()` e `speak()` usando `trace()`. Mostre que o compilador não permitirá que você chame `jump()`.

`main()` cria uma instância de `Mouse` e `KangarooRat`, e demonstra que você pode chamar `jump()` para o último e passar ambos os objetos para `upcast()`. Adivinhe o resultado de `main()`, depois execute `main()` para verificar sua suposição.