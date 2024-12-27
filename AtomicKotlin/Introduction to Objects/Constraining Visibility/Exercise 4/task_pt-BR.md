## Dominando a IDE: expandir seleção

Quando você aplica refatorações como <span class="control">`Extract Property`</span>, é necessário selecionar a expressão que você deseja extrair. Esta expressão pode ser bastante complicada.

A ação <span class="control">`Extend Selection`</span> acessada usando o atalho <span class="shortcut">&shortcut:EditorSelectWord;</span> é muito útil aqui: ela seleciona a expressão externa, aumentando a seleção a cada passo. A ação inversa é chamada <span class="control">`Shrink selection`</span> e é acessível pelo atalho <span class="shortcut">&shortcut:EditorUnSelectWord;</span>.

Coloque o cursor na linha `println("Incorrect input: $x should be positive")` e expanda e reduza a seleção para ver como funciona. Continue a expandir a seleção até que todo o arquivo seja selecionado.