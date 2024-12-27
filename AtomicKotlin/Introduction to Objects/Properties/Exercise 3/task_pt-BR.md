## Propriedades (#3)

Um `Robot` pode se mover dentro de um campo quadrado de tamanho `100 x 100`. As bordas
deste campo são "enlaçadas": se o robô está na célula `(0, 0)` e se move um
passo para cima, ele chega na célula `(0, 99)`.

```text
(0, 0)
// up(1)
(0, 99)
// left(10)
(90, 99)
```

Modifique `right()`, `left()`, `up()` e `down()` para implementar este comportamento.

<div class="hint">

Escreva uma função membro auxiliar ("helper") chamada `crossBoundary()` para
verificar as fronteiras. Isso elimina repetição e simplifica o código resultante.

</div>