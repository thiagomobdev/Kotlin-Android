## O Tipo `Nothing` (#1)

Crie uma classe de exceção chamada `Failure` que recebe um parâmetro `msg: String` e o passa para o construtor da classe base. Escreva uma função `fail(msg: String)` que passa `msg` para `trace()`, e então lança uma `Failure(msg)`.

Agora escreva suas próprias versões de `require()` e `check()` (das [Instruções de Verificação]) que usam `fail()`. O código inicial em `main()` testa suas funções.

<sub> Esta tarefa não contém testes automáticos, então é sempre marcada como "Correta" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>