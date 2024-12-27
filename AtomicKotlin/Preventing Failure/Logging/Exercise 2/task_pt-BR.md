## Registro (#2)

Começando com a solução do Exercício 3 em [Tratamento de Exceções], use `atomiclog` para registrar exceções no arquivo `Logger` `"LoggingSoln2.txt"`. Você precisará modificar `transact()`:

- Adicione uma chamada à função `error()` de `Logger` antes que qualquer exceção seja lançada de `transact()`.

- Substitua exceções irrecuperáveis por chamadas de `error()`.

- Procure por códigos onde nenhuma das exceções é recuperável e reescreva, se possível, para registrar em `error()` e falhar, em vez de ter múltiplas cláusulas `catch`.

<sub> Esta tarefa não contém testes automáticos, então sempre é marcada como "Correto" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>