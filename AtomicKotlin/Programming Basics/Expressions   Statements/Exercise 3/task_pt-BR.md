## expressões & instruções (#3)

Adivinhe o que o seguinte código exibirá e depois verifique usando Kotlin:

```kotlin
var i = 1
println(i-- - --i)
```

Abra a dica no IntelliJ IDEA para ver a explicação.

<div class="hint">

Esse código pode ser reescrito como:

```kotlin
// i-- significa:
// Primeiro o valor atual é produzido,
// depois o valor é decrementado.
val left = i // i: 1, left: 1
i -= 1 // i: 0

// --i significa:
// Primeiro o valor é decrementado,
// depois o valor atual é produzido.
i -= 1 // i: -1
val right = i // i: -1, right: -1

val result =
  left - right // 1 - (-1) = 1 + 1 = 2
println(result)
```

</div>