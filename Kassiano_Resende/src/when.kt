fun main(){
    print("Digite um numero e te direi se ele é X ou não: ")
    val x = readLine()?.toIntOrNull()
    when(x){
//        1 -> print("X == 1")
//        2 -> print("X == 2")
//        else -> {
//            print("X possui outro valor!")
//        1,2 -> println("X == 1 ou X == 2 ")
//        else -> println("X possui outro valor")
        in 1..10 -> print("X está no intervalo !")
        else -> print("x esta fora do intervalo")
        }

    }
