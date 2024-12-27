## Herança (#3)

O código inicial contém a hierarquia de classes:

- `Game`
- `BoardGame`, que herda de `Game`
- `Chess`, que herda de `BoardGame`

Adicione uma propriedade `val initOrder = mutableListOf<String>()` a `Game`. Dê a cada classe uma cláusula `init` que anexará o nome de sua classe a `initOrder`. Em `main()`, crie um objeto `Chess` e mostre a ordem de inicialização das classes base.