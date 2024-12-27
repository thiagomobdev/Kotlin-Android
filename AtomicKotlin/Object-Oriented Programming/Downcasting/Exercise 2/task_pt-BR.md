## Downcasting (#2)

Modifique `FindType.kt` para usar `filterIsInstance()`. Primeiro, encontre todos os objetos `Dog`, depois mapeie cada um dos objetos resultantes para `bark()` e teste o resultado usando `atomictest.eq`. Observe que `filterIsInstance()` produz uma sequência de objetos `Dog` já convertidos.

Há uma segunda forma, mais dinâmica, de `filterIsInstance()`, que leva um *objeto de classe* como parâmetro. Passe `Dog::class.java` como argumento para `filterIsInstance()`, com o restante da expressão conforme descrito no parágrafo anterior. Como essa versão de `filterIsInstance()` é diferente da versão que usa um argumento genérico?

<sub> Esta tarefa não contém testes automáticos, então é sempre marcada como "Correto" quando você executa "Check". Por favor, compare sua solução com a que foi fornecida! </sub>