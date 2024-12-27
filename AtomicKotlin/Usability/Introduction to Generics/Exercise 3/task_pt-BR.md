## Introdução a Genéricos (#3)

Crie uma classe genérica chamada `CountingSet` que contabiliza o número de vezes que cada elemento foi adicionado a ela. Implemente-a usando um `Map` privado. Ela deve definir três funções membro:

+ `add(element: E)` adiciona um novo elemento. Se o programador tentar `add()` um elemento que já está no `CountingSet`, o contador correspondente deve ser incrementado.

+ `count(element: E)` retorna o número de vezes que cada elemento foi adicionado ao `CountingSet`. Se o elemento não estiver presente no `CountingSet`, o resultado é zero.

+ `toSet()` retorna um conjunto de elementos armazenados.