## Delegação de classe (#1)

Modifique `ModelingMI.kt` adicionando `fun resize(scale: Int): Int` a `Rectangle`, que apenas retorna `scale`. Adicione um `fun rightClicked(): Boolean` a `MouseManager`. Chame as novas funções em `main()` e verifique que `Button` não precisa de modificações para suportar as novas interfaces.