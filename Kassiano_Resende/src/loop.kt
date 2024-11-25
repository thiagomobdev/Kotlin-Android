fun main(){
    print("Por favor digite a senha: ")
    val senha = readlnOrNull()?.toInt()
    if (senha == 123) {
        println("Acesso concedido!")
    }else {
        println("Você digitou a senha errada.")


    }
    println("Digite um numero: ")
    val a = readlnOrNull()?.toIntOrNull()
    println("Digite outro numero: ")
    val b = readlnOrNull()?.toIntOrNull()

    if (a != null) {
        if(a > b!!) {
            println("$a é maior que $b")
        }
        }
        if (a == b ){
            println("Os numeros são iguais!")
        }
    }