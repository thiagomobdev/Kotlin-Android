## Enumerações (#1)

Este exercício refatora a classe `Robot` usada na seção II. Substitua as quatro funções `right()`, `left()`, `down()` e `up()` por uma função `go()` que recebe um parâmetro adicional `Direction` especificando a direção do movimento.

A localização é armazenada como um par de coordenadas `(x, y)`, onde `(0, 0)` é o canto superior esquerdo:

```text
(x, y)
(0, 0) (1, 0)
(0, 1) (1, 1)
```

Mover para a direita aumenta a coordenada `x`, mover para baixo aumenta a coordenada `y`, mover para a esquerda e para cima diminui as coordenadas `x` e `y`.