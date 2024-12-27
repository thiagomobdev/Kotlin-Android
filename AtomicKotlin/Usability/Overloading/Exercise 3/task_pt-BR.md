## Sobrecarga (#3)

Implemente versões sobrecarregadas de uma função chamada `myJoinToString()`. Passe valores padrão para os argumentos em cada invocação de função sobrecarregada, sem usar o suporte da linguagem para esse recurso.

Por que você não pode definir as duas funções a seguir ao mesmo tempo?

```text
fun List<Int>.myJoinToString(separator: String, prefix: String): String
fun List<Int>.myJoinToString(prefix: String, postfix: String): String
```

Descomente a função `myJoinToString(prefix: String, postfix: String)` no código inicial e veja qual erro você obtém.