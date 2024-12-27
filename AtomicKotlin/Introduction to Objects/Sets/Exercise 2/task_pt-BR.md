## Conjuntos (#2)

Escreva a função `experiment()` para gerar números `Int` aleatórios de 1 a 25 e coloque os resultados em um `Set`. Conte a quantidade de números `Int` gerados aleatoriamente necessários antes que o `Set` contenha todos os valores de 1 a 25. Retorne este valor como resultado da função `experiment()`. Note que os resultados são diferentes para cada chamada de `experiment()` porque dependem de valores aleatórios.

Use `Random.nextInt(25) + 1` para obter um número aleatório de 1 a 25.

`main()` repete seu experimento 1000 vezes e exibe o resultado médio.