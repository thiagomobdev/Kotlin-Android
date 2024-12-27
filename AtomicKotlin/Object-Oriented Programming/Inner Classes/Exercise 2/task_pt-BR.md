## inner classes (#2)

Embora uma classe interna contenha uma referência ao objeto da classe externa que a criou, o contrário não é verdadeiro. Se a classe externa precisar de uma referência ao objeto da classe interna, ela deve criar e inicializar essa referência por si mesma.

Crie uma `class Box(contains: String, label: String)`, com classes `inner` `Contents` contendo `contains` como um `val`, e `Destination` contendo `label` como um `val`. Faça duas referências `private`: `contents` e `destination`, inicializadas para instâncias de suas respectivas classes `inner`.

Agora crie um `private val x` que é inicializado para um objeto de uma classe interna anônima. Neste caso, no entanto, a classe base é `Any`. Inclua uma função membro `f()` que retorna `"Any-based"`.

Adicione uma função membro `manifest()` que produza uma `String` contendo as propriedades `contains` e `label` e o resultado de `f()`. O código inicial em `main()` testa a sua solução.

<sub> Esta tarefa não contém testes automáticos, então é sempre marcada como "Correto" quando você executa "Verificar". Por favor, compare sua solução com a fornecida! </sub>