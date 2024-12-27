## Dominando a IDE: Extrair Variável

O IntelliJ IDEA pode extrair um `val` ou `var` automaticamente. Selecione a expressão `getFooResult()` dentro de um template de string, então faça uma das seguintes ações:

- Invoque <span class="control">`Encontrar ação`</span> (pressionando <span class="shortcut">&shortcut:GotoAction;</span>), depois digite `Extrair variável` para encontrar a ação correspondente

- Pressione <span class="shortcut">&shortcut:IntroduceVariable;</span>;

- Escolha <span class="control">`Refatorar | Extrair | Variável...`</span> no menu do aplicativo.

Digite o nome da nova variável. O IntelliJ IDEA tenta sugerir um nome baseado na expressão. Pressione <span class="shortcut">&shortcut:EditorEnter;</span> para finalizar.