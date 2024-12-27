## Classes Seladas (#1)

Modifique `SealedClasses.kt`. Primeiro, mova a propriedade `capacity` de `Bus` para a classe `Transport` e adicione `trace("size ${transport.capacity}")` após a expressão `when` em `travel()`. Em seguida, adicione novas subclasses:

- `Tram`, contendo um `val route: String`
- `Plane` contendo um `val flightNumber: String`

Modifique `travel()` para acomodar essas novas subclasses. Adicione `Tram` e `Plane` à `List` em `main()`.