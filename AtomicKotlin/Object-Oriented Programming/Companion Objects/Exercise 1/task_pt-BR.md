## Objetos de companhia (#1)

A ideia do *Factory* mostrada em `CompanionFactory.kt` se torna mais interessante quando você introduz múltiplas fábricas, assim a mesma configuração pode facilmente criar diferentes tipos de objetos.

Comece com duas interfaces:

```kotlin
interface Vendor {
  fun pencil()
  fun pen()
}

interface VendorFactory {
  fun create(): Vendor
}
```

Crie `Vendor1` e `Vendor2` que implementam `Vendor`. As funções membro usam `trace()` para relatar o nome da classe `Vendor` e "pencil" ou "pen". Cada implementação de `Vendor` também possui um objeto companion com uma propriedade `factory` contendo uma classe interna anônima que implementa `VendorFactory`.

Agora escreva uma função independente `consumer(factory: VendorFactory)` que usa `factory` para criar um `Vendor`. Use esse `Vendor` para chamar `pencil()` e `pen()`. O código inicial em `main()` validará sua solução.

<sub> Esta tarefa não contém testes automáticos, então ela sempre é marcada como "Correto" quando você executa "Check". Por favor, compare sua solução com a provida! </sub>