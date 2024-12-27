## Pacotes (#2)

O código inicial define três pacotes `aaa`, `bbb` e `ccc` através dos arquivos
`aaa.kt`, `bbb.kt` e `ccc.kt`.

No primeiro pacote `aaa`, defina:

- `val x = 10`

- Uma função de nível superior `fa()` que recebe um parâmetro `Int` e retorna esse
    argumento multiplicado por `x`

- Uma classe `K` com um `toString()` que retorna `"K"`

No `package bbb`, `importe` todos os componentes de `aaa` e os utilize em uma
função `g()`, que recebe um parâmetro `Int` `i` e retorna o seguinte literal
`String` usando membros de `aaa`:

```text
"${K()} ${fa(i)}"
```

Importe tudo de `bbb` para `package ccc`. No `main()`, chame
`println(g(1))`. Você pode ver que sem importar os 
componentes do `package aaa` você não pode acessar nenhum deles.