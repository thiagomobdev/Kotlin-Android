## `var` & `val` (#3)

Defina duas `var`s: `x` e `y`. Troque os seus conteúdos. Primeiro tente `x = y`, `y = x`, depois corrija a solução errônea:

```kotlin
var x = 1
var y = 2
// Realizar troca aqui
println(x) // 2
println(y) // 1
```

Seu código deve permanecer inalterado para diferentes inicializadores, como `var x = "primeiro"`, `var y = "segundo"`. Assim, usar `x = 2`, `y = 1` não é a solução esperada.

<div class="hint">

Você pode precisar introduzir um terceiro `val` auxiliar.

</div>