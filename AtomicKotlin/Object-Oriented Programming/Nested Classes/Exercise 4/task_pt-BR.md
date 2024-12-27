## Classes aninhadas (#4)

Melhore a implementação do padrão *State* em `Ticket.kt`. Altere `Seat` de uma enumeração para uma `classe` `abstrata` não-aninhada, com uma subclasse aninhada para cada tipo de `Seat`. `Seat` contém funções-membro `abstract` para `upgrade()` e `meal()`. Há também um `toString()` para `Seat` que produz o `simpleName` da subclasse específica.

`Ticket` agora se torna um simples contêiner para um objeto `Seat`, juntamente com as funções `upgrade()` e `meal()` que encaminham suas ações para o objeto `Seat`.

Bônus (Desafiador): Por que você não pode usar delegação para `seat` em `Ticket`?

<sub> Esta tarefa não contém testes automáticos, então ela está sempre marcada como "Correto" quando você executa "Check". Por favor, compare sua solução com a fornecida! </sub>