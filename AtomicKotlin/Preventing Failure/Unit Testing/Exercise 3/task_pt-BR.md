## Teste Unitário (#3)

Teste a classe `SpaceShipControls` do arquivo `ClassDelegation/SpaceShipControls.kt`.
Use uma velocidade de 10 para cada teste. Verifique se um novo objeto de teste é criado para
cada teste, imprimindo "init" cada vez que um objeto de teste é criado.

Em vez de chamar `assertEquals()` do `kotlin.test` diretamente, adicione a
seguinte função genérica no escopo do arquivo:

```kotlin
infix fun <T> T.aeq(actual: T) = assertEquals(this, actual)
```

Para usar `aeq`: *expectedValue* `aeq` *actualValue*.

<sub> Esta tarefa não contém testes automáticos,
então sempre é marcada como "Correto" quando você executa "Check".
Por favor, compare sua solução com a fornecida! </sub>