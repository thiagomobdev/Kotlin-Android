## Limpeza de recursos (#3)

O objetivo deste exercício é verificar se, independentemente de como seu código sai de um bloco `use()`, a função `close()` é sempre chamada. Reutilize a classe `Cleanup` que você criou no Exercício 2, que está incluída no código base, juntamente com um `enum class Option { Normal, Return, Throw }`.

Defina uma função `verifyClose(opt: Option)`. `verifyClose()` cria um objeto `Cleanup` e invoca `use()` nele. A lambda para `use()` contém uma expressão `when` que implementa estas regras. Quando `opt` é:

- `Normal`: `f()` é chamado, depois `g()` (dentro da expressão `when`), e então `h()`, antes de sair do bloco `use()`.

- `Return`: `f()` é chamado e em seguida `return`. Isso sai do meio do bloco `use()`.

- `Throw`: `f()` é chamado e então uma `Exception` é lançada do meio do bloco `use()`.

`main()` testa seu código.

<sub> Esta tarefa não contém testes automáticos, portanto, é sempre marcada como "Correto" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>