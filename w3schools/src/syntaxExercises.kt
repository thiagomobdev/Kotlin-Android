fun main(){
//1.Crie um programa Kotlin que exiba "Hello, World!" na saída.
    println("Hello world!")
//2.Faça um programa que exiba seu nome e sua idade.
  val myName = "Thiago Borghardt"
    println("My name is: $myName")
//3.Escreva um programa que declare uma função chamada greeting() e dentro dela exiba "Bem-vindo ao Kotlin!"
    fun greeting(): String {
        val say = "Bem vindo ao Kotlin!"
        return say

    }
    println(greeting())
//4.Crie um programa que receba dois números do usuário e exiba a soma deles.
    print("Enter the first number: ")
    val numberOne = readlnOrNull()?.toInt()
    print("Enter the second number: ")
    val numberSecond = readlnOrNull()?.toInt()
    val sum = numberSecond?.let { numberOne?.plus(it) }
    println("The result is: $sum")
//5.Declare uma função que receba dois parâmetros (nome e idade)
//e exiba uma mensagem personalizada com essas informações.
    fun person(name: String, age: Int){
        println("Hello $name! You have $age years. Its is approved!")
    }
    person("Thiago", 32)
//6.Implemente um programa que leia a entrada do teclado e exiba o texto digitado
//pelo usuário em letras maiúsculas.
    print("Write any text: ")
    val text = readlnOrNull()
    println("Your text in uppercase is: ${text!!.toUpperCase()}")
//Crie um programa que contenha uma função para calcular a área de um triângulo, dado a base e a altura.
    fun area(base: Double, height: Double): Double{
        return (base * height) / 2
    }
    println(area(6.0,4.0))
//Faça um programa que valide se uma entrada é um número ou texto.
    print("Write: ")
    val writeUser = readlnOrNull() ?: ""
        val isNumber = writeUser.toIntOrNull() != null ||
                writeUser.toDoubleOrNull() != null ||
                writeUser.toFloatOrNull() != null
    if (isNumber){
        println("The value entered is NUMBER!")
    } else{
        println("The value entered is STRING!")
    }
//Escreva uma função que conte o número de vogais em uma string passada como argumento.


    fun counterVogais(text: String): Int{
        val convertLoweCase = text.toLowerCase()
        return convertLoweCase.count{it in "aeiou"}
    }
    println("The numbers of vogais in THIAGO: ${counterVogais("Thiago")}")
    println("The numbers of vogais in CAROL: ${counterVogais("CAROL")}")
    println("The numbers of vogais in EMANUEL: ${counterVogais("EMANUEL")}")
    println("The numbers of vogais in BRUCE: ${counterVogais("bruce")}")
}
