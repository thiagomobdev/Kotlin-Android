## O tipo `Nothing` (#3)

Crie `Failure` e `fail()` como nos dois exercícios anteriores, mas não chame
`trace()` em `fail()`. Adicione uma `private var _debug` no escopo do arquivo e inicialize
como `true`. Defina `fun debug(test: Boolean)` de modo que sempre chame
`trace()` para verificar se foi chamado (veja o código inicial em `main()` para
descobrir o formato da mensagem de `trace()`), mas só realize a atividade `debug()`
se `_debug` for `true`. O código inicial em `main()` testa seu trabalho.

<sub> Esta tarefa não contém testes automáticos,
então é sempre marcada como "Correta" quando você executa "Check".
Por favor, compare sua solução com a fornecida! </sub>