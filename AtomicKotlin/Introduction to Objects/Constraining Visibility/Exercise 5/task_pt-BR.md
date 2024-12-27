## Dominando o IDE: Extrair Função

O IntelliJ IDEA permite extrair código repetitivo em uma função. Selecione o seguinte código no corpo da primeira função:

```text
if (x <= 0) {
    println("Entrada incorreta: $x deve ser positivo")
    return
}
```

Digite a ação <span class="control">`Extrair Função`</span>,
ou use o atalho <span class="shortcut">&shortcut:ExtractMethod;</span>,
ou clique no menu principal para escolher
<span class="control">`Refatorar | Extrair | Função`</span>.
Digite o novo nome da função `checkArgument` e pressione
<span class="shortcut">&shortcut:EditorEnter;</span>.

Concorde em <span class="control">`Processar Duplicatas`</span>, para que a segunda ocorrência do mesmo trecho de código também seja extraída.