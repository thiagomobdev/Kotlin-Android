## Resumo 1 (#7)

Escreva uma função que use um laço `while` para contar as ocorrências de um dígito específico dentro de um número decimal. Coloque o número decimal em uma `var` chamada `worker`. Cada passagem pelo laço testa o dígito à direita de `worker`, e, ao final do laço, remove esse dígito da direita de `worker`. A `var occurrences` contém o número de ocorrências do dígito que você procura.

Esta tabela mostra os valores durante cada laço ao encontrar ocorrências do `1` em `121341`:

| `worker` | Removido | `occurrences` |
|----------|----------|---------------|
| 121341   | -        | 0             |
| 12134    | 1        | 1             |
| 1213     | 41       | 1             |
| 121      | 341      | 1             |
| 12       | 1341     | 2             |
| 1        | 21341    | 2             |
| -        | 121341   | 3             |

Os valores "Removido" estão na tabela para clareza, mas você não precisa de uma variável "Removido" na sua solução.