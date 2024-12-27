## Polimorfismo (#3)

Crie uma interface chamada `Connection` com uma função membro `send(message: String)`. Implemente essa interface como `Text`, `Phone` e `Email`. Em cada implementação, sobrescreva `send()` para que ele chame `trace()` com uma `String` como `"'$message' via Text"` (para a classe `Text`).

Agora, crie uma classe `Message` que receba como argumentos do construtor um `val text: String` e um `val connection: Connection`. Defina uma função membro `transmit()` que envie o `text`.

O código em `main()` testa sua solução.

<sub> Esta tarefa não contém testes automáticos, portanto, está sempre marcada como "Correto" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>