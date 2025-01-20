fun main(){
    print("Digite uma letra entre A e Z: ")
    val letra = readlnOrNull()?.firstOrNull()

    if (letra != null && letra in 'A'..'Z'){
            println("voce acertou! Digitou uma letra maiscula!")
        }else{
            println("Voce teclou uma letra minuscula.")
        }
}