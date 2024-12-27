## Manipulação de Exceções (#1)

Crie `Hamster` como uma `data class` com um parâmetro de construtor `val name: String`.

Agora crie uma classe `HamsterCageException` que herda de `Exception`. `HamsterCageException` recebe um parâmetro de construtor `val msg: String` e sobrescreve `toString()` para produzir `"HamsterCageException: $msg"`. Crie três exceções que herdam de `HamsterCageException`:

- `CageFullException(val limit: Int)`: Chama o construtor da classe base com `"Cage full > $limit"`.

- `NoSuchHamsterException(val id: String)`: Chama o construtor da classe base com `"No Hamster $id"`.

- `OutOfWaterException`: Chama o construtor da classe base com `"Cage out of water"`.

Crie a classe `HamsterCage(val capacity: Int)`. Você não pode colocar outro `Hamster` em um `HamsterCage` se ele já atingiu a `capacity`.

Em `HamsterCage`, armazene os `Hamsters` em um `HashSet`. Escreva as seguintes funções membro:

- `add(h: Hamster)` lança `CageFullException(capacity)` se a jaula tiver atingido a `capacity`.

- `get(name: String)` lança `NoSuchHamsterException(name)` se não for possível encontrar um `Hamster` com esse `name`.

- `feed()` gera um número aleatório entre 0 e 10 e lança `OutOfWaterException()` se o resultado for maior que 8. Se for bem-sucedido, retorna `"Feeding complete"`.

O código inicial contém uma `List` de `Hamsters` inicializada. Escreva uma função `test(hc: HamsterCage)` que exercita cada função membro:

- `add()` tentando adicionar cada objeto em `hamsters`.

- `get()` usando para `name` o primeiro `Hamster` em `hamsters`, depois use `"Morty"`.

- Chame `feed()` três vezes.

`test()` chama `trace()` para qualquer operação que produza um resultado. Em cada caso, capture a possível exceção e chame `trace()` nessa exceção.

`main()` contém código inicial passando um `HamsterCage` para `test()`, e a saída esperada para `trace`.

Considere a complexidade do código resultante e avalie quais exceções poderiam ser substituídas por código comum não excepcional.

<sub> Esta tarefa não contém testes automáticos, então sempre é marcada como "Correto" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>