fun main(){
    //Inferência de tipos
    val language = "Kotlin - JetBrains"
    var tipoString: String = "Bem vindo ao Google Developer!"
    println("$tipoString Estou aprendendo a linguagem: $language")
    val b: Int = 2024
    val c = 32
    println("Estou aprendendo a programar aos $c anos e estamos em $b")
    val d: Int
    if (someCondition()){
        d = 1
    } else {
        d = 2
    }
    println(d)
    println("Digite um numero: ")
    var count = readLine()?.toIntOrNull() ?: 0  // Valor padrão 0 se for nulo

    println("You have $count messages!")
    println("You need delete one message? Y/N:")
    val delete = readLine()?.toString()?.uppercase() ?: "N"  // Melhor tratamento para entrada

    if (delete == "Y") {
        count -= 1  // Subtrai 1 da contagem
        println("You deleted one message!")
    } else {
        println("Its ok! No deleted message!")
    }

    println("You have $count message${if (count != 1) "s" else ""}.")  // Plural condicional


}


//FUNÇÃO
fun someCondition(): Boolean {
    return true

}
