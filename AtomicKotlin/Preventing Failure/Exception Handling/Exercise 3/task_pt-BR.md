## Tratamento de Exceções (#3)

O código inicial contém uma classe `DataBase` e exceções associadas, e uma classe `NetConnection` e exceções associadas. Há também uma enumeração `Status` para indicar `Success` e `Failed` como uma alternativa às exceções.

Seu objetivo é completar a função `transact()`, que contém referências a um `DataBase` e duas `NetConnection`s. O código inicial mostra como abrir o `DataBase`.

Na função aninhada `transfer(net: NetConnection): Status`, você deve escrever código para abrir `net`, ler dele e escrever os resultados no `DataBase`. Você também deve capturar exceções e retornar `Failed` se alguma ocorrer. Como a última parte de `transfer()`, a cláusula `finally` fecha `net` e lida com exceções a partir disso. Se você conseguir passar por `transfer()`, ele retorna `Success`.

O restante de `transact()` chama `transfer()` para cada um dos objetos `NetConnection`, verificando o resultado e retornando `Failed` de `transact()` se `transfer()` retornar `Failed`. Por último, uma cláusula `finally` tenta fechar o objeto `DataBase`.

Muitas das funções-membro de `DataBase` e `NetConnection` recebem parâmetros de `id: Int` e `level: Int`. O `id` é um número diferente para cada chamada diferente, e `transact()` recebe um parâmetro `level` que é passado para cada chamada. Nas definições das funções-membro, você verá que o `id` é comparado ao `level` para decidir se deve lançar uma exceção. Desta forma, todas as diferentes possibilidades de exceção são testadas uma de cada vez, passando diferentes valores de `level` no código inicial do `main()`.

Você deve considerar se uma operação lança uma exceção *e* se pode fazer algo para se recuperar dessa exceção. Por exemplo, se a abertura do banco de dados falhar dentro de `transact()`, não perdemos nenhum dado, então podemos simplesmente `return Failed` e o programa pode tentar novamente. Mas se o fechamento do banco de dados falhar, significa que não sabemos o estado do banco de dados e provavelmente devemos lançar a exceção em vez de retornar `Failed`. Em contraste, uma falha ao fechar uma conexão de rede não é particularmente problemática.

Novamente, observe como as coisas rapidamente se complicam ao tentar se recuperar de todas as falhas possíveis.

<sub> Esta tarefa não contém testes automáticos, então ela é sempre marcada como "Correta" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>