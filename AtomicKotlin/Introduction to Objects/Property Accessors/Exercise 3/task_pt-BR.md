## Acessores de propriedade (#3)

Crie uma classe `MessageStorage` com duas propriedades: uma `privada` chamada `_messages` do tipo `MutableList<String>` e uma `pública` chamada `messages` do tipo `List<String>`. O getter personalizado para `messages` retorna `_messages`.

Como `_messages` é `private`, seu conteúdo só pode ser alterado dentro da classe `MessageStorage`. Defina uma função membro `addMessage()` que recebe um parâmetro do tipo `String` e o adiciona à lista `_messages`.