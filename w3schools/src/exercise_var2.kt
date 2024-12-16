fun main(){
    //Crie um programa que converta uma variável de string para inteiro.
    var myName = "2024"
    var convertToInt = myName.toIntOrNull() ?: 0
    println("Variavel original: $myName - ${myName::class.java.simpleName}")
    println("Variavel convertida para inteiro: $convertToInt - ${convertToInt::class.java.simpleName} ")
}