## Inicialização Tardia (#3)

O código inicial fornece:

```kotlin
data class Generator(val id: Int)

class Turbine(val id: Int) {
  private lateinit var _generator: Generator
  val generator: Generator
...
```

Adicione um `get()` para `generator` que verifica se `_generator` foi
inicializado, e se não foi, inicializa-o antes de retornar `_generator`. Adicione um
`toString()` que começa com "Generator $id em execução: " e então indica
se o gerador está em operação.

O código inicial fornece:

```kotlin
class PowerPlant(nTurbines: Int = 4) {
  private val turbines: List<Turbine> =
...
```

Conclua a inicialização para `turbines`, depois adicione
`fun generator(number: Int): Generator` que verifica se `number`
está no intervalo, e então retorna o gerador desejado. Por fim, adicione uma função
membro `status()` que use `forEach` para mostrar o status de cada gerador na
`PowerPlant`. O código em `main()` testa sua solução.

<sub> Essa tarefa não contém testes automáticos,
então é sempre marcada como "Correto" quando você executa "Check".
Por favor, compare sua solução com a fornecida! </sub>