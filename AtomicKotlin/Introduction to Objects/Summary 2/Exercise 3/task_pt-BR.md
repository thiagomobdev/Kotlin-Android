## Resumo 2 (#3)

Crie uma classe `FixedSizeHolder` com um parâmetro de construtor que define o número máximo de objetos `Any` que podem ser mantidos. Adicione propriedades `size` e `full` de leitura somente. Se o usuário chamar `add()` quando estiver `full`, lance uma `IllegalStateException`.