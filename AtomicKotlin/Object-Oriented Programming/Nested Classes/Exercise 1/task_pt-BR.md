## Classes aninhadas (#1)

Em `FillIt.kt`, `State` é usado apenas para determinar quando não há mais espaços `Blank` em `grid`. Simplifique o programa removendo `State` e retornando um `Boolean` de `turn()`. Depois de fazer isso funcionar, adicione um terceiro jogador mudando `enum class Mark { Blank, X, O }` para `enum class Mark { Blank, X, Y, Z }`. Em `turn()`, use uma expressão `when` para mover-se para o próximo valor de `player`.

<sub> Esta tarefa não contém testes automáticos, por isso está sempre marcada como "Correto" quando você executa "Verificar". Por favor, compare sua solução com a que foi fornecida! </sub>