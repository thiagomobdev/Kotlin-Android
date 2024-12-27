## Funções de Alta Ordem (#2)

Reescreva a seguinte função usando uma única chamada para `mapNotNull()`:

```kotlin
fun List<Int>.transform(): List<Int> =
  filter { it % 2 == 0 }.map { it * it }
```