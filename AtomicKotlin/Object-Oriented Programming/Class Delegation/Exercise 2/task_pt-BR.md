## Delegação de Classe (#2)

O Exercício 1 em [Herança & Extensões] usa
composição para adaptar `Crocodile` para funcionar com `interactWithDuck()`. Isso
produz uma inconsistência ao usar `CrocoDuck` com a
função `interactWithCrocodile()`---o `crocodile` composto deve ser explicitamente
nomeado durante a chamada:

```kotlin
interactWithCrocodile(honestlyDuck.crocodile)
```

Modifique a solução para esse exercício usando delegação de classe para que você possa chamar uma
função `interactWithCrocodile(honestlyDuck)`. Torne o parâmetro `crocodile` de `CrocoDuck`
`private` para que você *não possa* expor a propriedade.

<sub> Esta tarefa não contém testes automáticos,
portanto, sempre é marcada como "Correto" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>