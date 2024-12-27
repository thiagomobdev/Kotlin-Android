## Lista de Argumentos Variáveis (#2)

Escreva uma função `printArgs()` com um `String` como o primeiro parâmetro, e um parâmetro `vararg` de `Int` como o segundo parâmetro. `printArgs()` exibe seus argumentos no console: primeiro o `String`, depois os `Int`s, separados por vírgulas e cercados por colchetes.

Por exemplo, a saída para `printArgs("Números: ", 1, 2, 3)` deve ser:

```text
Números: [1, 2, 3]
```

<div class="hint">

Use `toList()` no parâmetro `vararg` para obter a representação `String` solicitada.

</div>