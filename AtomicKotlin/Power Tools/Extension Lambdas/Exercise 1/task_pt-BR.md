## Lambdas de Extensão (#1)

Defina as seguintes funções para que se comportem da mesma forma que seus equivalentes na biblioteca padrão:

- `createString()` se comporta como `buildString()`. Comece criando uma nova instância de `StringBuilder`, chame o argumento lambda de extensão sobre ele, então retorne o resultado como `String`.

- `createList()` se comporta como `buildList()`. Esta função tem um parâmetro genérico. Crie um `ArrayList<T>`, chame o argumento lambda de extensão sobre ele, e retorne uma `List` somente leitura.

- `createMap()` se comporta como `buildMap()`. Esta função tem dois parâmetros genéricos. Crie um `HashMap<K, V>`, chame o argumento lambda de extensão sobre ele, e retorne um `Map` somente leitura.

O código em `main()` testa suas funções em comparação com as versões da biblioteca padrão. Note que `buildList()` e `buildMap()` inferem seus parâmetros genéricos.

<sub> Esta tarefa não contém testes automáticos, então ela é sempre marcada como "Correto" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>