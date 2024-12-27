## Polimorfismo (#2)

O código inicial contém a classe `Frog`, que estende `Animal`. `Animal` define duas funções membros `talk()` e `jump()` que são sobrescritas por `Frog`. Todas as funções exibem suas informações usando `trace()`. Observe que um `Animal` sempre `talk()` logo após `jump()`.

`main()` cria um `Frog`, armazena-o como `Animal` e então chama `jump()`. Sua tarefa é adivinhar qual será a saída.