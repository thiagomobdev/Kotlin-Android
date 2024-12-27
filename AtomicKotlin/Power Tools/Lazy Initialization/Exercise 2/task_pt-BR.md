## Inicialização Tardia (#2)

Crie uma classe `Outer` contendo uma `inner class` chamada `Inner`, ambas com um
`init` usando `trace()` que anuncia "construtor de <nome da classe>". Adicione três `val`s `lazy` do tipo `String`, cada uma com um inicializador rastreando "Inicializando <nome da classe>.<nome da propriedade>": `s1` e `s2` em `Outer`, e `si` em `Inner`. Os inicializadores produzem "Hi" para `s1`, "Hello $s1" para `s2`, e "Howdy $s2" para `si`. O código em `main()` testa sua solução.

<sub> Esta tarefa não contém testes automáticos,
então ela sempre é marcada como "Correto" quando você executar "Verificar".
Por favor, compare sua solução com a fornecida! </sub>