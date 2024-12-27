## Dominando a IDE: Analisar Stacktrace

Você pode navegar automaticamente para a linha onde uma exceção foi lançada
clicando nela no stacktrace. Execute `Task.kt` para ver o stacktrace e
navegar para diferentes linhas.

Você também pode analisar o stacktrace copiado de outro lugar, como um rastreador de bugs. Copie o seguinte stacktrace e chame a ação
<span class="control">`Analyze stacktrace`</span>:

```text
Exception in thread "main" java.lang.IllegalStateException: something is wrong
    at stacktrace.TaskKt.foo(Task.kt:4)
    at stacktrace.TaskKt.bar(Task.kt:8)
    at stacktrace.TaskKt.main(Task.kt:12)
```