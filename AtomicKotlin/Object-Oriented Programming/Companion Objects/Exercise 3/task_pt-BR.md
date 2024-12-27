## Objetos Companion (#3)

Crie esta classe:

```kotlin
data class ID(
  val name: String,
  val id: String = idGenerator()
) {
  companion object {
    // ...
    private fun idGenerator() = TODO()
    fun test(n: Int) = List(n) {
      ID(('a' + it).toString())
    }
  }
}
```

`ID` contém apenas um objeto companion com `idGenerator()` e o código para
suportar essa função: o `tamanho` de cada `id`, um gerador de números aleatórios
semeado com o valor `47`, e uma `fonte` de caracteres usados para criar
aleatoriamente o `id`. Em `main()`, a saída é verificada usando `test()`, que
gera uma `List` de `n` objetos `ID` -- modifique seu código até que corresponda
à saída de `test()` em `main()`.

Agora complete esta classe:

```kotlin
class Bank(val name: String) {
  // Contas solicitadas, mas não concluídas:
  private val applied = TODO()
  private val accounts = TODO() // Concluídas
  private class Account(val name: String) {
    var id: ID? = null
    private var number: Long? = null
    fun addID(verifiedID: ID) = TODO()
    companion object Numbers {
      private fun nextAccountNumber() = TODO()
    }
    fun finish() = TODO()
    override fun toString() = "$id $number"
  }
  fun applyForAccount(name: String) = TODO()
  fun addID(id: ID) = TODO()
  fun completeAccount(verifiedID: ID) = TODO()
  override fun toString() =
    accounts.joinToString("\n")
}
```

Este é um exemplo do padrão *Builder*, para uma classe que requer múltiplos
passos durante a criação do objeto. `applyForAccount()` inicia a criação de uma nova
`Account` e a adiciona à lista `applied`. `addID()` adiciona um objeto `ID` à
`Account`, e `completeAccount()` recebe um `ID`, adiciona um `number` à conta,
e move a `Account` da lista `applied` para a lista `accounts`.

O código inicial em `main()` validará sua solução.

<sub> Esta tarefa não contém testes automáticos,
então sempre é marcada como "Correta" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>