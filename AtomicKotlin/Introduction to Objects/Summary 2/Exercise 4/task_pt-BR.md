## Resumo 2 (#4)

Crie uma classe `Dictionary` que armazena traduções para palavras. Ela inclui uma função membro `addTranslations(word: String, translations: String)`. As `translations` para a `word` são delimitadas por espaços em branco. Se `word` já estiver presente no `Dictionary`, `addTranslations()` lança uma `IllegalArgumentException` com a mensagem `"Dictionary already has translations for '$word'"`.

`Dictionary` também contém uma propriedade somente leitura `translations` que é um `Map` de `List`s contendo `String`s. As chaves do `Map` também são `String`s.

<div class="hint">

Use `split(" ")` em `String` para dividir palavras por espaços em branco.

</div>

<div class="hint">

Defina uma propriedade auxiliar chamada `_translations` contendo um `Map` mutável de traduções. A leitura da propriedade `translations` deve simplesmente retornar `_translations` como um `Map` somente leitura.

</div>