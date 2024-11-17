@file:Suppress("NAME_SHADOWING")

//Return Unit
fun main(){
//val message = birthdayGreeting()
    print("Diga seu nome: ")
    val name = readlnOrNull().toString()
    print("Digite sua idade: ")
    val age = readlnOrNull()?.toIntOrNull()
    println(birthdayGreeting(name,age))
}

fun birthdayGreeting(name: String, age: Int?): String {
    val name = "Hi! Happy birthday $name"
    val age = "You have $age years!"
    return "$name \n$age"

}