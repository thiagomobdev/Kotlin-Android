## Propriedades (#2)

Um objeto `Robot` começa na célula `(0, 0)` e pode se mover para a direita, esquerda, para cima e para baixo. Sua localização é armazenada como um par de coordenadas `(x, y)`, onde `(0, 0)` é o canto superior esquerdo:

```text
(x, y)
(0, 0) (1, 0)
(0, 1) (1, 1)
```

Mover para a direita aumenta a coordenada `x`, mover para baixo aumenta a coordenada `y`, enquanto mover para a esquerda e para cima diminui as coordenadas `x` e `y`.

Implemente as funções membros do `Robot` `right()`, `left()`, `up()` e `down()`, cada uma das quais recebe um parâmetro `steps`. Também implemente `getLocation()` que retorna as coordenadas do `Robot` como uma `String` no formato `(x, y)`.