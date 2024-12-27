## Classes Internas (#3)

Defina uma `class Container<T>(iterable: Iterable<T>)` com uma propriedade `items`
que é um `MutableList<T>`. Inicialize `items` usando `iterable` como sua fonte de
dados. Inclua uma função `add(x: T)` que adiciona um elemento a `items`. Defina
uma função membro `selector()` que retorna um objeto de uma classe interna anônima
que implementa:

```kotlin
interface Selector<T> {
  fun end(): Boolean
  fun current(): T
  fun next()
}
```

- `end()` indica se você está no final da `List` de `items`

- `current()` retorna o elemento atual apontado pelo `Selector`

- `next()` avança para o próximo elemento na `List`.

Defina uma função independente `<T> traceAll(select: Selector<T>)` que utiliza
`select` para anexar todos os valores de `current()` a `trace`, e então
retorna `trace`.

Agora faça `Container` herdar de `Iterable<T>`, e adicione uma função chamada
`iterator()` que retorna uma instância de uma classe interna anônima que herda
de `Iterator<T>`. Adicione uma função independente `<T> traceAll2(ib: Iterable<T>)`
que produza o mesmo comportamento que `traceAll()`.

O código inicial contém um `main()` com testes para verificar seu código.

<sub> Esta tarefa não contém testes automáticos,
portanto, ela é sempre marcada como "Correto" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>