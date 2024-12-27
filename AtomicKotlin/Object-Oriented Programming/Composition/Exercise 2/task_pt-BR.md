## Composição (#2)

O código inicial contém implementações das classes `Stack` e `Queue`.

`Stack` fornece acesso aos elementos no modo último a entrar, primeiro a sair. Você pode `push()`
novos elementos em `Stack`, e `pop()` o último elemento que foi adicionado.

`Queue` fornece acesso aos elementos no modo primeiro a entrar, primeiro a sair. Você pode `put()` novos
elementos em `Queue`, enquanto `poll()` retorna o primeiro elemento.

No código inicial, tanto `Stack` quanto `Queue` estendem `ArrayList`, o que abre
muitos métodos na API pública (por exemplo, você pode obter o primeiro elemento em `Stack`, o que contradiz seu design). Use composição ao invés de
herança para implementar `Stack` e `Queue`.