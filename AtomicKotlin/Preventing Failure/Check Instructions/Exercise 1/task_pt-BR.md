## Verificar instruções (#1)

Crie uma função `f(s: String): String`. Adicione chamadas `require()` que usem as
seguintes mensagens de erro (inferir os testes a partir das mensagens):

- `"s não deve estar vazio, é [$s]"`

- `"s não deve estar em branco, é [$s]"`

- `"s deve conter 3 partes separadas por '-', é [$s]"`

Se todos os `require()`s forem bem-sucedidos, retorne `s`.

Crie uma função `g(d: Double): Double` que use `require()` para garantir que
`d` seja maior que zero e menor ou igual a 10.0. Não forneça uma mensagem de erro
personalizada para `require()`. Se o `require()` for bem-sucedido, retorne `d`.

O código inicial em `main()` testa `f()` e `g()`.

<sub> Esta tarefa não contém testes automáticos,
portanto, ela sempre é marcada como "Correto" quando você executa "Verificar".
Por favor, compare sua solução com a fornecida! </sub>