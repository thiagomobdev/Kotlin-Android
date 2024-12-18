fun main(){
//    Escreva um programa que verifique se um número é par ou ímpar.
    print("Digite o numero: ")
    val num = readlnOrNull()!!.toInt()
    if(num % 2 == 0){
        println("O numero é par!")
    }else{
        println("O numero é impar!")
    }
}