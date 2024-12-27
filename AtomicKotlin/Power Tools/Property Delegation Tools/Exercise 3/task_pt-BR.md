## Ferramentas de Delegação de Propriedade (#3)

Crie uma função genérica `observe()` que use `trace()` para capturar
`"$propertyName $oldValue to $newValue"` sempre que uma propriedade mudar. Certifique-se
de que funcione com:

```kotlin
class Product(nm: String = "<0>", id: Int = -1) {
  var name by observable(nm, ::observe)
  var ident by observable(id, ::observe)
  override fun toString() = "$name $ident"
}
```

E que o código inicial em `main()` seja executado com sucesso.

<sub> Esta tarefa não contém testes automáticos,
portanto, sempre é marcada como "Correto" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>