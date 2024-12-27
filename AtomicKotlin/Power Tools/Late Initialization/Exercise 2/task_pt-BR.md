## Inicialização Tardia (#2)

Crie uma classe `A` contendo um `String` `lateinit` chamado `s`, e uma função
`initialize()` que define `s` como "Initialized" e retorna `this`.

Crie uma classe `B` que contém uma propriedade `a` usando inicialização `lazy` para
criar e inicializar um `A`. O código em `main()` testa sua solução.

Se `A` for a biblioteca que alguém criou e que você está consumindo,
a inicialização `lazy` pode ser uma maneira conveniente de configurar suas propriedades `lateinit`.

<sub> Esta tarefa não contém testes automáticos,
então é sempre marcada como "Correto" quando você executa "Checar".
Por favor, compare sua solução com a fornecida! </sub>