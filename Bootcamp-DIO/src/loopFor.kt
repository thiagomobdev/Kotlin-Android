fun main(){
    print("De 0 à 10 escolha um numero: ")
    val n1 = readlnOrNull()
    val cakes = listOf(1,2,3,4,5,6,7,8,9,10)

    for(cake in cakes){
        if ( n1 == cakes){
        println("You select number $cake!")
        }else{
            println("Number: $cake")
        }
    }
}



