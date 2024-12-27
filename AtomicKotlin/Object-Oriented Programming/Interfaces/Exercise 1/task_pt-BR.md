## Interfaces (#1)

Crie uma classe `Cloud` que implementa `Computer` e contém uma `List<Node>`.
A `class Node(private val result: Int)` também deve implementar `Computer`, e deve
implementar `calculateAnswer()` de modo que simplesmente retorne `result`.

Escreva o construtor `Cloud` para aceitar um argumento `n` indicando o número de
`Node`s na nuvem. Faça a contagem até `n` e coloque cada contagem como o valor de `result`
do `Node` que você está criando. Implemente `calculateAnswer()` de `Cloud`
para retornar a soma das respostas em todos os `Node`s.