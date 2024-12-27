## Criando classes (#2)

Crie uma classe `Giraffe` com uma única função membro `displayID()` que exibe o endereço do objeto. Chame `substringAfter()` de `String` para extrair o endereço da representação padrão do objeto. Execute o seguinte código e compare os endereços:

```kotlin
val giraffe1 = Giraffe()
val giraffe2 = Giraffe()
val giraffe3 = Giraffe()
giraffe1.displayID()
giraffe2.displayID()
giraffe3.displayID()
```