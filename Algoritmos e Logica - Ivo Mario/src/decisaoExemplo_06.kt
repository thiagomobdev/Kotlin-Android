fun main(){
    print("Digite um numero: ")
    val numero = readlnOrNull()?.toInt()

    if (numero != null) {
        if(numero < 0){
            println("O valor é menor que zero.")
        }else if (numero < 10 ){
            println("valor => 0 e < 100")
        }else if (numero < 100){
            println("Valor => 10 e < 100")
        }else{
            println("valor => 100")
        }
    }
}