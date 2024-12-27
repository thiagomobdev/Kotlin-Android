## Dominando o IDE: Debug

Depurar é uma maneira poderosa de descobrir o que está acontecendo no seu código. Você pode observar estados intermediários do programa e as mudanças entre esses estados.

Clique no ícone ao lado da função `main()` e escolha <span class="control">`Debug`</span>. Note que há um atalho especial para isso: <span class="shortcut">&shortcut:DebugClass;</span>. O programa apenas executa e exibe o resultado, porque você não definiu nenhum ponto onde a execução deve ser pausada.

Os pontos onde você deseja pausar a execução para observar o estado das variáveis são chamados de *pontos de interrupção* (breakpoints). Para criar breakpoints de linha no editor, primeiro coloque o cursor na linha desejada do código-fonte. Em seguida, faça uma das seguintes ações:

- Clique na área de margem esquerda em uma linha onde você deseja alternar um breakpoint.

- No menu principal, escolha <span class="control">`Executar | Alternar Linha de Breakpoint`</span>.

- Pressione <span class="shortcut">&shortcut:ToggleLineBreakpoint;</span>.

Defina breakpoints nas linhas 6 e 7:

```kotlin
x = 2
println(x)
```

Em seguida, comece a depurar o programa novamente e observe como ele para no primeiro breakpoint. A janela de depuração abaixo da tela mostra os valores de todas as variáveis. Continue o processo clicando em <span class="control">`Retomar programa`</span> à esquerda da janela de depuração ou pressionando <span class="shortcut">&shortcut:Resume;</span>. Note como o valor da variável `x` muda após a atribuição.

Para parar a depuração, você pode tanto finalizar o programa e ver o resultado quanto interrompê-lo explicitamente. Pressione o botão <span class="control">`Parar`</span> para interromper o processo de depuração.