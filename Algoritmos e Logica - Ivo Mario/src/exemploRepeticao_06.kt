fun main(){
    print("Digite uma letra do alfabeto: ")
    val letra = readLine()
    for(i in 'a'..'z'){
        println("Letras minusculas: $i")
    }
    for(i in 'A'.. 'Z'){
        println("Letras maisculas: $i")
    }
}