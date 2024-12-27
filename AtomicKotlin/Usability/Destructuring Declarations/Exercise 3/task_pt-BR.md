## Declarações de Desestruturação (#3)

O código inicial contém uma classe `data` `Person` com duas propriedades: `name: String` e `age: Int`. Escreva uma função `displayPersonInfo()` que aceita um parâmetro `person: Person`, que será desestruturado usando a seguinte sintaxe:

```kotlin
val (name, age) = person
```

`displayPersonInfo()` deve exibir os valores correspondentes no console:

```text
Nome: $name
Idade: $age
```

Adicione uma nova segunda propriedade `surname` entre `name` e `age` em `Person`. A primeira propriedade deve ser `name` e a terceira propriedade deve ser `age`. Não modifique `displayPersonInfo()`. Em `main()`, demonstre que `displayPersonInfo()` agora funciona incorretamente.