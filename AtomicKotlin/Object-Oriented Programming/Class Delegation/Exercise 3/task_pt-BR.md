## Delegação de Classe (#3)

O que acontece quando você delega para duas interfaces que têm um ou mais membros em comum? O código inicial contém duas interfaces `A` e `B` que ambas têm uma função membro `foo()`.

Crie uma classe `AA` que implementa `A` e registra `"A.foo()"` para `foo()` e `"A.bar()"` para `bar()`. Crie uma implementação similar `BB` que implementa `B`. Agora, crie uma classe `Delegation` que delega tanto para `A` quanto para `B`. O código em `main()` testa sua solução. O IntelliJ ou o compilador irá guiá-lo na resolução dos problemas resultantes.

<sub> Esta tarefa não contém testes automáticos, então ela sempre é marcada como "Correta" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>