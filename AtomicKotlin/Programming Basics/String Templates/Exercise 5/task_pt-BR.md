## Dominando a IDE: renomear

A IDE simplifica muitas ações comuns. Por exemplo, suponha que você queira renomear um identificador. Inventar um bom nome é difícil, por isso é frequentemente um processo iterativo. Após usar uma função, por exemplo, você pode pensar em um nome melhor para ela.

<span class="control">`Localizar`</span> e <span class="control">`Substituir`</span> podem levar a resultados inesperados, porque o nome pode aparecer em diferentes contextos, por exemplo, dentro de strings ou comentários. No exemplo de código, você pode ver `answer` tanto como um nome para um `val` quanto como parte de uma string literal. Fica ainda mais complicado ao renomear uma função porque esta pode ser usada em muitos arquivos.

A IDE permite que você renomeie uma declaração automaticamente. Coloque o cursor sobre o nome do `val` e pressione <span class="shortcut">&shortcut:RenameElement;</span>. Você também pode escolher <span class="control">`Refatorar`</span> no menu do aplicativo e então escolher <span class="control">`Renomear`</span>.

Renomeie o nome do `val` para `result` sem mudar a palavra "answer" na string literal. A string deve se tornar: "The answer is $result".