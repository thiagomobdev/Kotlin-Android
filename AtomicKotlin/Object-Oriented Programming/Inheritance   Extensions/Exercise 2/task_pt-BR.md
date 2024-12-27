## Herança e Extensões (#2)

O código inicial define a seguinte hierarquia: uma superclasse `Dog` e duas subclasses, `ToyDog` e `RealDog`. Implemente uma função de extensão que estende `Dog`. `play()` primeiro chama `speak()`, depois `sit()`.

Implemente mais duas funções de extensão com o mesmo nome `play()` que estendem `RealDog` e `ToyDog`. Ambas as funções devem primeiro chamar `Dog.play()`, então `RealDog.play()` deve chamar `feed()`, enquanto `ToyDog.play()` deve chamar `changeBatteries()`.

Adivinhe o que o código em `main()` irá rastrear e depois verifique você mesmo.

<div class="hint">

Para chamar uma função `Dog.play()` dentro de uma extensão para uma subclasse de `Dog` (por exemplo, dentro de `ToyDog.play()`), faça um casting explícito de `this` para `Dog`:

```kotlin
(this as Dog).play()
```

</div>