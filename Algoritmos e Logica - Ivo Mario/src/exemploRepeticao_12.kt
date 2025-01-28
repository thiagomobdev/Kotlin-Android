fun main(){
    var nCar = 0
    var nDig = 0
    var caractere: Char


    print("Escreva uma frase e encerre com <enter> : ")
    do {
       val input = readlnOrNull()
        if(input.isNullOrEmpty()) break

        //vamoos interar sobre a cadeia de caracteres
        for(c in input){
            caractere = c
            nCar++
            if(caractere in '0'.. '9'){
                nDig++
            }
        }
    }while (true)
    println("Numero total de digitos: $nDig ")
    println("Numero total de caracteres: $nCar=´=")

}