fun main(){
    var num: Int
    var soma = 0

    do {
        print("Entre com um numero par inteiro: ")
        num = readLine()?.toIntOrNull() ?: 0
        soma += num
    }while (num % 2 == 0)
    println("--> A soma dos numeros digitados é: $soma")
}
