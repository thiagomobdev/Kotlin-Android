## Downcasting (#1)

Modifique `NarrowingUpcast.kt` para chamar as funções na interface estendida. Primeiro, altere `Derived1` e `Derived2` adicionando chamadas para `trace` em cada função. O argumento `trace` é o nome da classe e da função. Por exemplo, `fun h() = trace("Derived2.h()")`.

Agora escreva uma função `checkAndCall(b: Base)` que chama a função membro polimórfica e, em seguida, usa um `when` para downcasting e chama as funções da interface estendida.

<sub> Esta tarefa não contém testes automáticos, então é sempre marcada como "Correto" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>