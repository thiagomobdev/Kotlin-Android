## Mapas (#3)

Se você costuma selecionar elementos de uma `List` usando chaves, faz sentido otimizar usando um `Map` em vez de uma `List`.

Altere a implementação interna da classe `Cage` para armazenar elementos em um `Map` em vez de uma `List`. Para obter um elemento, use a função membro `getValue()`, que lança `NoSuchElementException` se a chave estiver ausente.