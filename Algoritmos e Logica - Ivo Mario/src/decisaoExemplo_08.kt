fun main(){
    print("Digite a letra consoante da palavra AULA: ")
    val letraInput = readlnOrNull()?.firstOrNull()

    if(letraInput != null){
    if(letraInput.uppercaseChar() == 'L'){
        println("Voce acertou!")
    }else{
        println("Voce errou!")
        }
    }
}

//if((letraInput == 'l') || (letraInput == 'L'))