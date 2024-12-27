## Resumo 1 (#10)

Crie uma função `showSnake(rows: Int, columns: Int)` que exiba uma tabela preenchida com números sequenciais em forma de serpente. Por exemplo, `showSnake(3, 3)` deve produzir o seguinte:

```text
 0 1 2
 5 4 3
 6 7 8
```

Para alinhar corretamente, use uma string de formato como `"%3d".format(number)` para adicionar espaços extras antes do número. O número antes de `d` indica quantos caracteres o número deve ocupar junto com os espaços adicionais. Isso depende do maior número, o último: coloque exatamente um espaço antes dele.

<div class="hint">

Use a string `"%${width}d".format(value)`, onde a variável `width` armazena a largura de cada célula numérica, para formatar o valor com base na entrada real (`rows` e `columns`).

</div>