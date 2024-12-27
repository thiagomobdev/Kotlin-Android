## Restringindo visibilidade (#3)

Um `Robot` pode apenas se mover para frente. Verifique se o argumento `steps` é um número positivo. Para `right()`, `left()`, `down()` e `up()`, um argumento `steps` negativo ou zero não deve atualizar a localização. Em vez disso, deve produzir a seguinte saída no console usando esta `String`:

```text
"argumento steps deve ser positivo, é $steps"
```

No `main()`, teste seu código usando valores positivos, negativos e zero para `steps`.