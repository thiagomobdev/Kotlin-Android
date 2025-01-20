fun main(){
       print("Entre com um numero positivo menor do que 100: ")
        val numero = readlnOrNull()?.toInt()
    if((numero!! >= 0) && (numero <=100)){
        println("Voce digitou $numero, ele está entre 0 e 100. Você acertou!")
    }else{
        println("Voce digitou $numero, está errado. ")
    }
}