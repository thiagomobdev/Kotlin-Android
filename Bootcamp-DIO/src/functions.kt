//Default Parameter Values and Named Arguments
//Declarando as funções fora da função principal do programa.
fun printMessage(message: String): Unit{
    println(message) //
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}
fun sum(x: Int, y: Int): Int{
    return x + y
}
fun multiply(x: Int, y: Int) = x * y

fun main(){
    print("Digite um numero inteiro: ")
    var x = readLine()?.toIntOrNull()
    print("Digite outro numero: ")
    var y = readLine()?.toIntOrNull()
    printMessage("Olá!")
    printMessageWithPrefix("Olá","Mundo")
    printMessageWithPrefix("Olá")
    printMessageWithPrefix(prefix = "Log", message = "Olá mundo!")
    println(y?.let { x?.let { it1 -> sum(it1, it) } })
    println(multiply(15,12))
}