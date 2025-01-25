

fun main() {
    var nCar = 0
    var nDig = 0
    var carac: Char

    print("Digite uma frase e encerre com <enter> : ")
    while(true){
        val input = readlnOrNull()
        if (input.isNullOrEmpty()) break

        for (c in input){
            carac = c
            nCar++
            if(carac in '0'..'9'){
                nDig++
            }
        }
    }
println("Numero total de caracteres: $nCar")
println("Numero total de digitos: $nDig")


}
